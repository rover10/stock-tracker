package stock.market.service;

import org.springframework.data.jpa.repository.JpaRepository;

import stock.market.model.Company;
import stock.market.model.ProfitAndLoss;

public interface ProfitAndLossRepository extends JpaRepository<ProfitAndLoss, Integer> {
	public ProfitAndLoss save(ProfitAndLoss companyProfitAndLoss);
	public ProfitAndLoss findByCompanyAndYear(Company c, int year);
	//public CompanyProfitAndLoss update(CompanyProfitAndLoss companyProfitAndLoss);
}
