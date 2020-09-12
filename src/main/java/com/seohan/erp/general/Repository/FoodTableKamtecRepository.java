package com.seohan.erp.general.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seohan.erp.general.Domain.FoodTableKamtec;

@Repository
public interface FoodTableKamtecRepository extends JpaRepository<FoodTableKamtec, Long> {

	List<FoodTableKamtec> findByGdate(String gdate); 
}
