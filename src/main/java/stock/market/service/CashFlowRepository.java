package stock.market.service;

import org.springframework.data.repository.Repository;
import stock.market.model.CashFlow;
import stock.market.model.Company;

public interface CashFlowRepository extends Repository<CashFlow, Integer>{
	public CashFlow save(CashFlow cf);
	public CashFlow findByCompanyAndYear(Company c, int year);
}
