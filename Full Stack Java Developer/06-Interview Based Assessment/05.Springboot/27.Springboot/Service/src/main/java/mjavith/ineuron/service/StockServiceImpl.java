package mjavith.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjavith.ineuron.entity.StockPrice;
import mjavith.ineuron.exception.StockNotFoundException;
import mjavith.ineuron.repository.StockPriceRepository;
@Service
public class StockServiceImpl implements IStockService {
    @Autowired
	private StockPriceRepository repo;
	@Override
	public double getStockPrice(String companyName) {
		
		 StockPrice stockPrice = repo.findByCompany(companyName);
		 if(stockPrice==null) {
			 throw new StockNotFoundException("Company not available");
		 }
		 return stockPrice.getStockPrice();
	}

}
