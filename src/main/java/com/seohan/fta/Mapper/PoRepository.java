package com.seohan.fta.Mapper;

import com.seohan.fta.Domain.PoHeader;
import com.seohan.fta.Domain.PoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoRepository extends JpaRepository<PoHeader, PoId> {

    List<PoHeader> findByCogbAndPono(String cogb, String pono);

@Query("SELECT * FROM tprlib.PO_HEADER a inner join tprlib.PO_DETAIL b on a.co_gb = b.co_gb and a.po_no =b.po_no " +
        " where a.co_gb = {co_gb} and  PO_YMD = {co_gb}")
    List<PoHeader> findByCogbAndPoYmd(String cogb, String poYmd);
}
