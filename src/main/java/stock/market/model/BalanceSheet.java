package stock.market.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames= {"year","company_id"}))
public class BalanceSheet {
	//COMPANY
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
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
	private int year;
	
	private double equityShareCapital;
	private double totalShareCapital;
	
	private double reserveAndSurplus;
	private double totalReserveAndSurplus;
	private double totalShareholdersFund;
	
	private double equityShareAndApplicationMoney;
	private double hybridOrDebtOrOtherSecurities;
	
	//NON-CURRENT LIABILITIES
	private double longTermBorrowings;
	private double deferredTaxLiabilities;
	private double otherLongTermLiabilities;
	private double longTermProvisions;
	private double totalNonCurrentLiabilities;
	
	//CURRENT LIABILITIES
	private double shortTermBorrowings;
	private double tradePayables;
	private double otherCurrentLiuabilities;
	private double shortTermProvisions;
	private double totalCurrentLiabilities;
	private double totalCapitalAndLiabilities;
	
	//ASSETS
	//NON_CURRENT ASSETS
	private double tangibleAssets;
	private double intangibleAssets;
	private double capitalWorkInProgress;
	private double intangibleAssetsUnderDevelopment;
	
	//FIXED ASSETS
	private double nonCurrentInvestments;
	private double longTermLoansAndAdvances;
	private double otherNonCurrentAssets;
	private double  totalNonCurrentAssets;
	
	//CURRENT ASSETS
	private double currentInvestments;
	private double inventories;
	private double tradeReceivables;
	private double cashAndcashEquivalents;
	private double shortTermLoansAndAdvances;
	private double otherCurrentAssets;
	
	private double totalCurrentAsets;
	private double totalAssets;
	
	//OTHER ADDITIONAL INFORMATION
	private double contingentsLiabilities;
	
	//CIF VALUE OF IMPORTS
	private double rawMaterials;
	private double storesSparesAndLooseTools;
	private double tradeOrOtherGoods;
	private double capitalGoods;
	
	//EXPENDITURE IN FOREIGN EXCHANGE
	private double expenditureInForeignCurrency;
	
	// REMITTANCES IN FOREIGN CURRENCIES FOR DIVIDENDS
	private double dividendRemittanceInForeignCurrency;
	
	//EARNINGS IN FOREIGN CURRENCIES FOR DIVIDENDS
	private double FOBValueOfGoods;
	private double otherEarnings;
	
	//BONUS DETAILS
	private double bonusEquityShareCapital;
	
	//NON-CURRENT INVESTMENTS
	private double nonCurrentInvestmentsQuotedMarkedValue;
	private double nonCurrentInvestmentsUnquotedBookValue;
	
	//CURRENT INVESTMENTS
	private double currentInvestmentsQuotedMarkedValue;
	private double currentInvestmentsUnquotedBookValue;
	
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
	public double getEquityShareCapital() {
		return equityShareCapital;
	}
	public void setEquityShareCapital(double equityShareCapital) {
		this.equityShareCapital = equityShareCapital;
	}
	public double getTotalShareCapital() {
		return totalShareCapital;
	}
	public void setTotalShareCapital(double totalShareCapital) {
		this.totalShareCapital = totalShareCapital;
	}
	public double getReserveAndSurplus() {
		return reserveAndSurplus;
	}
	public void setReserveAndSurplus(double reserveAndSurplus) {
		this.reserveAndSurplus = reserveAndSurplus;
	}
	public double getTotalReserveAndSurplus() {
		return totalReserveAndSurplus;
	}
	public void setTotalReserveAndSurplus(double totalReserveAndSurplus) {
		this.totalReserveAndSurplus = totalReserveAndSurplus;
	}
	public double getTotalShareholdersFund() {
		return totalShareholdersFund;
	}
	public void setTotalShareholdersFund(double totalShareholdersFund) {
		this.totalShareholdersFund = totalShareholdersFund;
	}
	public double getEquityShareAndApplicationMoney() {
		return equityShareAndApplicationMoney;
	}
	public void setEquityShareAndApplicationMoney(double equityShareAndApplicationMoney) {
		this.equityShareAndApplicationMoney = equityShareAndApplicationMoney;
	}
	public double getHybridOrDebtOrOtherSecurities() {
		return hybridOrDebtOrOtherSecurities;
	}
	public void setHybridOrDebtOrOtherSecurities(double hybridOrDebtOrOtherSecurities) {
		this.hybridOrDebtOrOtherSecurities = hybridOrDebtOrOtherSecurities;
	}
	public double getLongTermBorrowings() {
		return longTermBorrowings;
	}
	public void setLongTermBorrowings(double longTermBorrowings) {
		this.longTermBorrowings = longTermBorrowings;
	}
	public double getDeferredTaxLiabilities() {
		return deferredTaxLiabilities;
	}
	public void setDeferredTaxLiabilities(double deferredTaxLiabilities) {
		this.deferredTaxLiabilities = deferredTaxLiabilities;
	}
	public double getOtherLongTermLiabilities() {
		return otherLongTermLiabilities;
	}
	public void setOtherLongTermLiabilities(double otherLongTermLiabilities) {
		this.otherLongTermLiabilities = otherLongTermLiabilities;
	}
	public double getLongTermProvisions() {
		return longTermProvisions;
	}
	public void setLongTermProvisions(double longTermProvisions) {
		this.longTermProvisions = longTermProvisions;
	}
	public double getTotalNonCurrentLiabilities() {
		return totalNonCurrentLiabilities;
	}
	public void setTotalNonCurrentLiabilities(double totalNonCurrentLiabilities) {
		this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
	}
	public double getShortTermBorrowings() {
		return shortTermBorrowings;
	}
	public void setShortTermBorrowings(double shortTermBorrowings) {
		this.shortTermBorrowings = shortTermBorrowings;
	}
	public double getTradePayables() {
		return tradePayables;
	}
	public void setTradePayables(double tradePayables) {
		this.tradePayables = tradePayables;
	}
	public double getOtherCurrentLiuabilities() {
		return otherCurrentLiuabilities;
	}
	public void setOtherCurrentLiuabilities(double otherCurrentLiuabilities) {
		this.otherCurrentLiuabilities = otherCurrentLiuabilities;
	}
	public double getShortTermProvisions() {
		return shortTermProvisions;
	}
	public void setShortTermProvisions(double shortTermProvisions) {
		this.shortTermProvisions = shortTermProvisions;
	}
	public double getTotalCurrentLiabilities() {
		return totalCurrentLiabilities;
	}
	public void setTotalCurrentLiabilities(double totalCurrentLiabilities) {
		this.totalCurrentLiabilities = totalCurrentLiabilities;
	}
	public double getTotalCapitalAndLiabilities() {
		return totalCapitalAndLiabilities;
	}
	public void setTotalCapitalAndLiabilities(double totalCapitalAndLiabilities) {
		this.totalCapitalAndLiabilities = totalCapitalAndLiabilities;
	}
	public double getTangibleAssets() {
		return tangibleAssets;
	}
	public void setTangibleAssets(double tangibleAssets) {
		this.tangibleAssets = tangibleAssets;
	}
	public double getIntangibleAssets() {
		return intangibleAssets;
	}
	public void setIntangibleAssets(double intangibleAssets) {
		this.intangibleAssets = intangibleAssets;
	}
	public double getCapitalWorkInProgress() {
		return capitalWorkInProgress;
	}
	public void setCapitalWorkInProgress(double capitalWorkInProgress) {
		this.capitalWorkInProgress = capitalWorkInProgress;
	}
	public double getIntangibleAssetsUnderDevelopment() {
		return intangibleAssetsUnderDevelopment;
	}
	public void setIntangibleAssetsUnderDevelopment(double intangibleAssetsUnderDevelopment) {
		this.intangibleAssetsUnderDevelopment = intangibleAssetsUnderDevelopment;
	}
	public double getNonCurrentInvestments() {
		return nonCurrentInvestments;
	}
	public void setNonCurrentInvestments(double nonCurrentInvestments) {
		this.nonCurrentInvestments = nonCurrentInvestments;
	}
	public double getLongTermLoansAndAdvances() {
		return longTermLoansAndAdvances;
	}
	public void setLongTermLoansAndAdvances(double longTermLoansAndAdvances) {
		this.longTermLoansAndAdvances = longTermLoansAndAdvances;
	}
	public double getOtherNonCurrentAssets() {
		return otherNonCurrentAssets;
	}
	public void setOtherNonCurrentAssets(double otherNonCurrentAssets) {
		this.otherNonCurrentAssets = otherNonCurrentAssets;
	}
	public double getTotalNonCurrentAssets() {
		return totalNonCurrentAssets;
	}
	public void setTotalNonCurrentAssets(double totalNonCurrentAssets) {
		this.totalNonCurrentAssets = totalNonCurrentAssets;
	}
	public double getCurrentInvestments() {
		return currentInvestments;
	}
	public void setCurrentInvestments(double currentInvestments) {
		this.currentInvestments = currentInvestments;
	}
	public double getInventories() {
		return inventories;
	}
	public void setInventories(double inventories) {
		this.inventories = inventories;
	}
	public double getTradeReceivables() {
		return tradeReceivables;
	}
	public void setTradeReceivables(double tradeReceivables) {
		this.tradeReceivables = tradeReceivables;
	}
	public double getCashAndcashEquivalents() {
		return cashAndcashEquivalents;
	}
	public void setCashAndcashEquivalents(double cashAndcashEquivalents) {
		this.cashAndcashEquivalents = cashAndcashEquivalents;
	}
	public double getShortTermLoansAndAdvances() {
		return shortTermLoansAndAdvances;
	}
	public void setShortTermLoansAndAdvances(double shortTermLoansAndAdvances) {
		this.shortTermLoansAndAdvances = shortTermLoansAndAdvances;
	}
	public double getOtherCurrentAssets() {
		return otherCurrentAssets;
	}
	public void setOtherCurrentAssets(double otherCurrentAssets) {
		this.otherCurrentAssets = otherCurrentAssets;
	}
	public double getTotalCurrentAsets() {
		return totalCurrentAsets;
	}
	public void setTotalCurrentAsets(double totalCurrentAsets) {
		this.totalCurrentAsets = totalCurrentAsets;
	}
	public double getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(double totalAssets) {
		this.totalAssets = totalAssets;
	}
	public double getContingentsLiabilities() {
		return contingentsLiabilities;
	}
	public void setContingentsLiabilities(double contingentsLiabilities) {
		this.contingentsLiabilities = contingentsLiabilities;
	}
	public double getRawMaterials() {
		return rawMaterials;
	}
	public void setRawMaterials(double rawMaterials) {
		this.rawMaterials = rawMaterials;
	}
	public double getStoresSparesAndLooseTools() {
		return storesSparesAndLooseTools;
	}
	public void setStoresSparesAndLooseTools(double storesSparesAndLooseTools) {
		this.storesSparesAndLooseTools = storesSparesAndLooseTools;
	}
	public double getTradeOrOtherGoods() {
		return tradeOrOtherGoods;
	}
	public void setTradeOrOtherGoods(double tradeOrOtherGoods) {
		this.tradeOrOtherGoods = tradeOrOtherGoods;
	}
	public double getCapitalGoods() {
		return capitalGoods;
	}
	public void setCapitalGoods(double capitalGoods) {
		this.capitalGoods = capitalGoods;
	}
	public double getExpenditureInForeignCurrency() {
		return expenditureInForeignCurrency;
	}
	public void setExpenditureInForeignCurrency(double expenditureInForeignCurrency) {
		this.expenditureInForeignCurrency = expenditureInForeignCurrency;
	}
	public double getDividendRemittanceInForeignCurrency() {
		return dividendRemittanceInForeignCurrency;
	}
	public void setDividendRemittanceInForeignCurrency(double dividendRemittanceInForeignCurrency) {
		this.dividendRemittanceInForeignCurrency = dividendRemittanceInForeignCurrency;
	}
	public double getFOBValueOfGoods() {
		return FOBValueOfGoods;
	}
	public void setFOBValueOfGoods(double fOBValueOfGoods) {
		FOBValueOfGoods = fOBValueOfGoods;
	}
	public double getOtherEarnings() {
		return otherEarnings;
	}
	public void setOtherEarnings(double otherEarnings) {
		this.otherEarnings = otherEarnings;
	}
	public double getBonusEquityShareCapital() {
		return bonusEquityShareCapital;
	}
	public void setBonusEquityShareCapital(double bonusEquityShareCapital) {
		this.bonusEquityShareCapital = bonusEquityShareCapital;
	}
	public double getNonCurrentInvestmentsQuotedMarkedValue() {
		return nonCurrentInvestmentsQuotedMarkedValue;
	}
	public void setNonCurrentInvestmentsQuotedMarkedValue(double nonCurrentInvestmentsQuotedMarkedValue) {
		this.nonCurrentInvestmentsQuotedMarkedValue = nonCurrentInvestmentsQuotedMarkedValue;
	}
	public double getNonCurrentInvestmentsUnquotedBookValue() {
		return nonCurrentInvestmentsUnquotedBookValue;
	}
	public void setNonCurrentInvestmentsUnquotedBookValue(double nonCurrentInvestmentsUnquotedBookValue) {
		this.nonCurrentInvestmentsUnquotedBookValue = nonCurrentInvestmentsUnquotedBookValue;
	}
	public double getCurrentInvestmentsQuotedMarkedValue() {
		return currentInvestmentsQuotedMarkedValue;
	}
	public void setCurrentInvestmentsQuotedMarkedValue(double currentInvestmentsQuotedMarkedValue) {
		this.currentInvestmentsQuotedMarkedValue = currentInvestmentsQuotedMarkedValue;
	}
	public double getCurrentInvestmentsUnquotedBookValue() {
		return currentInvestmentsUnquotedBookValue;
	}
	public void setCurrentInvestmentsUnquotedBookValue(double currentInvestmentsUnquotedBookValue) {
		this.currentInvestmentsUnquotedBookValue = currentInvestmentsUnquotedBookValue;
	}


}
