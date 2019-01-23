package stock.market.service.thirdparty;

import java.util.Map;

import stock.market.model.Stock;
import stock.market.model.query.CusipQuery;
import stock.market.model.query.StockQuery;

public interface StockPrice {
	public Stock fetchDetail(CusipQuery cusipQuery);
}
