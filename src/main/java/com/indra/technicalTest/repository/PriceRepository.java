package com.indra.technicalTest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.technicalTest.model.Price;
/**
 * Methods of the "Price" entity to interact with the database.
 */
@Repository
public interface PriceRepository extends JpaRepository<Price, Long>{
	
	List<Price> findByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfter(Integer brandId, Integer productId, String startDate, String endDate);
	
}
