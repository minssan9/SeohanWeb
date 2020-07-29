package com.seohan.erp.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seohan.erp.general.Domain.FoodTable;

@Repository
public interface FoodTableRepository extends JpaRepository<FoodTable, Long> {

	List<FoodTable> findByGdate(String gdate); 
}
