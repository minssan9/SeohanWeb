package com.seohan.fta.Mapper;

import com.seohan.fta.Domain.PoHeader;
import com.seohan.fta.Domain.PoHeaderId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PoHeaderRepository extends JpaRepository<PoHeader, PoHeaderId> {
//    List<PoHeader> findAll();

    @Query(value = "select distinct a, b from PoHeader a " +
            " left join com.seohan.fta.Domain.PoDetail b on a.cogb=b.cogb and a.pono=b.pono  " +
            " where a.cogb=:cogb and a.pono=:pono")
    PoHeader findByCogbAndPono(@Param("cogb") String cogb, @Param("pono") String pono);

//    @Query(value =
//            " SELECT a.*, b.* FROM tprlib.PO_HEADER a " +
//            " inner join tprlib.PO_DETAIL b on a.co_gb = b.co_gb and a.po_no =b.po_no " +
//            " where a.co_gb = :cogb and  a.PO_YMD = :poYmd", nativeQuery=true)

    @Query(value = "select a, b from PoHeader a " +
            " left join com.seohan.fta.Domain.PoDetail b on a.cogb=b.cogb and a.pono=b.pono " +
            " where a.cogb=:cogb and a.poYmd=:poYmd")
    List<PoHeader> findByCogbAndPoYmd(String cogb, String poYmd);


}
