package stock.market.service;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import stock.market.model.Company;

@Service
public class CompanyAdder {
	@Value(value = "${nse-company-file}")
	String file;
	
	@Autowired
	CompanyRepository companyRepository;
	
	public void addCompanies() {
		System.out.println("\n\n\n " + file);
		try (Scanner scanner = new Scanner(new File(file))) {
			while (scanner.hasNext()){
				
				String company = scanner.nextLine();
				System.out.println(company);
				String comp_arr[] = company.split(",");
				
				String symbol =  comp_arr[0];
				String name =  comp_arr[1];
				String series =  comp_arr[2];
				String date = comp_arr[3];
				float paid_up = Float.parseFloat(comp_arr[4]);
				int market_lot = Integer.parseInt(comp_arr[5]);
				String isin = comp_arr[6];
				float face_value = Float.parseFloat(comp_arr[7]);
				
				Company c = new Company();
				c.setSymbol(symbol);
				c.setName(name);
				c.setSeries(series);
				c.setPaidUpValue(paid_up);
				c.setMarketLot(market_lot);
				c.setIsin(isin);
				c.setFaceValue(face_value);
				companyRepository.save(c);
				//System.out.println(company);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
