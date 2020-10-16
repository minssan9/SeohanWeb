package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.ImportPlan;
import com.seohan.erp.mat.Domain.ItmblpfsubEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItmblpfsubRepository extends JpaRepository<ItmblpfsubEntity, Long> {
	@Override
	List<ItmblpfsubEntity> findAll();

	List<ItmblpfsubEntity> findByWarhsAndItmnoContains(String warhs, String itmno);

	ItmblpfsubEntity findByWarhsAndLocatAndItmno(String warhs , String locat, String itmno);

}
