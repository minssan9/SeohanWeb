package com.seohan.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageJobs {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    private ItemBalanceHisRepository itemBalanceHisRepo;
//
//    public void saveBalance(String savingTime) {
//        String targetTable = "";
//
//        List<ItemBalanceHis> itembalanceHis = itemBalanceHisRepo.findByGdateAndGtime(
//                savingTime.substring(0, 8), savingTime.substring(8, 12));
//
//        if (itembalanceHis.isEmpty() || itembalanceHis == null) {
//            targetTable = "smlib.itmbl0800";
//            targetTable = "smlib.itmblhis";
//            jdbcTemplate.batchUpdate("insert into " + targetTable + " (GDATE,GTIME,WARHS,ITMNO,QTY,TRIM,MNY) " +
//                            "select cast(? AS char(8) CCSID 933)  gdate, cast(? AS char(4) CCSID 833) gtime ,WARHS,ITMNO,ONHND,0,0 from smlib.itmblpf ",
//                    new BatchPreparedStatementSetter() {
//                        @Override
//                        public void setValues(PreparedStatement ps, int i) throws SQLException {
//                            ps.setString(1, savingTime.substring(0, 8));
//                            ps.setString(2, savingTime.substring(8, 12));
//                        }
//
//                        @Override
//                        public int getBatchSize() {
//                            return 1;
//                        }
//                    });
//        }
//    }

}