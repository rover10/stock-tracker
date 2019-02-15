package stock.market.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CashFlow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int year;
	private double unitMutiplier;
	private double netCashFlowFromOperatingActivities;
	private double netCashUsedInInvestingActivities;
	private double foreignExchangeGainsOrLosses;
	
	private double netIncreaseOrDecreaseInCashAndCashEquivalents;
	
	private double cashAndcashEquivalentsBeginOfyear;
	private double cashAndCashEquivalentsEndOfYear;
	
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
	public double getUnitMutiplier() {
		return unitMutiplier;
	}
	public void setUnitMutiplier(double unitMutiplier) {
		this.unitMutiplier = unitMutiplier;
	}
	//	public Company getCompany() {
	//		return company;
	//	}
	//	public void setCompany(Company company) {
	//		this.company = company;
	//	}
	public double getNetCashFlowFromOperatingActivities() {
		return netCashFlowFromOperatingActivities;
	}
	public void setNetCashFlowFromOperatingActivities(double netCashFlowFromOperatingActivities) {
		this.netCashFlowFromOperatingActivities = netCashFlowFromOperatingActivities;
	}
	public double getNetCashUsedInInvestingActivities() {
		return netCashUsedInInvestingActivities;
	}
	public void setNetCashUsedInInvestingActivities(double netCashUsedInInvestingActivities) {
		this.netCashUsedInInvestingActivities = netCashUsedInInvestingActivities;
	}
	public double getForeignExchangeGainsOrLosses() {
		return foreignExchangeGainsOrLosses;
	}
	public void setForeignExchangeGainsOrLosses(double foreignExchangeGainsOrLosses) {
		this.foreignExchangeGainsOrLosses = foreignExchangeGainsOrLosses;
	}
	public double getNetIncreaseOrDecreaseInCashAndCashEquivalents() {
		return netIncreaseOrDecreaseInCashAndCashEquivalents;
	}
	public void setNetIncreaseOrDecreaseInCashAndCashEquivalents(double netIncreaseOrDecreaseInCashAndCashEquivalents) {
		this.netIncreaseOrDecreaseInCashAndCashEquivalents = netIncreaseOrDecreaseInCashAndCashEquivalents;
	}
	public double getCashAndcashEquivalentsBeginOfyear() {
		return cashAndcashEquivalentsBeginOfyear;
	}
	public void setCashAndcashEquivalentsBeginOfyear(double cashAndcashEquivalentsBeginOfyear) {
		this.cashAndcashEquivalentsBeginOfyear = cashAndcashEquivalentsBeginOfyear;
	}
	public double getCashAndCashEquivalentsEndOfYear() {
		return cashAndCashEquivalentsEndOfYear;
	}
	public void setCashAndCashEquivalentsEndOfYear(double cashAndCashEquivalentsEndOfYear) {
		this.cashAndCashEquivalentsEndOfYear = cashAndCashEquivalentsEndOfYear;
	}

}
