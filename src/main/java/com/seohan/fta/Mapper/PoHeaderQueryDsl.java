//package com.seohan.fta.Mapper;
//
//import com.seohan.fta.Domain.PoHeader;
//import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class PoHeaderQueryDsl extends QuerydslRepositorySupport {
//    public PoHeaderQueryDsl() {
//        super(PoHeader.class);
//    }
//
//    public List<PoHeader> findAllWithStudent() {
//        QPoHeader poHeader = QPoHeader.poHeader;
//        QPoDetail poDetail = QPoDetail.poDetail;
//        return from(poHeader).leftJoin(poHeader.wedulStudentList, poDetail ).fetchJoin().distinct().fetch();
//    }
//}
