package com.seohan.Scheduler;

import com.seohan.mat.Domain.ItemBalance;
import com.seohan.mat.Domain.ItemBalanceHis;
import com.seohan.mat.Mapper.ItemBalanceHisRepository;
import com.seohan.mat.Mapper.ItemBalanceRepository;
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.core.IsNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class Scheduler {
	@Autowired
	private ItemBalanceRepository itemBalanceRepo;

	@Autowired
	private ItemBalanceHisRepository itemBalanceHisRepo;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Scheduled(cron = "0 0 8 * * ?")
	public void cronJobSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		Date now = new Date();
		String strDate = sdf.format(now);

		List<ItemBalance> itemBalances= itemBalanceRepo.findAll();
		List<ItemBalanceHis> itembalanceHis = itemBalanceHisRepo.findByGdateAndGtime(
				strDate.substring(0,8), strDate.substring(9,12));

		if(itembalanceHis.isEmpty() || itembalanceHis == null ){
			jdbcTemplate.batchUpdate("insert into smlib.itmbl0800 (GDATE,GTIME,WARHS,ITMNO,QTY,TRIM,MNY) " +
							"select ? gdate, ? gtime ,WARHS,ITMNO,QTY,TRIM,MNY from smlib.itmblpf ",
					new BatchPreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setString(1, strDate.substring(0,8));
							ps.setString(2, strDate.substring(9,13));
						}
						@Override
						public int getBatchSize() {
							return 1;
						}
					});
		};


itemBalanceHisRepo.save(itembalanceHis)
//		now.getHours()

		System.out.println("Java cron job expression:: " + strDate);
	}

	@Scheduled(fixedDelay = 1000)
	public void getStockDataSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Java cron job expression:: " + strDate);
	}
}