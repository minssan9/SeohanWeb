package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.ItmblpfsubEntity;
import com.seohan.erp.mat.Domain.ItmblpfsubView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItmblpfsubViewRepository extends JpaRepository<ItmblpfsubView, Long> {
	@Override
	List<ItmblpfsubView> findAll();

	Page<ItmblpfsubView> findByWarhsAndItmnoContainsOrderByItmnoAscLocatAsc(String warhs, String itmno, Pageable pageable);


}
