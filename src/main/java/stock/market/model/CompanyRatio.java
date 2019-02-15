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
@Table(name = "company_ratio", uniqueConstraints = @UniqueConstraint(columnNames= {"year","fk_company","fk_company_ratio"}) )
public class CompanyRatio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "fk_company")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name = "fk_company_ratio")
	private Ratios ratios;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Ratios getRatios() {
		return ratios;
	}

	public void setRatios(Ratios ratios) {
		this.ratios = ratios;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int year;
}
