package stock.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stock.market.model.BalanceSheet;
import stock.market.model.Company;
import stock.market.service.BalanceSheetRepository;
import stock.market.service.CompanyRepository;

@RestController
public class BalanceSheetController {
	
	@Autowired
	BalanceSheetRepository balanceSheetRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	
	@RequestMapping(value  = "company/{symbol}/balancesheet", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	BalanceSheet saveBalanceSheet(@PathVariable("symbol") String symbol, @RequestBody BalanceSheet bs) {
		Company c = companyRepository.findBySymbol(symbol);
		BalanceSheet db_bs = balanceSheetRepository.findByCompanyAndYear(c, bs.getYear());
		System.out.println("BalanceSheet from db"+ db_bs);
		if (db_bs != null) {
			System.out.println("--->" + db_bs);
			db_bs.setBonusEquityShareCapital(bs.getBonusEquityShareCapital());
			db_bs.setCapitalGoods(bs.getCapitalGoods());
			db_bs.setCapitalWorkInProgress(bs.getCapitalWorkInProgress());
			db_bs.setCashAndcashEquivalents(bs.getCashAndcashEquivalents());
			//db_bs.setCompany(c);
			db_bs.setContingentsLiabilities(bs.getContingentsLiabilities());
			db_bs.setCurrentInvestments(bs.getCurrentInvestments());
			db_bs.setCurrentInvestmentsQuotedMarkedValue(bs.getCurrentInvestmentsQuotedMarkedValue());
			db_bs.setCurrentInvestmentsUnquotedBookValue(bs.getCurrentInvestmentsUnquotedBookValue());
			db_bs.setDeferredTaxLiabilities(bs.getDeferredTaxLiabilities());
			db_bs.setDividendRemittanceInForeignCurrency(bs.getDividendRemittanceInForeignCurrency());
			db_bs.setEquityShareAndApplicationMoney(bs.getEquityShareAndApplicationMoney());
			db_bs.setEquityShareCapital(bs.getEquityShareCapital());
			db_bs.setExpenditureInForeignCurrency(bs.getExpenditureInForeignCurrency());
			db_bs.setFobValueOfGoods(bs.getFobValueOfGoods());
			db_bs.setHybridOrDebtOrOtherSecurities(bs.getHybridOrDebtOrOtherSecurities());
			db_bs.setIntangibleAssets(bs.getIntangibleAssetsUnderDevelopment());
			db_bs.setIntangibleAssetsUnderDevelopment(bs.getIntangibleAssetsUnderDevelopment());
			db_bs.setInventories(bs.getInventories());
			db_bs.setLongTermBorrowings(bs.getLongTermBorrowings());
			db_bs.setLongTermLoansAndAdvances(bs.getLongTermBorrowings());
			db_bs.setLongTermProvisions(bs.getLongTermProvisions());
			db_bs.setNonCurrentInvestments(bs.getNonCurrentInvestments());
			db_bs.setNonCurrentInvestmentsQuotedMarkedValue(bs.getNonCurrentInvestmentsQuotedMarkedValue());
			db_bs.setNonCurrentInvestmentsUnquotedBookValue(bs.getNonCurrentInvestmentsUnquotedBookValue());
			db_bs.setOtherCurrentAssets(bs.getOtherCurrentAssets());
			db_bs.setOtherCurrentLiuabilities(bs.getOtherCurrentLiuabilities());
			db_bs.setOtherEarnings(bs.getOtherEarnings());
			db_bs.setOtherLongTermLiabilities(bs.getOtherLongTermLiabilities());
			db_bs.setRawMaterials(bs.getRawMaterials());
			db_bs.setReserveAndSurplus(bs.getReserveAndSurplus());
			db_bs.setShortTermBorrowings(bs.getShortTermBorrowings());
			db_bs.setShortTermLoansAndAdvances(bs.getShortTermLoansAndAdvances());
			db_bs.setShortTermProvisions(bs.getShortTermLoansAndAdvances());
			db_bs.setStoresSparesAndLooseTools(bs.getStoresSparesAndLooseTools());
			db_bs.setTangibleAssets(bs.getTangibleAssets());
			db_bs.setTotalAssets(bs.getTotalAssets());
			db_bs.setTotalCapitalAndLiabilities(bs.getTotalCapitalAndLiabilities());
			db_bs.setTotalCurrentLiabilities(bs.getTotalCurrentLiabilities());
			db_bs.setTotalNonCurrentLiabilities(bs.getTotalNonCurrentAssets());
			db_bs.setTotalReserveAndSurplus(bs.getTotalReserveAndSurplus());
			db_bs.setTotalShareCapital(bs.getTotalShareCapital());
			db_bs.setTotalShareholdersFund(bs.getTotalShareholdersFund());
			db_bs.setTradeOrOtherGoods(bs.getTradeOrOtherGoods());
			db_bs.setTradePayables(bs.getTradePayables());
			db_bs.setTradeReceivables(bs.getTradeReceivables());
			
			return balanceSheetRepository.save(db_bs);
		}
		
		bs.setCompany(c);
		return balanceSheetRepository.save(bs);
		
	}
	
	@RequestMapping(value = "company/{symbol}/year/{year}/balancesheet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	BalanceSheet getBalanceSheet(@PathVariable("symbol")  String symbol, @PathVariable("year") int year) {
		Company c = companyRepository.findBySymbol(symbol);
		return balanceSheetRepository.findByCompanyAndYear(c, year);
	}
}
