package com.seohan.erp.machine.Mapper;

import com.seohan.erp.machine.Domain.OeeErrhisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OeeErrhisEntityRepository extends JpaRepository<OeeErrhisEntity, Long> {
	@Override
	List<OeeErrhisEntity> findAll();

	OeeErrhisEntity findSettingHisById(long id);

	List<OeeErrhisEntity> findSettingHisByStat(String stat);
}
