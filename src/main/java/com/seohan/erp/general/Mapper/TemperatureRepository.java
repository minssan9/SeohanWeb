package com.seohan.erp.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.erp.general.Domain.TemperatureData;

@Repository
public interface TemperatureRepository extends JpaRepository<TemperatureData, Long> { 
	
	@Query(value="SELECT A.WARHS, A.LINE, B.TEMPER, B.HUMIDITY, IFNULL(C.LOC,'')LOC, A.BIGO, IFNULL(C.VISIBLE,'Y')VISIBLE, A.CRT_DATE, ''TEMP, " + 
				"CASE WHEN (DOUBLE(TEMPER_MIN) <= TEMPER AND  DOUBLE(TEMPER) <= TEMPER_MAX) THEN 'Y' ELSE 'N' END T_CHK, " + 
				"CASE WHEN (DOUBLE(HUMID_MIN) <= HUMIDITY AND  DOUBLE(HUMIDITY) <= HUMID_MAX) THEN 'Y' ELSE 'N' END H_CHK," + 
				"A.T_CYCLE, B.DTIME " + 
				"FROM GMLIB.TEMPERHD A " + 
				"INNER JOIN ( " + 
				"	SELECT A.* FROM GMLIB.TEMPERDT A " + 
				"	INNER JOIN (SELECT LINE ,MAX(DTIME) DTIME FROM GMLIB.TEMPERDT WHERE CO_GB = :CO_GB   GROUP BY LINE) B ON A.LINE = B.LINE AND A.DTIME = B.DTIME " + 
				") B ON A.CO_GB = B.CO_GB AND A.WARHS = B.WARHS AND A.LINE = B.LINE " + 
				"LEFT OUTER JOIN GMLIB.TEMPERPNL C ON A.CO_GB = C.CO_GB AND A.WARHS = C.WARHS AND A.LINE = C.LINE  AND C.SABUN = :id " + 
				"WHERE A.CO_GB = :CO_GB AND A.STATE = 'Y' ORDER BY CRT_DATE", nativeQuery=true)
	public List<TemperatureData> TemperatureDataList(@Param("CO_GB") String co_gb, @Param("id") String id) throws Exception;  
}
