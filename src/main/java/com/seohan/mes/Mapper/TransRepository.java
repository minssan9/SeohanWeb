package com.seohan.mes.Mapper;

import com.seohan.mes.Domain.Trans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransRepository extends JpaRepository<Trans, Long> {
    List<Trans> findByTrsdt(String trsdt);
}
