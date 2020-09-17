package com.seohan.erp.prod.Repository;

import com.seohan.erp.mat.Domain.ItemBalance;
import com.seohan.erp.prod.Domain.PrdpdpfEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrdpdpfEntityRepository extends JpaRepository<PrdpdpfEntity, Long> {
	@Override
	List<PrdpdpfEntity> findAll(); 
}
