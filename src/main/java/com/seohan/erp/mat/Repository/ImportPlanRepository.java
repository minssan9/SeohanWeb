package com.seohan.erp.mat.Repository;

import com.seohan.erp.mat.Domain.ImportPlan;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Dto.ImportPlanAlarmQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.util.List;


@Repository
public interface ImportPlanRepository extends JpaRepository<ImportPlan, Long> {
	@Override
	List<ImportPlan> findAll();

	@Query(value = " SELECT DISTINCT JDATE FROM SMLIB.PUR_PLNA WHERE STAT ='S' AND SABUN = :empid ", nativeQuery = true)
	String findMaxWorkDate(String empid);

	ImportPlan findByWarhsAndItmno(String warhs, String itmno);

	@Query(name="findGetOmissionItemList", value =
			"SELECT A.CSTCD, A.ITMNO, B.WARHS, B.MQTY, C.BSQTY, C.TSQTY, D.PRE_QTY, " +
					"(B.MQTY - C.BSQTY + D.PRE_QTY -  C.TSQTY) EXPQTY, F.DSCRP, E.CUSNA  FROM ( " +
					"SELECT CSTCD, ITMNO FROM SMLIB.CSTPLT WHERE ACTGB != 'C'  AND FILL1 = :userid " +
					") A " +
					"Inner Join  (SELECT ITMNO, WARHS, MQTY FROM SMLIB.PUR_BALSET WHERE  GDATE = :workdate ) B ON A.ITMNO = B.ITMNO " +
					"LEFT OUTER JOIN ( " +
					"SELECT CSTCD, WARHS, MITMNO, " +
					"SUM(CASE WHEN PDATE != :todate THEN SSQTY ELSE 0 END) BSQTY, " +
					"SUM(CASE WHEN PDATE = :todate THEN SSQTY ELSE 0 END) TSQTY  FROM SMLIB.PUR_PLNB " +
					"WHERE PDATE BETWEEN :workdate AND :todate GROUP BY CSTCD,WARHS, MITMNO " +
					") C ON A.ITMNO = C.MITMNO AND A.CSTCD =C.CSTCD AND B.WARHS = C.WARHS " +
					"LEFT OUTER JOIN ( " +
					"SELECT  CSTCD, WARHS, ITMNO, " +
					"(SUM(CASE WHEN LEFT(TRSCD, 1) = 'R' AND TRGAE NOT IN ('AG','SC') AND LOTNO != 'SSSSSS' THEN QUNTY ELSE 0 END) " +
					"- SUM(CASE WHEN LEFT(TRSCD, 1) = 'I' AND TRGAE = 'AG' AND LOTNO != 'SSSSSS' THEN QUNTY ELSE 0 END)) PRE_QTY  FROM SMLIB.TRANSPF " +
					"WHERE TRSDT BETWEEN  :workdate AND :fromdate GROUP BY CSTCD,WARHS, ITMNO " +
					") D ON A.ITMNO = D.ITMNO AND A.CSTCD = D.CSTCD AND B.WARHS = D.WARHS " +
					"INNER JOIN SALIB.CUSTP E ON A.CSTCD= E.CODE1||E.CODE2 " +
					"INNER JOIN SMLIB.ITMSTPF F ON A.ITMNO = F.ITMNO " +
					"WHERE (B.MQTY - C.BSQTY + D.PRE_QTY -  C.TSQTY) < 0 ", nativeQuery = true )
	List<ImportPlanAlarm> findGetOmissionItemList(@Param("userid") String userid, @Param("workdate") String workdate,
												  @Param("fromdate") String fromdate, @Param("todate") String todate  );

}
