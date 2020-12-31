package com.seohan.scheduler;

import com.seohan.erp.mat.Service.ItemBalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.seohan.SeohanWebApplication.dateFormatString;
import static com.seohan.SeohanWebApplication.timeFormatString;

@Slf4j
@Component
@Profile("prod")
public class Scheduler  {

	@Autowired
	private ItemBalanceService itemBalanceService;

	@Scheduled(cron = "0 0 8 * * ?")
	public void saveBalance08JobSch() {
		LocalDateTime now = LocalDateTime.now();
		String nowDate = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String nowTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));

		itemBalanceService.saveBalanceNow();

//		scheduledJobs.saveBalanceOldByDate(nowDate, nowTime );
		System.out.println("Java cron job expression:: " + nowDate + nowTime);
	}

	@Scheduled(cron = "0 0 0 * * ?")
	public void saveBalance00JobSch() {
		LocalDateTime now = LocalDateTime.now();
		String nowDate = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String nowTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));

		itemBalanceService.saveBalanceNow();

//		if (item)
//		scheduledJobs.saveBalanceOldByDate(nowDate, nowTime );
		log.info("Java cron job expression:: " + nowDate + nowTime);
//		System.out.println("Java cron job expression:: " + nowDate + nowTime);
	}

	@Scheduled(fixedDelay = 1000)
	public void getStockDataSch() {

	}
}