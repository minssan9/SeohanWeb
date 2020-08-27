package com.seohan.erp.lab.Mapper;

import com.seohan.erp.lab.Domain.LocaAlmEntity;
import com.seohan.erp.machine.Domain.OeeErrhisEntity;
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
