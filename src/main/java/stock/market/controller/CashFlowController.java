package stock.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stock.market.model.CashFlow;
import stock.market.model.Company;
import stock.market.service.CashFlowRepository;
import stock.market.service.CompanyRepository;

@RestController
public class CashFlowController {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	CashFlowRepository cashFlowRepository;
	
	@RequestMapping(value = "company/{company}/cashflow", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	CashFlow saveCompanyCashFlow(@RequestBody CashFlow cf, @PathVariable("company") String company) {
		Company c = companyRepository.findBySymbol(company);
		CashFlow db_cf = cashFlowRepository.findByCompanyAndYear(c, cf.getYear());
		if (db_cf != null) {
			db_cf.setCashAndcashEquivalentsBeginOfyear(cf.getCashAndcashEquivalentsBeginOfyear());
			db_cf.setCashAndCashEquivalentsEndOfYear(cf.getCashAndCashEquivalentsEndOfYear());
			db_cf.setForeignExchangeGainsOrLosses(cf.getForeignExchangeGainsOrLosses());
			db_cf.setNetCashFlowFromOperatingActivities(cf.getNetCashFlowFromOperatingActivities());
			db_cf.setNetCashUsedInInvestingActivities(cf.getNetCashUsedInInvestingActivities());
			db_cf.setNetIncreaseOrDecreaseInCashAndCashEquivalents(cf.getNetIncreaseOrDecreaseInCashAndCashEquivalents());
			db_cf.setUnitMutiplier(cf.getUnitMutiplier());
			db_cf.setYear(cf.getYear());
			db_cf.setQuarter(cf.getQuarter());
			return cashFlowRepository.save(db_cf);
		}
		cf.setCompany(c);
		return cashFlowRepository.save(cf);
	}
	
	@RequestMapping(value = "company/{company}/year/{year}/cashflow", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	CashFlow getCashFlow(@PathVariable("company") String company, @PathVariable("year") int year) {
		Company c = companyRepository.findBySymbol(company);
		return cashFlowRepository.findByCompanyAndYear(c, year);
	}
}
