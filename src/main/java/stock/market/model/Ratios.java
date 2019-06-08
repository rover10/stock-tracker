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
	private int id;
	
	@NotNull
	private int year;
	@NotNull
	private int quarter;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Company company;

	//PER SHARE RATIOS
	private float basicEps;
	private float dilutedEps;
	private float cashEps;
	private float bookValueExclRevalReserveOrShare;
	private float bookValueInclRevalReserveShare;
	private float dividendPerShare;
	private float revenueFromOperationsPerShare;
	private float pbditPerShare;
	private float pbitPerShare;
	private float netProfitPerShare;
	
	//PROFITIBALITY RATIOS
	private float pbditMarginPercent;
	private float pbitMarginPercent;
	private float pbtMarginPercent;
	private float netProfitMarginPercent;
	private float returnOnNetworthPerEquityPercent;
	private float returnOnCapitalEmployedPercent;
	private float returnOnAssetsPercent;
	private float totalDebtPerEquityRatio;
	private float assetTurnoverRatioPercent;
	
	//LIQUIDITY RATIOS
	private float currentRatio;
	private float quickRatio;
	private float inventoryTurnoverRatio;
	private float dividendPayoutRatioNpPercent;
	private float dividendPayoutRatioCpPercent;
	private float earningRetentionRatioPercent;
	private float cashEarningRetentionRatioPercent;
	
	//VALUATION RATIOS(Cr)
	private float enterpriseValue;
	private float evOrNetOperatingRevenue;
	private float evOrEbitda;
	private float marketCapOrNetOperatingRevenue;
	private float retentionRatiosPercent;
	private float pricePerbv;
	private float earningsYields;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
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
	public float getBasicEps() {
		return basicEps;
	}
	public void setBasicEps(float basicEps) {
		this.basicEps = basicEps;
	}
	public float getDilutedEps() {
		return dilutedEps;
	}
	public void setDilutedEps(float dilutedEps) {
		this.dilutedEps = dilutedEps;
	}
	public float getCashEps() {
		return cashEps;
	}
	public void setCashEps(float cashEps) {
		this.cashEps = cashEps;
	}
	public float getBookValueExclRevalReserveOrShare() {
		return bookValueExclRevalReserveOrShare;
	}
	public void setBookValueExclRevalReserveOrShare(float bookValueExclRevalReserveOrShare) {
		this.bookValueExclRevalReserveOrShare = bookValueExclRevalReserveOrShare;
	}
	public float getBookValueInclRevalReserveShare() {
		return bookValueInclRevalReserveShare;
	}
	public void setBookValueInclRevalReserveShare(float bookValueInclRevalReserveShare) {
		this.bookValueInclRevalReserveShare = bookValueInclRevalReserveShare;
	}
	public float getDividendPerShare() {
		return dividendPerShare;
	}
	public void setDividendPerShare(float dividendPerShare) {
		this.dividendPerShare = dividendPerShare;
	}
	public float getRevenueFromOperationsPerShare() {
		return revenueFromOperationsPerShare;
	}
	public void setRevenueFromOperationsPerShare(float revenueFromOperationsPerShare) {
		this.revenueFromOperationsPerShare = revenueFromOperationsPerShare;
	}
	public float getPbditPerShare() {
		return pbditPerShare;
	}
	public void setPbditPerShare(float pbditPerShare) {
		this.pbditPerShare = pbditPerShare;
	}
	public float getPbitPerShare() {
		return pbitPerShare;
	}
	public void setPbitPerShare(float pbitPerShare) {
		this.pbitPerShare = pbitPerShare;
	}
	public float getNetProfitPerShare() {
		return netProfitPerShare;
	}
	public void setNetProfitPerShare(float netProfitPerShare) {
		this.netProfitPerShare = netProfitPerShare;
	}
	public float getPbditMarginPercent() {
		return pbditMarginPercent;
	}
	public void setPbditMarginPercent(float pbditMarginPercent) {
		this.pbditMarginPercent = pbditMarginPercent;
	}
	public float getPbitMarginPercent() {
		return pbitMarginPercent;
	}
	public void setPbitMarginPercent(float pbitMarginPercent) {
		this.pbitMarginPercent = pbitMarginPercent;
	}
	public float getPbtMarginPercent() {
		return pbtMarginPercent;
	}
	public void setPbtMarginPercent(float pbtMarginPercent) {
		this.pbtMarginPercent = pbtMarginPercent;
	}
	public float getNetProfitMarginPercent() {
		return netProfitMarginPercent;
	}
	public void setNetProfitMarginPercent(float netProfitMarginPercent) {
		this.netProfitMarginPercent = netProfitMarginPercent;
	}
	public float getReturnOnNetworthPerEquityPercent() {
		return returnOnNetworthPerEquityPercent;
	}
	public void setReturnOnNetworthPerEquityPercent(float returnOnNetworthPerEquityPercent) {
		this.returnOnNetworthPerEquityPercent = returnOnNetworthPerEquityPercent;
	}
	public float getReturnOnCapitalEmployedPercent() {
		return returnOnCapitalEmployedPercent;
	}
	public void setReturnOnCapitalEmployedPercent(float returnOnCapitalEmployedPercent) {
		this.returnOnCapitalEmployedPercent = returnOnCapitalEmployedPercent;
	}
	public float getReturnOnAssetsPercent() {
		return returnOnAssetsPercent;
	}
	public void setReturnOnAssetsPercent(float returnOnAssetsPercent) {
		this.returnOnAssetsPercent = returnOnAssetsPercent;
	}
	public float getTotalDebtPerEquityRatio() {
		return totalDebtPerEquityRatio;
	}
	public void setTotalDebtPerEquityRatio(float totalDebtPerEquityRatio) {
		this.totalDebtPerEquityRatio = totalDebtPerEquityRatio;
	}
	public float getAssetTurnoverRatioPercent() {
		return assetTurnoverRatioPercent;
	}
	public void setAssetTurnoverRatioPercent(float assetTurnoverRatioPercent) {
		this.assetTurnoverRatioPercent = assetTurnoverRatioPercent;
	}
	public float getCurrentRatio() {
		return currentRatio;
	}
	public void setCurrentRatio(float currentRatio) {
		this.currentRatio = currentRatio;
	}
	public float getQuickRatio() {
		return quickRatio;
	}
	public void setQuickRatio(float quickRatio) {
		this.quickRatio = quickRatio;
	}
	public float getInventoryTurnoverRatio() {
		return inventoryTurnoverRatio;
	}
	public void setInventoryTurnoverRatio(float inventoryTurnoverRatio) {
		this.inventoryTurnoverRatio = inventoryTurnoverRatio;
	}
	public float getDividendPayoutRatioNpPercent() {
		return dividendPayoutRatioNpPercent;
	}
	public void setDividendPayoutRatioNpPercent(float dividendPayoutRatioNpPercent) {
		this.dividendPayoutRatioNpPercent = dividendPayoutRatioNpPercent;
	}
	public float getDividendPayoutRatioCpPercent() {
		return dividendPayoutRatioCpPercent;
	}
	public void setDividendPayoutRatioCpPercent(float dividendPayoutRatioCpPercent) {
		this.dividendPayoutRatioCpPercent = dividendPayoutRatioCpPercent;
	}
	public float getEarningRetentionRatioPercent() {
		return earningRetentionRatioPercent;
	}
	public void setEarningRetentionRatioPercent(float earningRetentionRatioPercent) {
		this.earningRetentionRatioPercent = earningRetentionRatioPercent;
	}
	public float getCashEarningRetentionRatioPercent() {
		return cashEarningRetentionRatioPercent;
	}
	public void setCashEarningRetentionRatioPercent(float cashEarningRetentionRatioPercent) {
		this.cashEarningRetentionRatioPercent = cashEarningRetentionRatioPercent;
	}
	public float getEnterpriseValue() {
		return enterpriseValue;
	}
	public void setEnterpriseValue(float enterpriseValue) {
		this.enterpriseValue = enterpriseValue;
	}
	public float getEvOrNetOperatingRevenue() {
		return evOrNetOperatingRevenue;
	}
	public void setEvOrNetOperatingRevenue(float evOrNetOperatingRevenue) {
		this.evOrNetOperatingRevenue = evOrNetOperatingRevenue;
	}
	public float getEvOrEbitda() {
		return evOrEbitda;
	}
	public void setEvOrEbitda(float evOrEbitda) {
		this.evOrEbitda = evOrEbitda;
	}
	public float getMarketCapOrNetOperatingRevenue() {
		return marketCapOrNetOperatingRevenue;
	}
	public void setMarketCapOrNetOperatingRevenue(float marketCapOrNetOperatingRevenue) {
		this.marketCapOrNetOperatingRevenue = marketCapOrNetOperatingRevenue;
	}
	public float getRetentionRatiosPercent() {
		return retentionRatiosPercent;
	}
	public void setRetentionRatiosPercent(float retentionRatiosPercent) {
		this.retentionRatiosPercent = retentionRatiosPercent;
	}
	public float getPricePerbv() {
		return pricePerbv;
	}
	public void setPricePerbv(float pricePerbv) {
		this.pricePerbv = pricePerbv;
	}
	public float getEarningsYields() {
		return earningsYields;
	}
	public void setEarningsYields(float earningsYields) {
		this.earningsYields = earningsYields;
	}
	public int getQuarter() {
		return quarter;
	}
	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

}
