package mjavith.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mjavith.ineuron.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
 
	public StockPrice findByCompany(String companay);
	
}
