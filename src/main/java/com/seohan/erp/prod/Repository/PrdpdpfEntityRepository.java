package com.seohan.erp.prod.Repository;

import com.seohan.erp.prod.Domain.PrdpdpfEntity;
import com.seohan.erp.prod.Dto.ProdPlanDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrdpdpfEntityRepository extends JpaRepository<PrdpdpfEntity, String> {
	@Override
	List<PrdpdpfEntity> findAll();

	@Query(value="select a.* from sblib.prdpdpf a where wrkct=:wrkct and pldte=:pldte ", nativeQuery=true)
//	List<PrdpdpfEntity> findPrdpdpfEntitiesByPldteAndWrkct(ProdPlanDto prodPlanDto);
	List<PrdpdpfEntity> findPrdpdpfEntitiesByPldteAndWrkct(String pldte,String wrkct);
}
