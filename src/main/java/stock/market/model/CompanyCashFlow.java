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
@Table(name = "company_cashflow", uniqueConstraints = {@UniqueConstraint(columnNames = {"year","fk_company","fk_cashflow"})})
public class CompanyCashFlow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "fk_cashflow")
	private CashFlow cashFlow;
	
	@ManyToOne
	@JoinColumn(name = "fk_company")
	private Company company;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CashFlow getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(CashFlow cashFlow) {
		this.cashFlow = cashFlow;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int year;
	
}
