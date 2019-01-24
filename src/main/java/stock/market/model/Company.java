package stock.market.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String symbol;
	private String name;
	private String series;
	private String dateOfListing;
	private float paidUpValue;
	private int marketLot;
	private String isin;
	private float faceValue;
	private String market;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getDateOfListing() {
		return dateOfListing;
	}
	public void setDateOfListing(String dateOfListing) {
		this.dateOfListing = dateOfListing;
	}
	public float getPaidUpValue() {
		return paidUpValue;
	}
	public void setPaidUpValue(float paidUpValue) {
		this.paidUpValue = paidUpValue;
	}
	public int getMarketLot() {
		return marketLot;
	}
	public void setMarketLot(int marketLot) {
		this.marketLot = marketLot;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public float getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(float faceValue) {
		this.faceValue = faceValue;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
}
