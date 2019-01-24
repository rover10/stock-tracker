package stock.market.service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import stock.market.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{
	public List<Company> findAll();
	public Company save(Company company);
	public Company findBySymbol(String symbol);
}
