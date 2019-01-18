package stock.market.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.market.model.Cusip;

public interface CusipRepository extends JpaRepository<Cusip, Integer>{
	public List<Cusip> findAll();
	public Cusip save(Cusip cusip);
	//public Cusip findOne(int cusip);
	public Cusip findByName(String name);
}