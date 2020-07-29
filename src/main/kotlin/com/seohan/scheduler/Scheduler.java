package com.seohan.scheduler;

import com.seohan.mat.Mapper.ItemBalanceHisRepository;
import com.seohan.mat.Mapper.ItemBalanceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class Scheduler  {
	@Autowired
	private ScheduledJobs scheduledJobs;

	@Scheduled(cron = "0 0 8 * * ?")
	public void saveBalanceJobSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		Date now = new Date();
		String strDate = sdf.format(now);

		scheduledJobs.saveBalance(strDate );
		System.out.println("Java cron job expression:: " + strDate); 
	}

	@Scheduled(fixedDelay = 1000)
	public void getStockDataSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
//		System.out.println("Java cron job expression:: " + strDate);
	}
}