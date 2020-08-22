package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.Trans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransRepository extends JpaRepository<Trans, Long> {
    List<Trans> findByTrsdt(String trsdt);
}
