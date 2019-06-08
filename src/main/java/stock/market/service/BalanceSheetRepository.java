package stock.market.service;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.market.model.BalanceSheet;
import stock.market.model.Company;

public interface BalanceSheetRepository extends JpaRepository<BalanceSheet,Integer>{
	public BalanceSheet save(BalanceSheet bs);
	public BalanceSheet findByCompanyAndYear(Company c, int year);
}
