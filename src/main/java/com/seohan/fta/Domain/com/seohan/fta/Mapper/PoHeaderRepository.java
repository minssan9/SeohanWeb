package com.seohan.fta.Domain.com.seohan.fta.Mapper;

import com.seohan.fta.Domain.PoHeader;
import com.seohan.general.Domain.FoodTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoHeaderRepository extends JpaRepository<PoHeader, Long> {

    public List<PoHeader> findByCO_GBAndPO_NO(String CO_GB, String PO_NO);
}
