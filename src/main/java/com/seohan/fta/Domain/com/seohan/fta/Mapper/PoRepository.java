package com.seohan.fta.Domain.com.seohan.fta.Mapper;

import com.seohan.fta.Domain.PoHeader;
import com.seohan.general.Domain.FoodTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoRepository extends JpaRepository<PoHeader, Long> {

    public List<PoHeader> findByCogbAndPono(String co_gb, String po_no);
}
