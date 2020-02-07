package com.seohan.general.Mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.seohan.general.Domain.ItDamage;

@Repository
public interface ItDamageRepository extends JpaRepository<ItDamage, Long> {
//	@Query(value="select a.* from SITLIB.IT_DAMAGE a where a.co_gb= :co_gb and a.stat= :stat", nativeQuery=true)
//	public List<ItDamage> findbyStat(@Param("co_gb") String co_gb, @Param("stat") String stat) throws Exception; 
	

//	@Query(value="select a.* from SITLIB.IT_DAMAGE a where a.co_gb= :co_gb and a.rtime= :rtime", nativeQuery=true)
//	public It_Damage it_DamageListbyRdate(@Param("co_gb") String co_gb, @Param("rtime") String rtime) throws Exception; 
		
	@Modifying
	@Query(value="update SITLIB.IT_DAMAGE SET CTIME=:ctime where a.co_gb= :co_gb and a.rtime= :rtime ", nativeQuery=true)
	public void updateItDamage(@Param("ctime") String ctime, @Param("co_gb") String co_gb, @Param("rtime") String rtime) throws Exception;
 
	public List<ItDamage> findAll(); 

	public List<ItDamage> findItDamageByStat(String stat);

	@Query(value="select a.* from SITLIB.IT_DAMAGE a where a.co_gb= :co_gb and a.rtime= :rtime", nativeQuery=true)
	public ItDamage findItDamageByRtime(String co_gb, String rtime); 
}
