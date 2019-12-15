package com.seohan.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.CodeLib; 

@Repository
public interface CodeLibRepository extends JpaRepository<CodeLib, Long> { 
	@Query(value="select distinct a.* from SALIB.ACODERP A WHERE ADGUB NOT IN ('Q2','OD','MR','MP','22','GD','PY','00','M5','PB')", nativeQuery=true)
	public List<CodeLib> findAll();
	
	@Query(value="select distinct a.* from SALIB.ACODERP A WHERE ADGUB=:adgub", nativeQuery=true)
	public List<CodeLib> findByAdgub(@Param("adgub") String adgub) throws Exception;
	
	@Query(value="select distinct a.* from SALIB.ACODERP A WHERE ADGUB='31' and aref1='SHN' order by afill", nativeQuery=true)
	public List<CodeLib> findFact() throws Exception;
}
