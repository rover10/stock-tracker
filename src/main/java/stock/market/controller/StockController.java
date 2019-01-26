package stock.market.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import stock.market.model.Company;
import stock.market.model.Cusip;
import stock.market.model.Market;
import stock.market.model.Stock;
import stock.market.model.User;
import stock.market.model.query.CusipQuery;

import org.springframework.http.MediaType;

import stock.market.service.CompanyAdder;
import stock.market.service.CompanyRepository;
import stock.market.service.CusipRepository;
import stock.market.service.MarketRepository;
import stock.market.service.UserRepository;
import stock.market.service.thirdparty.StockPrice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class StockController {
	
	@Autowired
	CusipRepository cusipRepository;
	
	@Autowired
	MarketRepository marketRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	CompanyAdder companyAdder;
	
	@Autowired
	StockPrice stockPrice;
	
	@RequestMapping(value= "/cusip", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cusip> getAllCusip(){
		System.out.println("GET");
		cusipRepository.findAll()
					   .stream()
					   .forEach((m) -> System.out.println(m.getMarket()));
		return cusipRepository.findAll();
	}
	
	@RequestMapping(value = "/cusip/historical", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getCusipPrice(@RequestBody CusipQuery cusipQuery) {
		return stockPrice.fetchDetail(cusipQuery);
	}
	
	@RequestMapping(value= "/cusip", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cusip save(@RequestBody Cusip cusip ) {
		System.out.println("Save" + cusip.getName());
		return cusipRepository.save(cusip);
	}
	
	@RequestMapping(value="/market", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Market saveMarket(@RequestBody Market market) {
		return marketRepository.save(market);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public User saveUser(@RequestBody User user) {
		System.out.println(user.getEmail());
		return userRepository.save(user);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	public User getUser(@PathVariable("id") int id) {
		return userRepository.getOne(id);
	}
	
	@RequestMapping(value="/track/{user}/{cusip}", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public User trackStock(
		@PathVariable("user") int user,
		@PathVariable("cusip") int cusip) {
		
		User usr = userRepository.getOne(user);
		Cusip cp = cusipRepository.getOne(cusip);
		usr.getTrackedCusips().add(cp);
		userRepository.save(usr);	
		return usr;
	}
	
	@RequestMapping(value = "/track/{user}/symbol/{symbol}/date/{date}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public User trackStockSymbol(
			@PathVariable("user") int user,
			@PathVariable("symbol") String symbol,
			@PathVariable("date") String date) throws ParseException {
			User usr = userRepository.getOne(user);
			Cusip cp = cusipRepository.findByCusip(symbol);
			usr.getTrackedCusips().add(cp);
			
			CusipQuery cQuery = new CusipQuery();
			cQuery.setSymbol(symbol);
			cQuery.setStartDate(date);
			cQuery.setEndDate(date);
			
			Stock stock = stockPrice.fetchDetail(cQuery);
			DateFormat format = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
			Date trackdate = format.parse(date);
			cp.setTradingFrom(trackdate);

			userRepository.save(usr);
			return usr;
	}
	
	@RequestMapping(value = "/company/nse", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Company> nseCompanies(){
		return companyRepository.findAll();
	}
	
	@RequestMapping(value = "/company/reload/nse", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void reloadNSECompanies() {
		companyAdder.addCompanies();
	}
	
}	
