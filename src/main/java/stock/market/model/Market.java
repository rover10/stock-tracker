package stock.market.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

public 
@Entity
@Data

class Market{
	@Id
	private String id;
	
	@OneToMany
	private Set<Cusip> cusip;
	
	
	private String name;
	private String countryCode;
	public String getId() {
		return id;
	}
	public Set<Cusip> getCusip() {
		return cusip;
	}
	public void setCusip(Set<Cusip> cusip) {
		this.cusip = cusip;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}

