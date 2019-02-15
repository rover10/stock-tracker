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
@Table(name = "company_balance_sheet",uniqueConstraints = {@UniqueConstraint(columnNames={"year", "fk_balance_sheet", "fk_company"})})
public class CompanyBalanceSheet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "fk_balance_sheet")
	private BalanceSheet balanceSheet;
	
	@ManyToOne
	@JoinColumn(name = "fk_company")
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	private int year;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BalanceSheet getBalanceSheet() {
		return balanceSheet;
	}

	public void setBalanceSheet(BalanceSheet balanceSheet) {
		this.balanceSheet = balanceSheet;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
