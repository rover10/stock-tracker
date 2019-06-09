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
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"quarter", "year","company_id"}))
public class CashFlow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer year;
	private Integer quarter;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Company company;
	private Double unitMutiplier;
	private Double netCashFlowFromOperatingActivities;
	private Double netCashUsedInInvestingActivities;
	private Double foreignExchangeGainsOrLosses;
	
	private Double netIncreaseOrDecreaseInCashAndCashEquivalents;
	
	private Double cashAndcashEquivalentsBeginOfyear;
	private Double cashAndCashEquivalentsEndOfYear;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Double getUnitMutiplier() {
		return unitMutiplier;
	}
	public void setUnitMutiplier(Double unitMutiplier) {
		this.unitMutiplier = unitMutiplier;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Double getNetCashFlowFromOperatingActivities() {
		return netCashFlowFromOperatingActivities;
	}
	public void setNetCashFlowFromOperatingActivities(Double netCashFlowFromOperatingActivities) {
		this.netCashFlowFromOperatingActivities = netCashFlowFromOperatingActivities;
	}
	public Double getNetCashUsedInInvestingActivities() {
		return netCashUsedInInvestingActivities;
	}
	public void setNetCashUsedInInvestingActivities(Double netCashUsedInInvestingActivities) {
		this.netCashUsedInInvestingActivities = netCashUsedInInvestingActivities;
	}
	public Double getForeignExchangeGainsOrLosses() {
		return foreignExchangeGainsOrLosses;
	}
	public void setForeignExchangeGainsOrLosses(Double foreignExchangeGainsOrLosses) {
		this.foreignExchangeGainsOrLosses = foreignExchangeGainsOrLosses;
	}
	public Double getNetIncreaseOrDecreaseInCashAndCashEquivalents() {
		return netIncreaseOrDecreaseInCashAndCashEquivalents;
	}
	public void setNetIncreaseOrDecreaseInCashAndCashEquivalents(Double netIncreaseOrDecreaseInCashAndCashEquivalents) {
		this.netIncreaseOrDecreaseInCashAndCashEquivalents = netIncreaseOrDecreaseInCashAndCashEquivalents;
	}
	public Double getCashAndcashEquivalentsBeginOfyear() {
		return cashAndcashEquivalentsBeginOfyear;
	}
	public void setCashAndcashEquivalentsBeginOfyear(Double cashAndcashEquivalentsBeginOfyear) {
		this.cashAndcashEquivalentsBeginOfyear = cashAndcashEquivalentsBeginOfyear;
	}
	public Double getCashAndCashEquivalentsEndOfYear() {
		return cashAndCashEquivalentsEndOfYear;
	}
	public void setCashAndCashEquivalentsEndOfYear(Double cashAndCashEquivalentsEndOfYear) {
		this.cashAndCashEquivalentsEndOfYear = cashAndCashEquivalentsEndOfYear;
	}
	public Integer getQuarter() {
		return quarter;
	}
	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

}
