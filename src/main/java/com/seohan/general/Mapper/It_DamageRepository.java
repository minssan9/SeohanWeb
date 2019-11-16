package com.seohan.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seohan.general.Domain.It_Damage;

@Repository
public interface It_DamageRepository extends JpaRepository<It_Damage, Long> {
	@Query(value="select a.* from SITLIB.IT_DAMAGE a.where a.stat= :stat", nativeQuery=true)
	public List<It_Damage> it_DamageListbyStat(@Param("stat") String stat) throws Exception; 
}
