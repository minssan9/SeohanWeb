package com.seohan.scheduler;

import com.seohan.erp.mat.Domain.ItemBalanceHis;
import com.seohan.erp.mat.Domain.ItemBalanceHisOld;
import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import com.seohan.erp.mat.Mapper.ItemBalanceHisMapper;
import com.seohan.erp.mat.Mapper.ItemBalanceHisOldMapper;
import com.seohan.erp.mat.Repository.ItemBalanceHisOldRepository;
import com.seohan.erp.mat.Repository.ItemBalanceHisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class ScheduledJobs {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ItemBalanceHisMapper itemBalanceHisMapper;
    @Autowired
    private ItemBalanceHisRepository itemBalanceHisRepository;

    @Autowired
    private ItemBalanceHisOldRepository itemBalanceHisOldRepository;
    @Autowired
    private ItemBalanceHisOldMapper itemBalanceHisOldMapper;

    @Transactional
    public List<ItemBalanceHis> saveBalance(String savingDate, String savingTime) {
        String targetTable = "";
        LocalDate savingDateTime = LocalDate.parse(savingDate, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate oldDateTime = savingDateTime.plusDays(150);
        String oldDate =oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        ItemBalanceSaveQuery itemBalanceSaveQuery =  ItemBalanceSaveQuery.builder()
                .nowdate(savingDate)
                .savingtime(savingTime)
                .olddate(oldDate)
                .build();

        List<ItemBalanceHis> itembalanceHis = itemBalanceHisRepository.findByGdateAndGtime(savingDate, savingTime);

        if (itembalanceHis.isEmpty() || itembalanceHis == null) {
            targetTable = "smlib.itmbl0800";
            targetTable = "smlib.itmblhis";

            try {
                itemBalanceHisMapper.saveBalanceByDate(itemBalanceSaveQuery);

//                jdbcTemplate.batchUpdate(
//            "insert into " + targetTable + " (GDATE,GTIME,WARHS,ITMNO,QTY,TRIM,MNY) " +
//                "select cast(? AS char(8) CCSID 933)  gdate, cast(? AS char(4) CCSID 833) gtime, WARHS,ITMNO,SUM(QTY) QTY, TRIM, SUM(MNY) MNY from (  " +
//                    " SELECT DISTINCT  A.WARHS, A.ITMNO, SUM(A.ONHND) QTY, 0 TRIM, SUM(A.ONHND) *coalesce(CASE WHEN RIGHT(TRIM(A.WARHS),1) = 'B' AND GUBN = 'B' THEN FDANGA  ELSE PURDANGA END, 0) MNY  FROM SMLIB.ITMBLPF A  " +
//                    " INNER JOIN SMLIB.ITMSTPF ITM ON A.ITMNO = ITM.ITMNO  INNER JOIN SALIB.ACODERP C ON C.ADGUB = 'PJ' AND A.WARHS = C.ASGUB AND AREF1 = 'SHN'  " +
//                    " LEFT OUTER JOIN SMLIB.SAGBMST SG ON A.ITMNO = SG.GITEM AND ITM.CSTCD=SG.GVEND LEFT OUTER JOIN (SELECT ASGUB, ASDES, CASE WHEN TRIM(AFILL) > '0' THEN AFILL ELSE 0 END AFILL FROM SALIB.ACODERP WHERE ADGUB = 'PC' ) D ON ITM.PMJGB = D.ASGUB" +
//                    " LEFT OUTER JOIN (SELECT ITMNO, ROUND(MAX(DANGA),2) FDANGA FROM SMLIB.PURCTPF WHERE STRDT ='00000000' AND GAE in ('NC', 'C4', 'B4') GROUP BY ITMNO) F ON A.ITMNO = F.ITMNO  " +
//                    " LEFT OUTER JOIN (SELECT ITMNO, ROUND(MAX(DANGA),2) PURDANGA FROM SMLIB.PURCTPF WHERE STRDT = '00000000'  AND GAE IN ('B4', 'C4') GROUP BY ITMNO) PUR ON A.ITMNO = PUR.ITMNO  " +
//                    " WHERE RIGHT(TRIM(A.WARHS), 1) = 'B'   AND ONHND <> 0   GROUP BY A.WARHS, A.ITMNO, GUBN, FDANGA, PURDANGA" +
//                    " UNION ALL SELECT DISTINCT  A.WARHS, A.ITMNO, coalesce(A.QTY,0) QTY, 0 TRIM, coalesce(PUR.DANGA,0) * coalesce(A.QTY,0) MNY  FROM SMLIB.ITMSTPF ITM" +
//                    " INNER JOIN ( " +
//                        " SELECT A.WARHS, A.ITMNO, SUM(A.ONHND) QTY FROM SMLIB.ITMBLPF A  INNER JOIN SBLIB.WRKCTPF WA ON A.WARHS = WA.WRKCT  WHERE FACT NOT IN ('D', 'F') AND A.ONHND <> 0 AND WA.ACTGB = 'A' GROUP BY A.WARHS, A.ITMNO  " +
//                        " UNION ALL  SELECT WARHS, ITMNO, SUM(ONHND) QTY FROM SMLIB.ITMBLPF A  INNER JOIN SALIB.ACODERP B ON A.WARHS = B.ASGUB AND B.ADGUB = 'PJ' AND AREF1 = 'SHN' AND AFILL = ''  " +
//                        " WHERE RIGHT(TRIM(A.WARHS), 1) = 'Q' AND LEFT(WARHS,1) NOT IN ('D', 'F') AND A.ONHND <> 0 AND LENGTH(TRIM(A.WARHS)) = 2 GROUP BY A.WARHS, A.ITMNO  ) A ON   ITM.ITMNO = A.ITMNO" +
//                    " LEFT OUTER JOIN (  " +
//                        " SELECT DISTINCT ITM.ITMNO, coalesce(C.AFILL, ROUND(MAX(DANGA),2)) DANGA FROM SMLIB.ITMSTPF ITM  LEFT OUTER JOIN SMLIB.PURCTPF A ON ITM.ITMNO= A.ITMNO AND STRDT = '00000000'  " +
//                        " LEFT OUTER JOIN SALIB.ACODERP C ON C.ADGUB = 'PC' AND ITM.PMJGB = C.ASGUB AND AFILL > '0'  WHERE ITM.ITMNO <> ''  GROUP BY ITM.ITMNO, C.AFILL" +
//                    " ) PUR ON ITM.ITMNO = PUR.ITMNO  WHERE ACTGB <> '' AND coalesce(A.QTY,0)  <> 0   " +
//                    " UNION ALL SELECT   WARHS, ITM.ITMNO, coalesce(ONHND,0) QTY, 0 TRIM, ROUND(coalesce(ONHND,0) * coalesce(DANGA,0), 0) MNY   FROM SMLIB.ITMSTPF ITM " +
//                    " LEFT OUTER JOIN SMLIB.ITMBLPF BL ON ITM.ITMNO = BL.ITMNO AND RIGHT(TRIM(BL.WARHS), 1) IN ('A','W') AND BL.WARHS NOT IN ('A','FA','HA')  AND LOCAT <> 'SY' AND LENGTH(TRIM(BL.WARHS)) = 2 " +
//                    " LEFT OUTER JOIN (  " +
//                        " SELECT DISTINCT ITM.ITMNO, coalesce(C.AFILL, ROUND(MAX(DANGA),2), 0) DANGA FROM SMLIB.ITMSTPF ITM  LEFT OUTER JOIN SMLIB.PURCTPF A ON ITM.ITMNO= A.ITMNO AND STRDT = '00000000' " +
//                        " LEFT OUTER JOIN SALIB.ACODERP C ON C.ADGUB = 'PC' AND ITM.PMJGB = C.ASGUB AND AFILL > '0'  WHERE ITM.ITMNO <> ''  GROUP BY ITM.ITMNO, C.AFILL  " +
//                    ") PUR ON BL.ITMNO = PUR.ITMNO  INNER JOIN SALIB.ACODERP C ON C.ADGUB = 'PJ' AND BL.WARHS = C.ASGUB AND AREF1 = 'SHN'  " +
//                    " WHERE LEFT(WARHS,1) <> 'D' AND ONHND <> 0   " +
//                    " UNION ALL SELECT   CASE WHEN BL.WARHS IN ('FA','HA','A') THEN BL.WARHS ELSE LEFT(BL.WARHS,1) END WARHS, ITM.ITMNO, SUM(ONHND) QTY, 0 TRIM, ROUND(SUM(ONHND) * coalesce(DANGA,0),0) MNY  FROM SMLIB.ITMSTPF ITM  " +
//                    " LEFT OUTER JOIN SMLIB.ITMBLPF BL ON ITM.ITMNO = BL.ITMNO AND ONHND <> 0 AND (( BL.WARHS <> 'FA' AND LOCAT = '' ) OR BL.WARHS = 'FA' AND LOCAT IN ('M1', 'M2','') ) " +
//                    " LEFT OUTER JOIN ( " +
//                        " SELECT DISTINCT ITM.ITMNO, coalesce(C.AFILL, ROUND(MAX(DANGA),2)) DANGA FROM SMLIB.ITMSTPF ITM  LEFT OUTER JOIN SMLIB.PURCTPF A ON ITM.ITMNO= A.ITMNO AND STRDT = '00000000' AND GAE IN ('FA', 'C4', 'B4', 'AD')" +
//                        " LEFT OUTER JOIN SALIB.ACODERP C ON C.ADGUB = 'PC' AND ITM.PMJGB = C.ASGUB AND C.AFILL > '0'  WHERE ITM.ITMNO <> ''  GROUP BY ITM.ITMNO, C.AFILL  " +
//                    " ) PUR ON BL.ITMNO = PUR.ITMNO  INNER JOIN SALIB.ACODERP C ON C.ADGUB = 'PJ' AND BL.WARHS = C.ASGUB AND C.AREF1 = 'SHN'  INNER JOIN SALIB.ACODERP D ON D.ADGUB = '31' AND D.AREF1 = 'SHN' AND D.ASGUB = C.AFILL  " +
//                    " WHERE ITM.ACTGB <>'Z' AND BL.ONHND <> 0  GROUP BY BL.WARHS, ITM.ITMNO, DANGA ORDER BY WARHS, ITMNO " +
//                    " ) A GROUP BY GDATE,GTIME,WARHS,ITMNO, TRIM  \n",
//                new BatchPreparedStatementSetter() {
//                    @Override
//                    public void setValues(PreparedStatement ps, int i) throws SQLException {
//                        ps.setString(1, savingTime.substring(0, 8));
//                        ps.setString(2, savingTime.substring(8, 12));
//                    }
//                    @Override
//                    public int getBatchSize() {
//                        return 1;
//                    }
//                });


                jdbcTemplate.batchUpdate(
                        "insert into " + targetTable + " (GDATE,GTIME,WARHS,ITMNO,QTY,TRIM,MNY) " +
                        " SELECT DISTINCT cast(? AS char(8) CCSID 933)  gdate, cast(? AS char(4) CCSID 833) gtime, TRIM(A.WARHS) || '-L' , A.ITMNO, SUM(QTY), 0 FROM SMLIB.ITMBLPFSUB A" +
                        " INNER JOIN SMLIB.ITMSTPF B ON A.ITMNO = B.ITMNO " +
                        " WHERE  QTY <> 0 GROUP BY A.ITMNO, A.WARHS ORDER BY ITMNO  ",
                        new BatchPreparedStatementSetter() {
                            @Override
                            public void setValues(PreparedStatement ps, int i) throws SQLException {
                                ps.setString(1, savingTime.substring(0, 8));
                                ps.setString(2, savingTime.substring(8, 12));
                            }
                            @Override
                            public int getBatchSize() {
                                return 1;
                            }
                        });

                targetTable = "SMLIB.ITMBLHISHD";
                jdbcTemplate.batchUpdate(
                        "insert into " + targetTable + " (GDATE,GTIME,TIMEFLAG,TYPE,TYPEDS,FACT,WARHS,WARHS_NM,QTY,MNY,REF,FILL) " +
                                " SELECT cast(? AS char(8) CCSID 933)  gdate, cast(? AS char(4) CCSID 833) gtime, 'NOW', 'M' TYPE, '원재료' TYPEDS, LEFT(WARHS,1) FACT, WARHS, C.ASDES WARHS_NM, SUM(BL.QTY) QTY, SUM(MNY) MNY, '' REF,'' FILL  FROM SMLIB.ITMBL0800 BL " +
                                " INNER JOIN SALIB.ACODERP C ON C.ADGUB = 'PJ' AND BL.WARHS = C.ASGUB AND AREF1 = 'SHN'  INNER JOIN SMLIB.ITMSTPF ITM ON BL.ITMNO = ITM.ITMNO  " +
                                " where (GDATE = '20200707'  ) and WARHS in ('AB', 'BB', 'GB') AND QTY <> 0 AND GTIME = '0800'  GROUP BY GDATE, GTIME, LEFT(WARHS,1), WARHS, C.ASDES  " +
                                " Union All SELECT GDATE, GTIME, 'NOW', 'O' TYPE, '재공품' TYPEDS, FACT, WARHS, W.WRKDS WARHS_NM, SUM(BL.QTY) QTY, SUM(MNY) MNY, '' REF,'' FILL  FROM SMLIB.ITMBL0800 BL  " +
                                " INNER JOIN SBLIB.WRKCTPF W ON BL.WARHS = W.WRKCT " +
                                " where (GDATE = '20200707' ) AND GTIME = '0800' AND FACT NOT IN ('D', 'F') AND ACTGB = 'A' AND MNY > 0  GROUP BY GDATE, GTIME, FACT, WARHS,  W.WRKDS     " +
                                " Union All SELECT GDATE, GTIME, 'NOW', 'O' TYPE, '재공품' TYPEDS, left(BL.WARHS,1) FACT, WARHS, C.ASDES WARHS_NM, SUM(BL.QTY) QTY, SUM(MNY) MNY, '' REF,'' FILL  FROM SMLIB.ITMBL0800 BL " +
                                " INNER JOIN SALIB.ACODERP C ON C.ADGUB = 'PJ' AND BL.WARHS = C.ASGUB AND AREF1 = 'SHN'  " +
                                " where (GDATE = '20200707' ) AND RIGHT(TRIM(WARHS), 1) IN ('Q') AND  left(BL.WARHS,1) NOT IN ('D', 'F') AND LENGTH(TRIM(WARHS)) = 2 AND GTIME = '0800' AND MNY > 0  GROUP BY GDATE, GTIME, LEFT(WARHS,1), WARHS, C.ASDES      " +
                                " Union All SELECT GDATE, GTIME, 'NOW', 'Z' TYPE, '제품' TYPEDS, left(BL.WARHS,1) FACT, WARHS, C.ASDES WARHS_NM, SUM(BL.QTY) QTY, SUM(MNY) MNY, '' REF,'' FILL  From SMLIB.ITMBL0800 BL " +
                                " INNER JOIN SALIB.ACODERP C ON C.ADGUB = 'PJ' AND BL.WARHS = C.ASGUB AND AREF1 = 'SHN' " +
                                " where (GDATE = '20200707'  ) AND RIGHT(TRIM(WARHS), 1) IN ('A','W') AND WARHS NOT IN ('A','FA','HA', 'DA','WA') AND LENGTH(TRIM(WARHS)) = 2 AND GTIME = '0800'  GROUP BY GDATE, GTIME, LEFT(WARHS,1), WARHS, C.ASDES " +
                                " Union All SELECT GDATE, GTIME, 'NOW', 'Z' TYPE, '제품' TYPEDS, left(BL.WARHS,1) FACT, WARHS, C.ASDES WARHS_NM, SUM(BL.QTY) QTY, SUM(MNY) MNY, '' REF,'' FILL  From SMLIB.ITMBL0800 BL" +
                                " INNER JOIN SALIB.ACODERP C ON C.ADGUB = 'PJ' AND BL.WARHS = C.ASGUB AND AREF1 = 'SHN' " +
                                " where (GDATE = '20200707' ) AND LENGTH(TRIM(WARHS)) = 2   AND WARHS IN ('A','FA','HA') AND GTIME = '0800'  GROUP BY GDATE, GTIME, LEFT(WARHS,1), WARHS, C.ASDES  ",
                        new BatchPreparedStatementSetter() {
                            @Override
                            public void setValues(PreparedStatement ps, int i) throws SQLException {
                                ps.setString(1, savingTime.substring(0, 8));
                                ps.setString(2, savingTime.substring(8, 12));
                            }
                            @Override
                            public int getBatchSize() {
                                return 1;
                            }
                        });

            }catch (Exception e ){
                //messageService.send(messageDto);
            }finally {
            }
        }
        return itemBalanceHisRepository.findByGdateAndGtime(savingDate, savingTime);
    }


    @Transactional
    public void saveBalanceOld(String savingDateString, String savingTimeString) {
        String targetTable = "";

        LocalDate saveDate =LocalDate.parse(savingDateString, DateTimeFormatter.BASIC_ISO_DATE);

//        LocalDate savingDate = LocalDateTime.parse(savingDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate oldDateTime = saveDate.minusDays(150);
        String oldDate =oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        ItemBalanceSaveQuery itemBalanceSaveQuery =  ItemBalanceSaveQuery.builder()
                .nowdate(savingDateString)
                .savingtime(savingTimeString)
                .olddate(oldDate)
                .build();

        List<ItemBalanceHisOld> itemBalanceHisOlds = itemBalanceHisOldRepository.findByGdateAndGtime(savingDateString, savingTimeString);

        if (itemBalanceHisOlds.isEmpty() || itemBalanceHisOlds == null) {
            itemBalanceHisOldMapper.saveOldBalanceByDate(itemBalanceSaveQuery);
//            List<ItemBalanceHisOld> currentItemBalanceHisOlds =  itemBalanceHisOldMapper.getOldBalanceByDate(itemBalanceSaveQuery);

//            for (ItemBalanceHisOld itemBalanceHisOld: currentItemBalanceHisOlds) {
//                itemBalanceHisOldRepository.save(itemBalanceHisOld);
//            }
        }
    }

}