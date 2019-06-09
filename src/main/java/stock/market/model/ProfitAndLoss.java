package stock.market.model;

import java.util.Currency;

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
@Table(uniqueConstraints=@UniqueConstraint(columnNames= {"quarter","year","company_id"}))
public class ProfitAndLoss {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	private Integer year;
	
	@NotNull
	private Integer quarter;
	
	
	@NotNull
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Company company;
	private Currency currency;
	
	//In Crore/million/billion
	private Double unitMultiplier;
	
	//INCOME
	private Double grossRevenueFromOperations;
	private Double exciseOrServiceTaxOrOtherLevies;
	private Double netRevenueFromOperations;
	private Double otherOperatingRevenues;
	private Double totalOperatingRevenues;
	private Double otherIncome;
	private Double totalRevenue;
	
	//EXPENSES
	private Double costOfMaterialConsumed;
	private Double purchaseOfStocksInTrade;
	private Double changeOfInventoriesOfFgWipAndStockInTrade;
	private Double employmentBenefitExpenses;
	private Double financeCosts;
	private Double depreciationAndAmortisationExpenses;
	private Double otherExpenses;
	private Double amountTransferToCapitalAccounts;
	private Double totalExpenses;
	
	//PROFIT/LOSS BEFORE EXCEPTIONAL, EXTRAORDINARY ITEMS AND TAX
	private Double exceptionalItems;
	private Double profitLossBeforeTax;
	
	//TAX EXPENSES-CONTINUED OPERATIONS
	private Double currentTax;
	private Double matCreditEntitlement;
	private Double deferredTax;
	
	private Double totalTaxExpenses;
	private Double profitLossAfterTaxAndBeforeExtraOrdinaryItems;
	private Double profitLossForThePeriod;
	
	//OTHER ADDITIONAL INFORMATION
	//EARNING PER SHARE
	private Double basicEps;
	private Double dilutedEps;
	
	// VALUE OF IMPORTED AND INDIGENIOUS RAW MATERIALS
	private Double importedRawMaterials;
	private Double indigenousRawMaterials;
	
	//STORES, SPARES AND LOOSE TOOLS
	private Double importedStoresAndSpares;
	private Double indegenousStoresAndSpares;
	
	// DIVIDEND AND DIVIDEND PERCENTAGE
	private Double equityShareDividend;
	private Double taxOnDividend;
	private Double equityDividendRate;

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
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Double getUnitMultiplier() {
		return unitMultiplier;
	}
	public void setUnitMultiplier(Double unitMultiplier) {
		this.unitMultiplier = unitMultiplier;
	}
	public Double getGrossRevenueFromOperations() {
		return grossRevenueFromOperations;
	}
	public void setGrossRevenueFromOperations(Double grossRevenueFromOperations) {
		this.grossRevenueFromOperations = grossRevenueFromOperations;
	}
	public Double getExciseOrServiceTaxOrOtherLevies() {
		return exciseOrServiceTaxOrOtherLevies;
	}
	public void setExciseOrServiceTaxOrOtherLevies(Double exciseOrServiceTaxOrOtherLevies) {
		this.exciseOrServiceTaxOrOtherLevies = exciseOrServiceTaxOrOtherLevies;
	}
	public Double getNetRevenueFromOperations() {
		return netRevenueFromOperations;
	}
	public void setNetRevenueFromOperations(Double netRevenueFromOperations) {
		this.netRevenueFromOperations = netRevenueFromOperations;
	}
	public Double getOtherOperatingRevenues() {
		return otherOperatingRevenues;
	}
	public void setOtherOperatingRevenues(Double otherOperatingRevenues) {
		this.otherOperatingRevenues = otherOperatingRevenues;
	}
	public Double getTotalOperatingRevenues() {
		return totalOperatingRevenues;
	}
	public void setTotalOperatingRevenues(Double totalOperatingRevenues) {
		this.totalOperatingRevenues = totalOperatingRevenues;
	}
	public Double getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(Double otherIncome) {
		this.otherIncome = otherIncome;
	}
	public Double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(Double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	public Double getCostOfMaterialConsumed() {
		return costOfMaterialConsumed;
	}
	public void setCostOfMaterialConsumed(Double costOfMaterialConsumed) {
		this.costOfMaterialConsumed = costOfMaterialConsumed;
	}
	public Double getPurchaseOfStocksInTrade() {
		return purchaseOfStocksInTrade;
	}
	public void setPurchaseOfStocksInTrade(Double purchaseOfStocksInTrade) {
		this.purchaseOfStocksInTrade = purchaseOfStocksInTrade;
	}
	public Double getChangeOfInventoriesOfFgWipAndStockInTrade() {
		return changeOfInventoriesOfFgWipAndStockInTrade;
	}
	public void setChangeOfInventoriesOfFgWipAndStockInTrade(Double changeOfInventoriesOfFgWipAndStockInTrade) {
		this.changeOfInventoriesOfFgWipAndStockInTrade = changeOfInventoriesOfFgWipAndStockInTrade;
	}
	public Double getEmploymentBenefitExpenses() {
		return employmentBenefitExpenses;
	}
	public void setEmploymentBenefitExpenses(Double employmentBenefitExpenses) {
		this.employmentBenefitExpenses = employmentBenefitExpenses;
	}
	public Double getFinanceCosts() {
		return financeCosts;
	}
	public void setFinanceCosts(Double financeCosts) {
		this.financeCosts = financeCosts;
	}
	public Double getDepreciationAndAmortisationExpenses() {
		return depreciationAndAmortisationExpenses;
	}
	public void setDepreciationAndAmortisationExpenses(Double depreciationAndAmortisationExpenses) {
		this.depreciationAndAmortisationExpenses = depreciationAndAmortisationExpenses;
	}
	public Double getOtherExpenses() {
		return otherExpenses;
	}
	public void setOtherExpenses(Double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	public Double getAmountTransferToCapitalAccounts() {
		return amountTransferToCapitalAccounts;
	}
	public void setAmountTransferToCapitalAccounts(Double amountTransferToCapitalAccounts) {
		this.amountTransferToCapitalAccounts = amountTransferToCapitalAccounts;
	}
	public Double getTotalExpenses() {
		return totalExpenses;
	}
	public void setTotalExpenses(Double totalExpenses) {
		this.totalExpenses = totalExpenses;
	}
	public Double getExceptionalItems() {
		return exceptionalItems;
	}
	public void setExceptionalItems(Double exceptionalItems) {
		this.exceptionalItems = exceptionalItems;
	}
	public Double getProfitLossBeforeTax() {
		return profitLossBeforeTax;
	}
	public void setProfitLossBeforeTax(Double profitLossBeforeTax) {
		this.profitLossBeforeTax = profitLossBeforeTax;
	}
	public Double getCurrentTax() {
		return currentTax;
	}
	public void setCurrentTax(Double currentTax) {
		this.currentTax = currentTax;
	}
	public Double getMatCreditEntitlement() {
		return matCreditEntitlement;
	}
	public void setMatCreditEntitlement(Double matCreditEntitlement) {
		this.matCreditEntitlement = matCreditEntitlement;
	}
	public Double getDeferredTax() {
		return deferredTax;
	}
	public void setDeferredTax(Double deferredTax) {
		this.deferredTax = deferredTax;
	}
	public Double getTotalTaxExpenses() {
		return totalTaxExpenses;
	}
	public void setTotalTaxExpenses(Double totalTaxExpenses) {
		this.totalTaxExpenses = totalTaxExpenses;
	}
	public Double getProfitLossAfterTaxAndBeforeExtraOrdinaryItems() {
		return profitLossAfterTaxAndBeforeExtraOrdinaryItems;
	}
	public void setProfitLossAfterTaxAndBeforeExtraOrdinaryItems(Double profitLossAfterTaxAndBeforeExtraOrdinaryItems) {
		this.profitLossAfterTaxAndBeforeExtraOrdinaryItems = profitLossAfterTaxAndBeforeExtraOrdinaryItems;
	}
	public Double getProfitLossForThePeriod() {
		return profitLossForThePeriod;
	}
	public void setProfitLossForThePeriod(Double profitLossForThePeriod) {
		this.profitLossForThePeriod = profitLossForThePeriod;
	}
	public Double getImportedRawMaterials() {
		return importedRawMaterials;
	}
	public void setImportedRawMaterials(Double importedRawMaterials) {
		this.importedRawMaterials = importedRawMaterials;
	}
	public Double getIndigenousRawMaterials() {
		return indigenousRawMaterials;
	}
	public void setIndigenousRawMaterials(Double indigenousRawMaterials) {
		this.indigenousRawMaterials = indigenousRawMaterials;
	}
	public Double getImportedStoresAndSpares() {
		return importedStoresAndSpares;
	}
	public void setImportedStoresAndSpares(Double importedStoresAndSpares) {
		this.importedStoresAndSpares = importedStoresAndSpares;
	}
	public Double getIndegenousStoresAndSpares() {
		return indegenousStoresAndSpares;
	}
	public void setIndegenousStoresAndSpares(Double indegenousStoresAndSpares) {
		this.indegenousStoresAndSpares = indegenousStoresAndSpares;
	}
	public Double getEquityShareDividend() {
		return equityShareDividend;
	}
	public void setEquityShareDividend(Double equityShareDividend) {
		this.equityShareDividend = equityShareDividend;
	}
	public Double getTaxOnDividend() {
		return taxOnDividend;
	}
	public void setTaxOnDividend(Double taxOnDividend) {
		this.taxOnDividend = taxOnDividend;
	}
	public Double getEquityDividendRate() {
		return equityDividendRate;
	}
	public void setEquityDividendRate(Double equityDividendRate) {
		this.equityDividendRate = equityDividendRate;
	}
	public Double getBasicEps() {
		return basicEps;
	}
	public void setBasicEps(Double basicEps) {
		this.basicEps = basicEps;
	}
	public Double getDilutedEps() {
		return dilutedEps;
	}
	public void setDilutedEps(Double dilutedEps) {
		this.dilutedEps = dilutedEps;
	}
	public Integer getQuarter() {
		return quarter;
	}
	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}
		
}
