package stock.market.controller;

import java.util.List;
import stock.market.model.Cusip;
import stock.market.model.Market;
import stock.market.model.Stock;
import stock.market.model.User;

import org.springframework.http.MediaType;
import stock.market.service.CusipRepository;
import stock.market.service.MarketRepository;
import stock.market.service.UserRepository;

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
	
	@RequestMapping(value= "/cusip", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cusip> getAllCusip(){
		System.out.println("GET");
		cusipRepository.findAll()
					   .stream()
					   .forEach((m) -> System.out.println(m.getMarket()));
		return cusipRepository.findAll();
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
}	
