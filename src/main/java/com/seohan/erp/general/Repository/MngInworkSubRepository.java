package com.seohan.erp.general.Repository;

import com.seohan.erp.general.Domain.MngInworkmstEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MngInworkSubRepository extends JpaRepository<MngInworkmstEntity, Long> {
    @Override
    Page<MngInworkmstEntity> findAll(Pageable pageable);

    Page<MngInworkmstEntity> findByRdate(String rdate, Pageable pageable);
}
