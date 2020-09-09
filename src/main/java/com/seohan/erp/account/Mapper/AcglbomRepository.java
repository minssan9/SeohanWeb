package com.seohan.erp.account.Mapper;

import com.seohan.erp.account.Domain.AcglbomEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcglbomRepository extends JpaRepository<AcglbomEntity, Long> {
	Page<AcglbomEntity> findAll(Pageable pageable);

	AcglbomEntity findByItmno(String itmno);

	@Query(value="select distinct a.* from SMLIB.ITMSTPF_VW A WHERE ACTGB=:actgb", nativeQuery=true)
	Page<AcglbomEntity> findByActgb(String actgb, Pageable pageable);

	Page<AcglbomEntity> findByItmnoContains(String itmno, Pageable pageable);

	Page<AcglbomEntity> findByItmnoContainsOrPumgbContains(String itmno, String pumgb, Pageable pageable);


	@Query(value="select distinct a.* from SMLIB.ITMSTPF_VW A WHERE pumgb=:pumgb", nativeQuery=true)
	List<AcglbomEntity> findByPumgb(String pumgb, Pageable pageable);
}