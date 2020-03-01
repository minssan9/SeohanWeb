package com.seohan.base.Mapper;

import java.util.List;

import com.seohan.base.Domain.ItemView;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemView, Long> {	
	@Query(value="select distinct a.* from SMLIB.ITMSTPF_VW A WHERE ACTGB=:actgb", nativeQuery=true)
	List<ItemView> findByActgb(String actgb);		
	@Query(value="select distinct a.* from SMLIB.ITMSTPF_VW A WHERE ITMNO=:itmno", nativeQuery=true)
	ItemView findByItmno(String itmno);
	@Query(value="select distinct a.* from SMLIB.ITMSTPF_VW A WHERE pumgb=:pumgb", nativeQuery=true)
	List<ItemView> findByPumgb(String pumgb);  
}
