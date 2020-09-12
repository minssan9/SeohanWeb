package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.LocaAlmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocaAlmEntityRepository extends JpaRepository<LocaAlmEntity, Long> {
	@Override
	List<LocaAlmEntity> findAll();

	LocaAlmEntity findLocaAlmEntityById(long id);

	List<LocaAlmEntity> findLocaAlmEntityByGubnAndSts(String gubn, String sts);
}
