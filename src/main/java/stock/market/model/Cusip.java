package stock.market.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Cusip{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name="tradingMarket", insertable = false, updatable = false)
	private Market market;
	private String name;
	private String cusip;
	private Date tradingFrom;
	private String tradingMarket;
	
	public Date getTradingFrom() {
		return tradingFrom;
	}
	
	public void setTradingFrom(Date tradingFrom) {
		this.tradingFrom = tradingFrom;
	}
	public Market getMarket() {
		return market;
	}
	public void setMarket(Market market) {
		this.market = market;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCusip() {
		return cusip;
	}
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}
	
	public String getTradingMarket() {
		return tradingMarket;
	}
	public void setTradingMarket(String tradingMarket) {
		this.tradingMarket = tradingMarket;
	}
}
