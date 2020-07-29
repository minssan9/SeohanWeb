package com.seohan.erp.fta.Mapper;

import com.seohan.erp.fta.Domain.*;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static com.querydsl.core.group.GroupBy.groupBy;

@RequiredArgsConstructor
public class PoHeaderRepositoryImpl implements PoHeaderRepositoryCustom {
//    private final JPAQueryFactory queryFactory;

    @Override
    public List<PoHeader> poList(String cogb, String pono){
//        QPoHeader poHeader = QPoHeader.poHeader;
//        QPoDetail poDetail = QPoDetail.poDetail;
//
        List<PoHeader> foundPoHeader= new ArrayList<>();
//        List<PoHeader> foundPoHeader= queryFactory
//                .selectFrom(poHeader)
//                .leftJoin(poHeader.poDetails, poDetail)
//                .where(poHeader.pono.eq("PO20200608043"), poHeader.cogb.eq("SEOHAN"))
//                .fetch();
        return foundPoHeader;
    }
}
