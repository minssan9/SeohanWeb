package com.seohan.scheduler;

import com.seohan.erp.mat.Domain.ItemBalanceHeader;
import com.seohan.erp.mat.Domain.ItemBalanceHisOld;
import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import com.seohan.erp.mat.Mapper.ItemBalanceHeaderMapper;
import com.seohan.erp.mat.Repository.ItemBalanceHeaderRepository;
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

import static com.seohan.SeohanWebApplication.dateFormatString;
import static com.seohan.SeohanWebApplication.timeFormatString;

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

    @Autowired
    private ItemBalanceHeaderRepository itemBalanceHeaderRepository;
    @Autowired
    private ItemBalanceHeaderMapper itemBalanceHeaderMapper;

    @Test
    public void saveBalanceTest(){
        String savingDate = LocalDateTime.now().format(dateFormatString);
        String savingTime = LocalDateTime.now().format(timeFormatString);
        savingTime = "0900";
        boolean successSaveFlag = scheduledJobs.saveBalance(savingDate, savingTime);

//        List<ItemBalanceHis> savedItemList=  itemBalanceHisRepository.findByGdateAndGtime(savingDate, savingTime);

        Assert.assertEquals (successSaveFlag , true); ;
    }

    @Test
    public void saveBalanceOldTest(){
        String savingDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));

//        scheduledJobs.saveBalanceOldByDate(savingDate, savingTime);

//        List<ItemBalanceHisOld> itemBalanceHisOlds =  itemBalanceHisOldRepository.findByGdateAndGtime(savingDate, savingTime);
        List<ItemBalanceHisOld> itemBalanceHisOlds =  itemBalanceHisOldRepository.findByGdateAndGtimeAndBltypeAndAndIndateGreaterThan (savingDate, savingTime,"OLDDATE", "20200327");
        Assert.assertNotNull(itemBalanceHisOlds) ;
    }

    @Test
    public void saveBalanceHeaderTest(){
        String savingDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
        ItemBalanceSaveQuery itemBalanceSaveQuery = ItemBalanceSaveQuery.builder()
                .savingDate(savingDate)
                .savingTime("0800")
                .oldDate("")
                .build();
        itemBalanceHeaderMapper.saveBalanceHisHeader(itemBalanceSaveQuery);

        List<ItemBalanceHeader> itemBalanceHeaders =  itemBalanceHeaderRepository.findByGdateAndGtime(savingDate, savingTime);
        Assert.assertNotNull(itemBalanceHeaders) ;
    }
}
