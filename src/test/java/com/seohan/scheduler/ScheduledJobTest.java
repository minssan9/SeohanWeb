package com.seohan.scheduler;

import com.seohan.erp.mat.Domain.ItemBalanceHis;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScheduledJobTest {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");

    @Autowired
    private ScheduledJobs scheduledJobs;

    @Test
    public void saveBalanceTest(){
        String strDate = sdf.format(new Date());
        List<ItemBalanceHis> savedItemList = scheduledJobs.saveBalance(strDate);
        Assert.assertNotNull(savedItemList) ;
    }
}
