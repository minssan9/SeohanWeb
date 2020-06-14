package com.seohan.Scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Scheduler {

//	@Scheduled(cron = "0 0 18 * * ?")
//	public void cronJobSch() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date now = new Date();
//		String strDate = sdf.format(now);
//		System.out.println("Java cron job expression:: " + strDate);
//	}
//
//	@Scheduled(fixedDelay = 1000)
//	public void getStockDataSch() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date now = new Date();
//		String strDate = sdf.format(now);
//		System.out.println("Java cron job expression:: " + strDate);
//	}
}