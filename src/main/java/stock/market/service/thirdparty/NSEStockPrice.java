package stock.market.service.thirdparty;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import stock.market.model.Stock;
import stock.market.model.query.CusipQuery;
import stock.market.model.query.response.quandl.CusipSingleDayPriceResponse;
import stock.market.model.query.response.quandl.DataSet;

@Service
public class NSEStockPrice implements StockPrice{
	
	@Value("${nse-api-url}")
	private String url;
	
	@Value("${nse-api-appkey}")
	private String apiKey;
	
	//private StockQuery stockQuery;
	private RestTemplate restTemplate = new RestTemplate();
	//https://www.quandl.com/api/v3/datasets/TC1/SUNPHARMA?start_date=2010-12-31&end_date=2010-12-31&api_key=YOUR_API_KEY
	
	@Override
	public Stock fetchDetail(CusipQuery cusipQuery) {
		String stockUrl = url + cusipQuery.getSymbol();
		System.out.print(cusipQuery.getStartDate() + "<start end>"+ cusipQuery.getEndDate());
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(stockUrl)
				   .queryParam("start_date", cusipQuery.getStartDate())
				   .queryParam("end_date", cusipQuery.getEndDate())
				   .queryParam("api_key", apiKey);

		Stock stock = new Stock(); //restTemplate.getForObject(builder.buildAndExpand().toUri(), Stock.class);

		//Experimental
		String result = restTemplate.getForObject(builder.buildAndExpand().toUri(), String.class);
		String json = result.split("<code data-language=\"ruby\">")[1].split("</code></pre>")[0];
		
		//ObjectMapper mapper = JsonFactory.create();
		//CusipSingleDayPriceResponse response = mapper.readValue(json, CusipSingleDayPriceResponse.class);
		System.out.println(json);
		json = json.replaceAll("\n", "");
		json = json.replaceAll("\r", "");
		int LAST_PRICE = 4;
		//DataSet dataset = response.getDataset();

		//System.out.println(json.split("\"data\":")[1].split(",")[4]);
		float price = Float.parseFloat(json.split("\"data\":")[1].split(",")[4]);
		long stockId = Long.parseLong(json.split("\"id\":")[1].split(",")[0].trim());
		stock.setId(stockId);
		stock.setPrice(price);
		return stock;
	}
}
