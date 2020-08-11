package com.seohan;

import com.seohan.batch.ScheduledJobs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchTest {

    @Autowired
    private ScheduledJobs scheduledJobs;

    @Test
    public void saveBalanceJobSch() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        Date now = new Date();
        String strDate = sdf.format(now);

        scheduledJobs.saveBalance(strDate );
    }
}