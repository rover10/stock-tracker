package stock.market.model;

import java.util.Currency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
public class CompanyProfitAndLoss {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int year;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Company company;
	private Currency currency;
	
	//In Crore/million/billion
	private double unitMultiplier;
	
	//INCOME
	private double grossRevenueFromOperations;
	private double exciseOrServiceTaxOrOtherLevies;
	private double netRevenueFromOperations;
	private double otherOperatingRevenues;
	private double totalOperatingRevenues;
	private double otherIncome;
	private double totalRevenue;
	
	//EXPENSES
	private double costOfMaterialConsumed;
	private double purchaseOfStocksInTrade;
	private double changeOfInventoriesOfFgWipAndStockInTrade;
	private double employmentBenefitExpenses;
	private double financeCosts;
	private double depreciationAndAmortisationExpenses;
	private double otherExpenses;
	private double amountTransferToCapitalAccounts;
	private double totalExpenses;
	
	//PROFIT/LOSS BEFORE EXCEPTIONAL, EXTRAORDINARY ITEMS AND TAX
	private double exceptionalItems;
	private double profitLossBeforeTax;
	
	//TAX EXPENSES-CONTINUED OPERATIONS
	private double currentTax;
	private double matCreditEntitlement;
	private double deferredTax;
	
	private double totalTaxExpenses;
	private double profitLossAfterTaxAndBeforeExtraOrdinaryItems;
	private double profitLossForThePeriod;
	
	//OTHER ADDITIONAL INFORMATION
	//EARNING PER SHARE
	private double basicEps;
	private double dilutedEps;
	
	// VALUE OF IMPORTED AND INDIGENIOUS RAW MATERIALS
	private double importedRawMaterials;
	private double indigenousRawMaterials;
	
	//STORES, SPARES AND LOOSE TOOLS
	private double importedStoresAndSpares;
	private double indegenousStoresAndSpares;
	
	// DIVIDEND AND DIVIDEND PERCENTAGE
	private double equityShareDividend;
	private double taxOnDividend;
	private double equityDividendRate;

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
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public double getUnitMultiplier() {
		return unitMultiplier;
	}
	public void setUnitMultiplier(double unitMultiplier) {
		this.unitMultiplier = unitMultiplier;
	}
	public double getGrossRevenueFromOperations() {
		return grossRevenueFromOperations;
	}
	public void setGrossRevenueFromOperations(double grossRevenueFromOperations) {
		this.grossRevenueFromOperations = grossRevenueFromOperations;
	}
	public double getExciseOrServiceTaxOrOtherLevies() {
		return exciseOrServiceTaxOrOtherLevies;
	}
	public void setExciseOrServiceTaxOrOtherLevies(double exciseOrServiceTaxOrOtherLevies) {
		this.exciseOrServiceTaxOrOtherLevies = exciseOrServiceTaxOrOtherLevies;
	}
	public double getNetRevenueFromOperations() {
		return netRevenueFromOperations;
	}
	public void setNetRevenueFromOperations(double netRevenueFromOperations) {
		this.netRevenueFromOperations = netRevenueFromOperations;
	}
	public double getOtherOperatingRevenues() {
		return otherOperatingRevenues;
	}
	public void setOtherOperatingRevenues(double otherOperatingRevenues) {
		this.otherOperatingRevenues = otherOperatingRevenues;
	}
	public double getTotalOperatingRevenues() {
		return totalOperatingRevenues;
	}
	public void setTotalOperatingRevenues(double totalOperatingRevenues) {
		this.totalOperatingRevenues = totalOperatingRevenues;
	}
	public double getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(double otherIncome) {
		this.otherIncome = otherIncome;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	public double getCostOfMaterialConsumed() {
		return costOfMaterialConsumed;
	}
	public void setCostOfMaterialConsumed(double costOfMaterialConsumed) {
		this.costOfMaterialConsumed = costOfMaterialConsumed;
	}
	public double getPurchaseOfStocksInTrade() {
		return purchaseOfStocksInTrade;
	}
	public void setPurchaseOfStocksInTrade(double purchaseOfStocksInTrade) {
		this.purchaseOfStocksInTrade = purchaseOfStocksInTrade;
	}
	public double getChangeOfInventoriesOfFgWipAndStockInTrade() {
		return changeOfInventoriesOfFgWipAndStockInTrade;
	}
	public void setChangeOfInventoriesOfFgWipAndStockInTrade(double changeOfInventoriesOfFgWipAndStockInTrade) {
		this.changeOfInventoriesOfFgWipAndStockInTrade = changeOfInventoriesOfFgWipAndStockInTrade;
	}
	public double getEmploymentBenefitExpenses() {
		return employmentBenefitExpenses;
	}
	public void setEmploymentBenefitExpenses(double employmentBenefitExpenses) {
		this.employmentBenefitExpenses = employmentBenefitExpenses;
	}
	public double getFinanceCosts() {
		return financeCosts;
	}
	public void setFinanceCosts(double financeCosts) {
		this.financeCosts = financeCosts;
	}
	public double getDepreciationAndAmortisationExpenses() {
		return depreciationAndAmortisationExpenses;
	}
	public void setDepreciationAndAmortisationExpenses(double depreciationAndAmortisationExpenses) {
		this.depreciationAndAmortisationExpenses = depreciationAndAmortisationExpenses;
	}
	public double getOtherExpenses() {
		return otherExpenses;
	}
	public void setOtherExpenses(double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	public double getAmountTransferToCapitalAccounts() {
		return amountTransferToCapitalAccounts;
	}
	public void setAmountTransferToCapitalAccounts(double amountTransferToCapitalAccounts) {
		this.amountTransferToCapitalAccounts = amountTransferToCapitalAccounts;
	}
	public double getTotalExpenses() {
		return totalExpenses;
	}
	public void setTotalExpenses(double totalExpenses) {
		this.totalExpenses = totalExpenses;
	}
	public double getExceptionalItems() {
		return exceptionalItems;
	}
	public void setExceptionalItems(double exceptionalItems) {
		this.exceptionalItems = exceptionalItems;
	}
	public double getProfitLossBeforeTax() {
		return profitLossBeforeTax;
	}
	public void setProfitLossBeforeTax(double profitLossBeforeTax) {
		this.profitLossBeforeTax = profitLossBeforeTax;
	}
	public double getCurrentTax() {
		return currentTax;
	}
	public void setCurrentTax(double currentTax) {
		this.currentTax = currentTax;
	}
	public double getMatCreditEntitlement() {
		return matCreditEntitlement;
	}
	public void setMatCreditEntitlement(double matCreditEntitlement) {
		this.matCreditEntitlement = matCreditEntitlement;
	}
	public double getDeferredTax() {
		return deferredTax;
	}
	public void setDeferredTax(double deferredTax) {
		this.deferredTax = deferredTax;
	}
	public double getTotalTaxExpenses() {
		return totalTaxExpenses;
	}
	public void setTotalTaxExpenses(double totalTaxExpenses) {
		this.totalTaxExpenses = totalTaxExpenses;
	}
	public double getProfitLossAfterTaxAndBeforeExtraOrdinaryItems() {
		return profitLossAfterTaxAndBeforeExtraOrdinaryItems;
	}
	public void setProfitLossAfterTaxAndBeforeExtraOrdinaryItems(double profitLossAfterTaxAndBeforeExtraOrdinaryItems) {
		this.profitLossAfterTaxAndBeforeExtraOrdinaryItems = profitLossAfterTaxAndBeforeExtraOrdinaryItems;
	}
	public double getProfitLossForThePeriod() {
		return profitLossForThePeriod;
	}
	public void setProfitLossForThePeriod(double profitLossForThePeriod) {
		this.profitLossForThePeriod = profitLossForThePeriod;
	}
	public double getImportedRawMaterials() {
		return importedRawMaterials;
	}
	public void setImportedRawMaterials(double importedRawMaterials) {
		this.importedRawMaterials = importedRawMaterials;
	}
	public double getIndigenousRawMaterials() {
		return indigenousRawMaterials;
	}
	public void setIndigenousRawMaterials(double indigenousRawMaterials) {
		this.indigenousRawMaterials = indigenousRawMaterials;
	}
	public double getImportedStoresAndSpares() {
		return importedStoresAndSpares;
	}
	public void setImportedStoresAndSpares(double importedStoresAndSpares) {
		this.importedStoresAndSpares = importedStoresAndSpares;
	}
	public double getIndegenousStoresAndSpares() {
		return indegenousStoresAndSpares;
	}
	public void setIndegenousStoresAndSpares(double indegenousStoresAndSpares) {
		this.indegenousStoresAndSpares = indegenousStoresAndSpares;
	}
	public double getEquityShareDividend() {
		return equityShareDividend;
	}
	public void setEquityShareDividend(double equityShareDividend) {
		this.equityShareDividend = equityShareDividend;
	}
	public double getTaxOnDividend() {
		return taxOnDividend;
	}
	public void setTaxOnDividend(double taxOnDividend) {
		this.taxOnDividend = taxOnDividend;
	}
	public double getEquityDividendRate() {
		return equityDividendRate;
	}
	public void setEquityDividendRate(double equityDividendRate) {
		this.equityDividendRate = equityDividendRate;
	}
	public double getBasicEps() {
		return basicEps;
	}
	public void setBasicEps(double basicEps) {
		this.basicEps = basicEps;
	}
	public double getDilutedEps() {
		return dilutedEps;
	}
	public void setDilutedEps(double dilutedEps) {
		this.dilutedEps = dilutedEps;
	}
		
}
