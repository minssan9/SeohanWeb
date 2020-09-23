package com.seohan.erp.general.Repository;

import com.seohan.erp.general.Domain.MngInworkmstEntity;
import com.seohan.erp.general.Domain.Report;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MngInworkRepository extends JpaRepository<MngInworkmstEntity, Long> {
    @Override
    Page<MngInworkmstEntity> findAll(Pageable pageable);

    Page<MngInworkmstEntity> findByRdate(String rdate, Pageable pageable);
}
