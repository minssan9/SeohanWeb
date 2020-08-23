package com.seohan.scheduler;

import com.seohan.erp.mat.Domain.ItemBalanceHeader;
import com.seohan.erp.mat.Domain.ItemBalanceHis;
import com.seohan.erp.mat.Domain.ItemBalanceHisOld;
import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import com.seohan.erp.mat.Mapper.ItemBalanceHeaderMapper;
import com.seohan.erp.mat.Mapper.ItemBalanceHisMapper;
import com.seohan.erp.mat.Mapper.ItemBalanceHisOldMapper;
import com.seohan.erp.mat.Repository.ItemBalanceHeaderRepository;
import com.seohan.erp.mat.Repository.ItemBalanceHisOldRepository;
import com.seohan.erp.mat.Repository.ItemBalanceHisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class ScheduledJobs {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ItemBalanceHisMapper itemBalanceHisMapper;
    @Autowired
    private ItemBalanceHisRepository itemBalanceHisRepository;

    @Autowired
    private ItemBalanceHeaderMapper itemBalanceHeaderMapper;
    @Autowired
    private ItemBalanceHeaderRepository itemBalanceHeaderRepository;

    @Autowired
    private ItemBalanceHisOldRepository itemBalanceHisOldRepository;
    @Autowired
    private ItemBalanceHisOldMapper itemBalanceHisOldMapper;

    @Transactional
    public Boolean saveBalance(String savingDateString, String savingTimeString) {

        LocalDate savingDateTime = LocalDate.parse(savingDateString, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate oldDateTime = savingDateTime.plusDays(150);
        String oldDate = oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        ItemBalanceSaveQuery itemBalanceSaveQuery = ItemBalanceSaveQuery.builder()
                .savingDate(savingDateString)
                .savingTime(savingTimeString)
                .oldDate(oldDate)
                .build();

        try {
            List<ItemBalanceHis> itembalanceHis = itemBalanceHisRepository.findByGdateAndGtime(savingDateString, savingTimeString);
            if (itembalanceHis.isEmpty() || itembalanceHis == null) {
                itemBalanceHisMapper.saveBalanceByDate(itemBalanceSaveQuery);
                itemBalanceHisMapper.saveBalanceHisLot(itemBalanceSaveQuery);

            }

            List<ItemBalanceHeader> itembalanceHeader = itemBalanceHeaderRepository.findByGdateAndGtime(savingDateString, savingTimeString);
            if (itembalanceHeader.isEmpty() || itembalanceHeader == null) {
                itemBalanceHeaderMapper.saveBalanceHisHeader(itemBalanceSaveQuery);
            }


            List<ItemBalanceHisOld> itemBalanceHisOlds = itemBalanceHisOldRepository.findByGdateAndGtime(savingDateString, savingTimeString);

            if (itemBalanceHisOlds.isEmpty() || itemBalanceHisOlds == null) {
                itemBalanceHisOldMapper.saveOldBalanceByDate(itemBalanceSaveQuery);
            }
            return true;
        } catch (Exception e) {
            //messageService.send(messageDto);

            e.printStackTrace();
            return false;
        }
    }


    @Transactional
    public void saveBalanceOld(String savingDateString, String savingTimeString) {
        String targetTable = "";

        LocalDate saveDate = LocalDate.parse(savingDateString, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate oldDateTime = saveDate.minusDays(150);
        String oldDate = oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        ItemBalanceSaveQuery itemBalanceSaveQuery = ItemBalanceSaveQuery.builder()
                .savingDate(savingDateString)
                .savingTime(savingTimeString)
                .oldDate(oldDate)
                .build();
    }

}