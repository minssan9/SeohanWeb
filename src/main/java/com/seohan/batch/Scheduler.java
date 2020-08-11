package com.seohan.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class Scheduler  {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");

	@Autowired
	private ScheduledJobs scheduledJobs;

	@Scheduled(cron = "0 0 8 * * ?")
	public void saveBalanceJobSch() {
		String strDate = sdf.format(new Date());
		scheduledJobs.saveBalance(strDate );
		System.out.println("Java cron job expression:: " + strDate); 
	}

	@Scheduled(fixedDelay = 1000)
	public void getStockDataSch() {
		String strDate = sdf.format(new Date());
		scheduledJobs.saveBalance(strDate );
//		System.out.println("Java cron job expression:: " + strDate);
	}
}