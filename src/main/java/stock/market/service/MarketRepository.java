package stock.market.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.market.model.Cusip;
import stock.market.model.Market;

public interface MarketRepository extends JpaRepository<Market, Integer>{
	public List<Market> findAll();
	public Market save(Market market);
	public Market findById(String id);
}