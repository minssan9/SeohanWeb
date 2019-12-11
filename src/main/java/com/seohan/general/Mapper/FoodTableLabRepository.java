package com.seohan.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seohan.general.Domain.FoodTableLab; 

@Repository
public interface FoodTableLabRepository extends JpaRepository<FoodTableLab, Long> {

	List<FoodTableLab> findByGdate(String gdate); 
}
