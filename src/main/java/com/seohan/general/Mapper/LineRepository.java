package com.seohan.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seohan.general.Domain.LineView;  

@Repository
public interface LineRepository extends JpaRepository<LineView, Long> {
	
	List<LineView> findByActgb(String actgb);
	
	List<LineView> findByFact(String fact);
	
	LineView findByWrkct(String wrkct);  
}
