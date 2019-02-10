package stock.market.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BalanceSheet {
	//COMPANY
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Company company;
	
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

}
