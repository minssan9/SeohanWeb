package com.seohan.base.Mapper;

import java.util.List;

import com.seohan.base.Domain.ItemView;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemView, Long> {	
	List<ItemView> findByActgb(String actgb);		
	ItemView findByItmno(String itmno);
	List<ItemView> findByPumgb(String pumgb);  
}
