package com.seohan.scheduler;

import com.seohan.erp.mat.Domain.ItemBalanceHeader;
import com.seohan.erp.mat.Domain.ItemBalanceHisOld;
import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import com.seohan.erp.mat.Mapper.ItemBalanceHeaderMapper;
import com.seohan.erp.mat.Repository.ItemBalanceHeaderRepository;
import com.seohan.erp.mat.Repository.ItemBalanceHisOldRepository;
import com.seohan.erp.mat.Repository.ItemBalanceHisRepository;
import com.seohan.erp.mat.Service.ItemBalanceService;
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
    private ItemBalanceHisRepository itemBalanceHisRepository;

    @Autowired
    private ItemBalanceService itemBalanceService;
    @Autowired
    private ItemBalanceHisOldRepository itemBalanceHisOldRepository;
    @Autowired
    private ItemBalanceHeaderRepository itemBalanceHeaderRepository;
    @Autowired
    private ItemBalanceHeaderMapper itemBalanceHeaderMapper;

    @Test
    public void saveBalanceTest(){
        String savingDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
        savingTime = "0900";
        itemBalanceService.saveBalanceNow();

//        List<ItemBalanceHis> savedItemList=  itemBalanceHisRepository.findByGdateAndGtime(savingDate, savingTime);
//        Assert.assertNotNull(itemBalanceHisOlds) ;
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
