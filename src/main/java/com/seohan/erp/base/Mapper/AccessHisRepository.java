package com.seohan.erp.base.Mapper;

import com.seohan.erp.base.Domain.AccessHis;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessHisRepository extends JpaRepository<AccessHis, Long> {
	Page<AccessHis> findAll(Pageable pageable);
}