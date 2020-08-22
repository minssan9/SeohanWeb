package com.seohan.scheduler;

import com.seohan.erp.mat.Domain.ItemBalanceHis;
import com.seohan.erp.mat.Domain.ItemBalanceHisOld;
import com.seohan.erp.mat.Repository.ItemBalanceHisOldRepository;
import com.seohan.erp.mat.Repository.ItemBalanceHisRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ScheduledJobTest {

    @Autowired
    private ScheduledJobs scheduledJobs;

    @Autowired
    private ItemBalanceHisRepository itemBalanceHisRepository;

    @Autowired
    private ItemBalanceHisOldRepository itemBalanceHisOldRepository;

    @Test
    public void saveBalanceTest(){
        String savingDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
        savingTime = "0900";
        boolean successSaveFlag = scheduledJobs.saveBalance(savingDate, savingTime);

//        List<ItemBalanceHis> savedItemList=  itemBalanceHisRepository.findByGdateAndGtime(savingDate, savingTime);

        Assert.assertEquals (successSaveFlag , true); ;
    }

    @Test
    public void saveBalanceOldTest(){
        String savingDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
        scheduledJobs.saveBalanceOld(savingDate, savingTime);

        List<ItemBalanceHisOld> itemBalanceHisOlds =  itemBalanceHisOldRepository.findByGdateAndGtime(savingDate, savingTime);
        Assert.assertNotNull(itemBalanceHisOlds) ;
    }


}
