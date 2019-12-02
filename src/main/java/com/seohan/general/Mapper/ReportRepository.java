package com.seohan.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.general.Domain.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
	@Query(value="select a.* from SGLIB.PCMSTPF a where a.stat= :stat", nativeQuery=true)
	public List<Report> it_DamageListbyStat(@Param("stat") String stat) throws Exception; 

	@Query(value="select a.* from SGLIB.PCMSTPF a where a.rtime= :rtime", nativeQuery=true)
	public Report it_DamageListbyRdate(@Param("udate") String udate) throws Exception; 
}
