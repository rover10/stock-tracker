package stock.market.service;

import org.springframework.data.jpa.repository.JpaRepository;

import stock.market.model.Company;
import stock.market.model.CompanyProfitAndLoss;

public interface CompanyProfitAndLossRepository extends JpaRepository<CompanyProfitAndLoss, Integer> {
	public CompanyProfitAndLoss save(CompanyProfitAndLoss companyProfitAndLoss);
	public CompanyProfitAndLoss findByCompanyAndYear(Company c, int year);
	//public CompanyProfitAndLoss update(CompanyProfitAndLoss companyProfitAndLoss);
}
