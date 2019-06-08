package stock.market.service;

import org.springframework.data.repository.Repository;

import stock.market.model.Company;
import stock.market.model.Ratios;

public interface RatioRepository extends Repository<Ratios, Integer>{
	public Ratios save(Ratios ratios);
	//public Ratios update(Ratios ratios);
	public Ratios findByCompanyAndYear(Company c, int year);
	public Ratios findByCompanyAndYearAndQuarter(Company c, int year, int quarter);
}
