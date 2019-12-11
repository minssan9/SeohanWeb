package com.seohan.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seohan.general.Domain.Line;  

@Repository
public interface LineRepository extends JpaRepository<Line, Long> {

	List<Line> findByActgb(String stat);

	Line findByWrkct(String wrkct);  
}
