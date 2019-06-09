package stock.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stock.market.model.Company;
import stock.market.model.Ratios;
import stock.market.service.CompanyRepository;
import stock.market.service.RatioRepository;

@RestController
public class RatioController {
	@Autowired
	RatioRepository ratioRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	@RequestMapping(value = "company/{symbol}/ratios", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Ratios saveCompanyRatio(@PathVariable("symbol") String symbol,  @RequestBody Ratios cr) {
		Company c = this.companyRepository.findBySymbol(symbol);
		Ratios rc = ratioRepository.findByCompanyAndYearAndQuarter(c,cr.getYear(), cr.getQuarter());
		if (rc != null ) {
			rc.setAssetTurnoverRatioPercent(cr.getAssetTurnoverRatioPercent());
			rc.setReturnOnAssetsPercent(cr.getBasicEps());
			rc.setAssetTurnoverRatioPercent(cr.getBookValueExclRevalReserveOrShare());
			rc.setBasicEps(cr.getBasicEps());
			rc.setBookValueExclRevalReserveOrShare(cr.getBookValueExclRevalReserveOrShare());
			rc.setBookValueInclRevalReserveShare(cr.getBookValueInclRevalReserveShare());
			rc.setCashEarningRetentionRatioPercent(cr.getCashEarningRetentionRatioPercent());
			rc.setCashEps(cr.getCashEps());
			//rc.setCompany(cr.getCompany());
			rc.setCurrentRatio(cr.getCurrentRatio());
			rc.setDilutedEps(cr.getDilutedEps());
			rc.setDividendPayoutRatioCpPercent(cr.getDividendPayoutRatioCpPercent());
			rc.setDividendPayoutRatioNpPercent(cr.getDividendPayoutRatioNpPercent());
			rc.setDividendPerShare(cr.getDividendPerShare());
			rc.setEarningRetentionRatioPercent(cr.getEarningRetentionRatioPercent());
			rc.setEarningsYields(cr.getEarningsYields());
			rc.setEnterpriseValue(cr.getEnterpriseValue());
			rc.setEvOrEbitda(cr.getEvOrEbitda());
			rc.setEvOrNetOperatingRevenue(cr.getEvOrNetOperatingRevenue());
			//rc.setId(cr.getId());
			rc.setInventoryTurnoverRatio(cr.getInventoryTurnoverRatio());
			rc.setMarketCapOrNetOperatingRevenue(cr.getMarketCapOrNetOperatingRevenue());
			rc.setNetProfitMarginPercent(cr.getNetProfitMarginPercent());
			rc.setNetProfitPerShare(cr.getNetProfitPerShare());
			rc.setPbditMarginPercent(cr.getPbditMarginPercent());
			rc.setPbditPerShare(cr.getPbditPerShare());
			rc.setPbitMarginPercent(cr.getPbitMarginPercent());
			rc.setPbitPerShare(cr.getPbitPerShare());
			rc.setPbtMarginPercent(cr.getPbtMarginPercent());
			rc.setPricePerbv(cr.getPricePerbv());
			//rc.setQuarter(cr.getQuarter());
			rc.setQuickRatio(cr.getQuickRatio());
			rc.setRetentionRatiosPercent(cr.getRetentionRatiosPercent());
			rc.setReturnOnAssetsPercent(cr.getReturnOnAssetsPercent());
			rc.setReturnOnCapitalEmployedPercent(cr.getReturnOnCapitalEmployedPercent());
			rc.setReturnOnNetworthPerEquityPercent(cr.getReturnOnNetworthPerEquityPercent());
			rc.setRevenueFromOperationsPerShare(cr.getRevenueFromOperationsPerShare());
			rc.setTotalDebtPerEquityRatio(cr.getTotalDebtPerEquityRatio());
			//rc.setYear(cr.getYear());
		} else {
			System.out.println("DOES NOT EXIST!!");
			cr.setCompany(c);
			return ratioRepository.save(cr);
		}
		System.out.println("EXIST!!");
		return ratioRepository.save(rc);
	}
	
	@RequestMapping(value = "company/{company}/year/{year}/quarter/{quarter}/ratios", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Ratios getCompanyRatio(@PathVariable("company") String company, @PathVariable("year") int year, @PathVariable("quarter") int quarter){
		Company c = companyRepository.findBySymbol(company);
		return ratioRepository.findByCompanyAndYearAndQuarter(c, year, quarter);
	}
}
