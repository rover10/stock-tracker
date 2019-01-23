package stock.market.model.query;

import java.util.Date;
import stock.market.model.Cusip;

public class StockQuery {
	private Date startDate;
	private Date endDate;
	private Cusip cusip;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Cusip getCusip() {
		return cusip;
	}
	public void setCusip(Cusip cusip) {
		this.cusip = cusip;
	}
	
}
