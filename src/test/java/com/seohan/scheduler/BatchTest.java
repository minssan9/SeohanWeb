package com.seohan.scheduler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchTest {

    @Autowired
    private ScheduledJobs scheduledJobs;

    @Test
    public void saveBalanceJobSch() throws Exception {

        LocalDateTime now = LocalDateTime.now();
        String nowDate = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String nowTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));
        nowTime = "220000";
        scheduledJobs.saveBalance(nowDate, nowTime );
    }

    @Test
    public void saveBalanceOldJobSch() throws Exception {

        LocalDateTime now = LocalDateTime.now();
        String nowDate = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String nowTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));
        nowTime = "220000";
        scheduledJobs.saveBalanceOldByDate(nowDate, nowTime );
    }
}