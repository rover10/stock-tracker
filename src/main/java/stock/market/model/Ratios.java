package stock.market.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"quarter","year", "company_id"}))
public class Ratios {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	private Integer year;
	@NotNull
	private Integer quarter;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Company company;

	//PER SHARE RATIOS
	private Float basicEps;
	private Float dilutedEps;
	private Float cashEps;
	private Float bookValueExclRevalReserveOrShare;
	private Float bookValueInclRevalReserveShare;
	private Float dividendPerShare;
	private Float revenueFromOperationsPerShare;
	private Float pbditPerShare;
	private Float pbitPerShare;
	private Float netProfitPerShare;
	
	//PROFITIBALITY RATIOS
	private Float pbditMarginPercent;
	private Float pbitMarginPercent;
	private Float pbtMarginPercent;
	private Float netProfitMarginPercent;
	private Float returnOnNetworthPerEquityPercent;
	private Float returnOnCapitalEmployedPercent;
	private Float returnOnAssetsPercent;
	private Float totalDebtPerEquityRatio;
	private Float assetTurnoverRatioPercent;
	
	//LIQUIDITY RATIOS
	private Float currentRatio;
	private Float quickRatio;
	private Float inventoryTurnoverRatio;
	private Float dividendPayoutRatioNpPercent;
	private Float dividendPayoutRatioCpPercent;
	private Float earningRetentionRatioPercent;
	private Float cashEarningRetentionRatioPercent;
	
	//VALUATION RATIOS(Cr)
	private Float enterpriseValue;
	private Float evOrNetOperatingRevenue;
	private Float evOrEbitda;
	private Float marketCapOrNetOperatingRevenue;
	private Float retentionRatiosPercent;
	private Float pricePerbv;
	private Float earningsYields;
		
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Float  getBasicEps() {
		return basicEps;
	}
	public void setBasicEps(float basicEps) {
		this.basicEps = basicEps;
	}
	public Float  getDilutedEps() {
		return dilutedEps;
	}
	public void setDilutedEps(float dilutedEps) {
		this.dilutedEps = dilutedEps;
	}
	public Float  getCashEps() {
		return cashEps;
	}
	public void setCashEps(float cashEps) {
		this.cashEps = cashEps;
	}
	public Float  getBookValueExclRevalReserveOrShare() {
		return bookValueExclRevalReserveOrShare;
	}
	public void setBookValueExclRevalReserveOrShare(float bookValueExclRevalReserveOrShare) {
		this.bookValueExclRevalReserveOrShare = bookValueExclRevalReserveOrShare;
	}
	public Float  getBookValueInclRevalReserveShare() {
		return bookValueInclRevalReserveShare;
	}
	public void setBookValueInclRevalReserveShare(float bookValueInclRevalReserveShare) {
		this.bookValueInclRevalReserveShare = bookValueInclRevalReserveShare;
	}
	public Float  getDividendPerShare() {
		return dividendPerShare;
	}
	public void setDividendPerShare(float dividendPerShare) {
		this.dividendPerShare = dividendPerShare;
	}
	public Float  getRevenueFromOperationsPerShare() {
		return revenueFromOperationsPerShare;
	}
	public void setRevenueFromOperationsPerShare(float revenueFromOperationsPerShare) {
		this.revenueFromOperationsPerShare = revenueFromOperationsPerShare;
	}
	public Float  getPbditPerShare() {
		return pbditPerShare;
	}
	public void setPbditPerShare(float pbditPerShare) {
		this.pbditPerShare = pbditPerShare;
	}
	public Float  getPbitPerShare() {
		return pbitPerShare;
	}
	public void setPbitPerShare(float pbitPerShare) {
		this.pbitPerShare = pbitPerShare;
	}
	public Float  getNetProfitPerShare() {
		return netProfitPerShare;
	}
	public void setNetProfitPerShare(float netProfitPerShare) {
		this.netProfitPerShare = netProfitPerShare;
	}
	public Float  getPbditMarginPercent() {
		return pbditMarginPercent;
	}
	public void setPbditMarginPercent(float pbditMarginPercent) {
		this.pbditMarginPercent = pbditMarginPercent;
	}
	public Float  getPbitMarginPercent() {
		return pbitMarginPercent;
	}
	public void setPbitMarginPercent(float pbitMarginPercent) {
		this.pbitMarginPercent = pbitMarginPercent;
	}
	public Float  getPbtMarginPercent() {
		return pbtMarginPercent;
	}
	public void setPbtMarginPercent(float pbtMarginPercent) {
		this.pbtMarginPercent = pbtMarginPercent;
	}
	public Float  getNetProfitMarginPercent() {
		return netProfitMarginPercent;
	}
	public void setNetProfitMarginPercent(float netProfitMarginPercent) {
		this.netProfitMarginPercent = netProfitMarginPercent;
	}
	public Float  getReturnOnNetworthPerEquityPercent() {
		return returnOnNetworthPerEquityPercent;
	}
	public void setReturnOnNetworthPerEquityPercent(float returnOnNetworthPerEquityPercent) {
		this.returnOnNetworthPerEquityPercent = returnOnNetworthPerEquityPercent;
	}
	public Float  getReturnOnCapitalEmployedPercent() {
		return returnOnCapitalEmployedPercent;
	}
	public void setReturnOnCapitalEmployedPercent(float returnOnCapitalEmployedPercent) {
		this.returnOnCapitalEmployedPercent = returnOnCapitalEmployedPercent;
	}
	public Float  getReturnOnAssetsPercent() {
		return returnOnAssetsPercent;
	}
	public void setReturnOnAssetsPercent(float returnOnAssetsPercent) {
		this.returnOnAssetsPercent = returnOnAssetsPercent;
	}
	public Float  getTotalDebtPerEquityRatio() {
		return totalDebtPerEquityRatio;
	}
	public void setTotalDebtPerEquityRatio(float totalDebtPerEquityRatio) {
		this.totalDebtPerEquityRatio = totalDebtPerEquityRatio;
	}
	public Float  getAssetTurnoverRatioPercent() {
		return assetTurnoverRatioPercent;
	}
	public void setAssetTurnoverRatioPercent(float assetTurnoverRatioPercent) {
		this.assetTurnoverRatioPercent = assetTurnoverRatioPercent;
	}
	public Float  getCurrentRatio() {
		return currentRatio;
	}
	public void setCurrentRatio(float currentRatio) {
		this.currentRatio = currentRatio;
	}
	public Float  getQuickRatio() {
		return quickRatio;
	}
	public void setQuickRatio(float quickRatio) {
		this.quickRatio = quickRatio;
	}
	public Float  getInventoryTurnoverRatio() {
		return inventoryTurnoverRatio;
	}
	public void setInventoryTurnoverRatio(float inventoryTurnoverRatio) {
		this.inventoryTurnoverRatio = inventoryTurnoverRatio;
	}
	public Float  getDividendPayoutRatioNpPercent() {
		return dividendPayoutRatioNpPercent;
	}
	public void setDividendPayoutRatioNpPercent(float dividendPayoutRatioNpPercent) {
		this.dividendPayoutRatioNpPercent = dividendPayoutRatioNpPercent;
	}
	public Float  getDividendPayoutRatioCpPercent() {
		return dividendPayoutRatioCpPercent;
	}
	public void setDividendPayoutRatioCpPercent(float dividendPayoutRatioCpPercent) {
		this.dividendPayoutRatioCpPercent = dividendPayoutRatioCpPercent;
	}
	public Float  getEarningRetentionRatioPercent() {
		return earningRetentionRatioPercent;
	}
	public void setEarningRetentionRatioPercent(float earningRetentionRatioPercent) {
		this.earningRetentionRatioPercent = earningRetentionRatioPercent;
	}
	public Float  getCashEarningRetentionRatioPercent() {
		return cashEarningRetentionRatioPercent;
	}
	public void setCashEarningRetentionRatioPercent(float cashEarningRetentionRatioPercent) {
		this.cashEarningRetentionRatioPercent = cashEarningRetentionRatioPercent;
	}
	public Float  getEnterpriseValue() {
		return enterpriseValue;
	}
	public void setEnterpriseValue(float enterpriseValue) {
		this.enterpriseValue = enterpriseValue;
	}
	public Float  getEvOrNetOperatingRevenue() {
		return evOrNetOperatingRevenue;
	}
	public void setEvOrNetOperatingRevenue(float evOrNetOperatingRevenue) {
		this.evOrNetOperatingRevenue = evOrNetOperatingRevenue;
	}
	public Float  getEvOrEbitda() {
		return evOrEbitda;
	}
	public void setEvOrEbitda(float evOrEbitda) {
		this.evOrEbitda = evOrEbitda;
	}
	public Float  getMarketCapOrNetOperatingRevenue() {
		return marketCapOrNetOperatingRevenue;
	}
	public void setMarketCapOrNetOperatingRevenue(float marketCapOrNetOperatingRevenue) {
		this.marketCapOrNetOperatingRevenue = marketCapOrNetOperatingRevenue;
	}
	public Float  getRetentionRatiosPercent() {
		return retentionRatiosPercent;
	}
	public void setRetentionRatiosPercent(float retentionRatiosPercent) {
		this.retentionRatiosPercent = retentionRatiosPercent;
	}
	public Float  getPricePerbv() {
		return pricePerbv;
	}
	public void setPricePerbv(float pricePerbv) {
		this.pricePerbv = pricePerbv;
	}
	public Float  getEarningsYields() {
		return earningsYields;
	}
	public void setEarningsYields(float earningsYields) {
		this.earningsYields = earningsYields;
	}
	public Integer getQuarter() {
		return quarter;
	}
	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

}
