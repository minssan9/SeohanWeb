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
                .savingDate(savingDate)
                .savingTime(savingTime)
                .oldDate(oldDate)
                .build();

        List<ItemBalanceHis> itembalanceHis = itemBalanceHisRepository.findByGdateAndGtime(savingDate, savingTime);

        if (itembalanceHis.isEmpty() || itembalanceHis == null) {
            targetTable = "smlib.itmbl0800";
            targetTable = "smlib.itmblhis";

            try {
                itemBalanceHisMapper.saveBalanceByDate(itemBalanceSaveQuery);

//                itemBalanceHisMapper.saveBalanceHisHeader(itemBalanceSaveQuery);

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

            }catch (Exception e ){
                //messageService.send(messageDto);
                e.printStackTrace();
            }finally {
            }
        }
        return itemBalanceHisRepository.findByGdateAndGtime(savingDate, savingTime);
    }


    @Transactional
    public void saveBalanceOld(String savingDateString, String savingTimeString) {
        String targetTable = "";

        LocalDate saveDate =LocalDate.parse(savingDateString, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate oldDateTime = saveDate.minusDays(150);
        String oldDate =oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        ItemBalanceSaveQuery itemBalanceSaveQuery =  ItemBalanceSaveQuery.builder()
                .savingDate(savingDateString)
                .savingTime(savingTimeString)
                .oldDate(oldDate)
                .build();

        List<ItemBalanceHisOld> itemBalanceHisOlds = itemBalanceHisOldRepository.findByGdateAndGtime(savingDateString, savingTimeString);

        if (itemBalanceHisOlds.isEmpty() || itemBalanceHisOlds == null) {
            try {
                itemBalanceHisOldMapper.saveOldBalanceByDate(itemBalanceSaveQuery);
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }

}