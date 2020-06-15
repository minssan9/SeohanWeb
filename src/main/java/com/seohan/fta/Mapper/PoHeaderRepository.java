package com.seohan.fta.Mapper;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.seohan.fta.Domain.PoHeader;
import com.seohan.fta.Domain.PoHeaderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoHeaderRepository extends JpaRepository<PoHeader, PoHeaderId> {
//    List<PoHeader> findAll();

    @Query("SELECT a, b FROM tprlib.PO_HEADER a inner join tprlib.PO_DETAIL b on a.co_gb = b.co_gb and a.po_no =b.po_no " +
            " where a.co_gb = :cogb and  a.PO_NO = :pono")
    List<PoHeader> findByCogbAndPono(String cogb, String pono);

    @Query("SELECT a, b FROM tprlib.PO_HEADER a inner join tprlib.PO_DETAIL b on a.co_gb = b.co_gb and a.po_no =b.po_no " +
        " where a.co_gb = :cogb and  a.PO_YMD = :poYmd")
    List<PoHeader> findByCogbAndPoYmd(String cogb, String poYmd);


}
