package stock.market.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames= {"year","company_id"}))
public class BalanceSheet {
	//COMPANY
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	//BALANCESHEET YEAR
	private Integer year;
	
	private Double equityShareCapital;
	private Double totalShareCapital;
	
	private Double reserveAndSurplus;
	private Double totalReserveAndSurplus;
	private Double totalShareholdersFund;
	
	private Double equityShareAndApplicationMoney;
	private Double hybridOrDebtOrOtherSecurities;
	
	//NON-CURRENT LIABILITIES
	private Double longTermBorrowings;
	private Double deferredTaxLiabilities;
	private Double otherLongTermLiabilities;
	private Double longTermProvisions;
	private Double totalNonCurrentLiabilities;
	
	//CURRENT LIABILITIES
	private Double shortTermBorrowings;
	private Double tradePayables;
	private Double otherCurrentLiuabilities;
	private Double shortTermProvisions;
	private Double totalCurrentLiabilities;
	private Double totalCapitalAndLiabilities;
	
	//ASSETS
	//NON_CURRENT ASSETS
	private Double tangibleAssets;
	private Double intangibleAssets;
	private Double capitalWorkInProgress;
	private Double intangibleAssetsUnderDevelopment;
	
	//FIXED ASSETS
	private Double nonCurrentInvestments;
	private Double longTermLoansAndAdvances;
	private Double otherNonCurrentAssets;
	private Double  totalNonCurrentAssets;
	
	//CURRENT ASSETS
	private Double currentInvestments;
	private Double inventories;
	private Double tradeReceivables;
	private Double cashAndcashEquivalents;
	private Double shortTermLoansAndAdvances;
	private Double otherCurrentAssets;
	
	private Double totalCurrentAsets;
	private Double totalAssets;
	
	//OTHER ADDITIONAL INFORMATION
	private Double contingentsLiabilities;
	
	//CIF VALUE OF IMPORTS
	private Double rawMaterials;
	private Double storesSparesAndLooseTools;
	private Double tradeOrOtherGoods;
	private Double capitalGoods;
	
	//EXPENDITURE IN FOREIGN EXCHANGE
	private Double expenditureInForeignCurrency;
	
	// REMITTANCES IN FOREIGN CURRENCIES FOR DIVIDENDS
	private Double dividendRemittanceInForeignCurrency;
	
	//EARNINGS IN FOREIGN CURRENCIES FOR DIVIDENDS
	private Double FOBValueOfGoods;
	private Double otherEarnings;
	
	//BONUS DETAILS
	private Double bonusEquityShareCapital;
	
	//NON-CURRENT INVESTMENTS
	private Double nonCurrentInvestmentsQuotedMarkedValue;
	private Double nonCurrentInvestmentsUnquotedBookValue;
	
	//CURRENT INVESTMENTS
	private Double currentInvestmentsQuotedMarkedValue;
	private Double currentInvestmentsUnquotedBookValue;
	
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
	public Double getEquityShareCapital() {
		return equityShareCapital;
	}
	public void setEquityShareCapital(double equityShareCapital) {
		this.equityShareCapital = equityShareCapital;
	}
	public Double getTotalShareCapital() {
		return totalShareCapital;
	}
	public void setTotalShareCapital(double totalShareCapital) {
		this.totalShareCapital = totalShareCapital;
	}
	public Double getReserveAndSurplus() {
		return reserveAndSurplus;
	}
	public void setReserveAndSurplus(double reserveAndSurplus) {
		this.reserveAndSurplus = reserveAndSurplus;
	}
	public Double getTotalReserveAndSurplus() {
		return totalReserveAndSurplus;
	}
	public void setTotalReserveAndSurplus(double totalReserveAndSurplus) {
		this.totalReserveAndSurplus = totalReserveAndSurplus;
	}
	public Double getTotalShareholdersFund() {
		return totalShareholdersFund;
	}
	public void setTotalShareholdersFund(double totalShareholdersFund) {
		this.totalShareholdersFund = totalShareholdersFund;
	}
	public Double getEquityShareAndApplicationMoney() {
		return equityShareAndApplicationMoney;
	}
	public void setEquityShareAndApplicationMoney(double equityShareAndApplicationMoney) {
		this.equityShareAndApplicationMoney = equityShareAndApplicationMoney;
	}
	public Double getHybridOrDebtOrOtherSecurities() {
		return hybridOrDebtOrOtherSecurities;
	}
	public void setHybridOrDebtOrOtherSecurities(double hybridOrDebtOrOtherSecurities) {
		this.hybridOrDebtOrOtherSecurities = hybridOrDebtOrOtherSecurities;
	}
	public Double getLongTermBorrowings() {
		return longTermBorrowings;
	}
	public void setLongTermBorrowings(double longTermBorrowings) {
		this.longTermBorrowings = longTermBorrowings;
	}
	public Double getDeferredTaxLiabilities() {
		return deferredTaxLiabilities;
	}
	public void setDeferredTaxLiabilities(double deferredTaxLiabilities) {
		this.deferredTaxLiabilities = deferredTaxLiabilities;
	}
	public Double getOtherLongTermLiabilities() {
		return otherLongTermLiabilities;
	}
	public void setOtherLongTermLiabilities(double otherLongTermLiabilities) {
		this.otherLongTermLiabilities = otherLongTermLiabilities;
	}
	public Double getLongTermProvisions() {
		return longTermProvisions;
	}
	public void setLongTermProvisions(double longTermProvisions) {
		this.longTermProvisions = longTermProvisions;
	}
	public Double getTotalNonCurrentLiabilities() {
		return totalNonCurrentLiabilities;
	}
	public void setTotalNonCurrentLiabilities(double totalNonCurrentLiabilities) {
		this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
	}
	public Double getShortTermBorrowings() {
		return shortTermBorrowings;
	}
	public void setShortTermBorrowings(double shortTermBorrowings) {
		this.shortTermBorrowings = shortTermBorrowings;
	}
	public Double getTradePayables() {
		return tradePayables;
	}
	public void setTradePayables(double tradePayables) {
		this.tradePayables = tradePayables;
	}
	public Double getOtherCurrentLiuabilities() {
		return otherCurrentLiuabilities;
	}
	public void setOtherCurrentLiuabilities(double otherCurrentLiuabilities) {
		this.otherCurrentLiuabilities = otherCurrentLiuabilities;
	}
	public Double getShortTermProvisions() {
		return shortTermProvisions;
	}
	public void setShortTermProvisions(double shortTermProvisions) {
		this.shortTermProvisions = shortTermProvisions;
	}
	public Double getTotalCurrentLiabilities() {
		return totalCurrentLiabilities;
	}
	public void setTotalCurrentLiabilities(double totalCurrentLiabilities) {
		this.totalCurrentLiabilities = totalCurrentLiabilities;
	}
	public Double getTotalCapitalAndLiabilities() {
		return totalCapitalAndLiabilities;
	}
	public void setTotalCapitalAndLiabilities(double totalCapitalAndLiabilities) {
		this.totalCapitalAndLiabilities = totalCapitalAndLiabilities;
	}
	public Double getTangibleAssets() {
		return tangibleAssets;
	}
	public void setTangibleAssets(double tangibleAssets) {
		this.tangibleAssets = tangibleAssets;
	}
	public Double getIntangibleAssets() {
		return intangibleAssets;
	}
	public void setIntangibleAssets(double intangibleAssets) {
		this.intangibleAssets = intangibleAssets;
	}
	public Double getCapitalWorkInProgress() {
		return capitalWorkInProgress;
	}
	public void setCapitalWorkInProgress(double capitalWorkInProgress) {
		this.capitalWorkInProgress = capitalWorkInProgress;
	}
	public Double getIntangibleAssetsUnderDevelopment() {
		return intangibleAssetsUnderDevelopment;
	}
	public void setIntangibleAssetsUnderDevelopment(double intangibleAssetsUnderDevelopment) {
		this.intangibleAssetsUnderDevelopment = intangibleAssetsUnderDevelopment;
	}
	public Double getNonCurrentInvestments() {
		return nonCurrentInvestments;
	}
	public void setNonCurrentInvestments(double nonCurrentInvestments) {
		this.nonCurrentInvestments = nonCurrentInvestments;
	}
	public Double getLongTermLoansAndAdvances() {
		return longTermLoansAndAdvances;
	}
	public void setLongTermLoansAndAdvances(double longTermLoansAndAdvances) {
		this.longTermLoansAndAdvances = longTermLoansAndAdvances;
	}
	public Double getOtherNonCurrentAssets() {
		return otherNonCurrentAssets;
	}
	public void setOtherNonCurrentAssets(double otherNonCurrentAssets) {
		this.otherNonCurrentAssets = otherNonCurrentAssets;
	}
	public Double getTotalNonCurrentAssets() {
		return totalNonCurrentAssets;
	}
	public void setTotalNonCurrentAssets(double totalNonCurrentAssets) {
		this.totalNonCurrentAssets = totalNonCurrentAssets;
	}
	public Double getCurrentInvestments() {
		return currentInvestments;
	}
	public void setCurrentInvestments(double currentInvestments) {
		this.currentInvestments = currentInvestments;
	}
	public Double getInventories() {
		return inventories;
	}
	public void setInventories(double inventories) {
		this.inventories = inventories;
	}
	public Double getTradeReceivables() {
		return tradeReceivables;
	}
	public void setTradeReceivables(double tradeReceivables) {
		this.tradeReceivables = tradeReceivables;
	}
	public Double getCashAndcashEquivalents() {
		return cashAndcashEquivalents;
	}
	public void setCashAndcashEquivalents(double cashAndcashEquivalents) {
		this.cashAndcashEquivalents = cashAndcashEquivalents;
	}
	public Double getShortTermLoansAndAdvances() {
		return shortTermLoansAndAdvances;
	}
	public void setShortTermLoansAndAdvances(double shortTermLoansAndAdvances) {
		this.shortTermLoansAndAdvances = shortTermLoansAndAdvances;
	}
	public Double getOtherCurrentAssets() {
		return otherCurrentAssets;
	}
	public void setOtherCurrentAssets(double otherCurrentAssets) {
		this.otherCurrentAssets = otherCurrentAssets;
	}
	public Double getTotalCurrentAsets() {
		return totalCurrentAsets;
	}
	public void setTotalCurrentAsets(double totalCurrentAsets) {
		this.totalCurrentAsets = totalCurrentAsets;
	}
	public Double getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(double totalAssets) {
		this.totalAssets = totalAssets;
	}
	public Double getContingentsLiabilities() {
		return contingentsLiabilities;
	}
	public void setContingentsLiabilities(double contingentsLiabilities) {
		this.contingentsLiabilities = contingentsLiabilities;
	}
	public Double getRawMaterials() {
		return rawMaterials;
	}
	public void setRawMaterials(double rawMaterials) {
		this.rawMaterials = rawMaterials;
	}
	public Double getStoresSparesAndLooseTools() {
		return storesSparesAndLooseTools;
	}
	public void setStoresSparesAndLooseTools(double storesSparesAndLooseTools) {
		this.storesSparesAndLooseTools = storesSparesAndLooseTools;
	}
	public Double getTradeOrOtherGoods() {
		return tradeOrOtherGoods;
	}
	public void setTradeOrOtherGoods(double tradeOrOtherGoods) {
		this.tradeOrOtherGoods = tradeOrOtherGoods;
	}
	public Double getCapitalGoods() {
		return capitalGoods;
	}
	public void setCapitalGoods(double capitalGoods) {
		this.capitalGoods = capitalGoods;
	}
	public Double getExpenditureInForeignCurrency() {
		return expenditureInForeignCurrency;
	}
	public void setExpenditureInForeignCurrency(double expenditureInForeignCurrency) {
		this.expenditureInForeignCurrency = expenditureInForeignCurrency;
	}
	public Double getDividendRemittanceInForeignCurrency() {
		return dividendRemittanceInForeignCurrency;
	}
	public void setDividendRemittanceInForeignCurrency(double dividendRemittanceInForeignCurrency) {
		this.dividendRemittanceInForeignCurrency = dividendRemittanceInForeignCurrency;
	}
	public Double getFOBValueOfGoods() {
		return FOBValueOfGoods;
	}
	public void setFOBValueOfGoods(double fOBValueOfGoods) {
		FOBValueOfGoods = fOBValueOfGoods;
	}
	public Double getOtherEarnings() {
		return otherEarnings;
	}
	public void setOtherEarnings(double otherEarnings) {
		this.otherEarnings = otherEarnings;
	}
	public Double getBonusEquityShareCapital() {
		return bonusEquityShareCapital;
	}
	public void setBonusEquityShareCapital(double bonusEquityShareCapital) {
		this.bonusEquityShareCapital = bonusEquityShareCapital;
	}
	public Double getNonCurrentInvestmentsQuotedMarkedValue() {
		return nonCurrentInvestmentsQuotedMarkedValue;
	}
	public void setNonCurrentInvestmentsQuotedMarkedValue(double nonCurrentInvestmentsQuotedMarkedValue) {
		this.nonCurrentInvestmentsQuotedMarkedValue = nonCurrentInvestmentsQuotedMarkedValue;
	}
	public Double getNonCurrentInvestmentsUnquotedBookValue() {
		return nonCurrentInvestmentsUnquotedBookValue;
	}
	public void setNonCurrentInvestmentsUnquotedBookValue(double nonCurrentInvestmentsUnquotedBookValue) {
		this.nonCurrentInvestmentsUnquotedBookValue = nonCurrentInvestmentsUnquotedBookValue;
	}
	public Double getCurrentInvestmentsQuotedMarkedValue() {
		return currentInvestmentsQuotedMarkedValue;
	}
	public void setCurrentInvestmentsQuotedMarkedValue(double currentInvestmentsQuotedMarkedValue) {
		this.currentInvestmentsQuotedMarkedValue = currentInvestmentsQuotedMarkedValue;
	}
	public Double getCurrentInvestmentsUnquotedBookValue() {
		return currentInvestmentsUnquotedBookValue;
	}
	public void setCurrentInvestmentsUnquotedBookValue(double currentInvestmentsUnquotedBookValue) {
		this.currentInvestmentsUnquotedBookValue = currentInvestmentsUnquotedBookValue;
	}


}
