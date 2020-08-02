package com.seohan.mat.Mapper;

import com.seohan.mat.Domain.ImportPlan;
import com.seohan.mat.Domain.ItemBalance;
import com.seohan.mat.Dto.ImportPlanAlarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImportPlanRepository extends JpaRepository<ImportPlan, Long> {
	@Override
	List<ImportPlan> findAll();

	ItemBalance findByWarhsAndItmno(String warhs, String itmno);

//	List<ImportPlan> findByStat(String stat);
//	List<ImportPlan> importPlanListbyUdate(String udate);

	@Query(value = " SELECT DISTINCT JDATE FROM SMLIB.PUR_PLNA WHERE STAT ='S' AND SABUN = :empid " , nativeQuery=true)
	String findMaxWorkDate(String empid);

	@Query(value =
" SELECT A.CSTCD, A.ITMNO, B.WARHS, B.MQTY, C.BSQTY,C.TSQTY, D.PRE_QTY, (B.MQTY - C.BSQTY + D.PRE_QTY -  C.TSQTY) EXPQTY , E.CUSNA,F.DSCRP FROM (" +
	" SELECT CSTCD, ITMNO FROM SMLIB.CSTPLT WHERE ACTGB <> 'C'  AND FILL1 = :userid " +
" ) A " +
" Inner Join  (SELECT ITMNO, WARHS, MQTY FROM SMLIB.PUR_BALSET WHERE  GDATE = :workDate) B ON A.ITMNO = B.ITMNO" +
" LEFT OUTER JOIN (" +
	" SELECT CSTCD, WARHS, MITMNO," +
		" SUM(CASE WHEN PDATE <> :toDate THEN SSQTY ELSE 0 END) BSQTY, " +
		" SUM(CASE WHEN PDATE = :toDate THEN SSQTY ELSE 0 END) TSQTY  FROM SMLIB.PUR_PLNB " +
	" WHERE PDATE BETWEEN :workDate AND :toDate GROUP BY CSTCD,WARHS, MITMNO " +
") C ON A.ITMNO = C.MITMNO AND A.CSTCD =C.CSTCD AND B.WARHS = C.WARHS " +
" LEFT OUTER JOIN (" +
	" SELECT  CSTCD, WARHS, ITMNO, " +
	" (SUM(CASE WHEN LEFT(TRSCD, 1) = 'R' AND TRGAE NOT IN ('AG','SC') AND LOTNO <> 'SSSSSS' THEN QUNTY ELSE 0 END) " +
	" - SUM(CASE WHEN LEFT(TRSCD, 1) = 'I' AND TRGAE = 'AG' AND LOTNO <> 'SSSSSS' THEN QUNTY ELSE 0 END)) PRE_QTY  FROM SMLIB.TRANSPF " +
	" WHERE TRSDT BETWEEN :workDate AND :fromDate  GROUP BY CSTCD,WARHS, ITMNO" +
" ) D ON A.ITMNO = D.ITMNO AND A.CSTCD = D.CSTCD AND B.WARHS = D.WARHS " +
" INNER JOIN SALIB.CUSTP E ON A.CSTCD= E.CODE1||E.CODE2" +
" INNER JOIN SMLIB.ITMSTPF F ON A.ITMNO = F.ITMNO" +
" WHERE (B.MQTY - C.BSQTY + D.PRE_QTY -  C.TSQTY) < 0 ", nativeQuery=true)
	List<ImportPlanAlarm> findGetOmissionItemList(String fromDate, String toDate, String workDate, String userid);

}
