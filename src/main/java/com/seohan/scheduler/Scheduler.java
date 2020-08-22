package com.seohan.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Slf4j
@Component
public class Scheduler  {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");

	@Autowired
	private com.seohan.scheduler.ScheduledJobs scheduledJobs;

	@Scheduled(cron = "0 0 8 * * ?")
	public void saveBalanceJobSch() {
		LocalDateTime now = LocalDateTime.now();
		String nowDate = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String nowTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));
		scheduledJobs.saveBalance(nowDate, nowTime );

		scheduledJobs.saveBalanceOld(nowDate, nowTime );
		System.out.println("Java cron job expression:: " + nowDate + nowTime);
	}

	@Scheduled(fixedDelay = 1000)
	public void getStockDataSch() {

	}
}