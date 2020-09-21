package com.seohan.erp.it.Repository;

import com.seohan.erp.it.Domain.ItDamage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItDamageRepository extends JpaRepository<ItDamage, Long> {


	@Modifying
	@Query(value="update SITLIB.IT_DAMAGE SET CTIME=:ctime where a.co_gb= :co_gb and a.rtime= :rtime ", nativeQuery=true)
	void updateItDamage(@Param("ctime") String ctime, @Param("co_gb") String co_gb, @Param("rtime") String rtime) throws Exception;

	List<ItDamage> findAll();

	List<ItDamage> findItDamageByStat(String stat);

	@Override
	Optional<ItDamage> findById(Long id);

	@Query(value="select a.* from SITLIB.IT_DAMAGE a where a.co_gb= :co_gb and a.rtime= :rtime", nativeQuery=true)
	ItDamage findItDamageByRtime(String co_gb, String rtime);
}
