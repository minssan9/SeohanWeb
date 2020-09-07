package com.seohan.erp.mat.Service;

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
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@Slf4j
public class ItemBalanceServiceImpl implements ItemBalanceService{

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

    @Override
    @Transactional
    public void saveBalanceNow() {
        LocalDateTime savingDateTime = LocalDateTime.now();
        LocalDateTime oldDateTime = savingDateTime.minusDays(150);
        String oldDate = oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingDateString = savingDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingTimeString = savingDateTime.format(DateTimeFormatter.ofPattern("HHmm"));

        ItemBalanceSaveQuery itemBalanceSaveQuery = ItemBalanceSaveQuery.builder()
                .savingDate(savingDateString)
                .savingTime(savingTimeString)
                .oldDate(oldDate)
                .build();
        saveBalance(itemBalanceSaveQuery);
    }

    @Override
    @Transactional
    public void saveBalance(ItemBalanceSaveQuery itemBalanceSaveQuery) {
//        LocalDate savingDateTime = LocalDate.parse(savingDateString, DateTimeFormatter.BASIC_ISO_DATE);

        saveBalanceCurrentBalance(itemBalanceSaveQuery);
        saveBalanceOldByLot(itemBalanceSaveQuery);
        saveBalanceOldByDate(itemBalanceSaveQuery);
        saveBalanceHeader(itemBalanceSaveQuery);
    }

    @Override
    @Transactional
    public void saveBalanceCurrentBalance(ItemBalanceSaveQuery itemBalanceSaveQuery) {
        try {
            List<ItemBalanceHis> itembalanceHis
                    = itemBalanceHisRepository.findByGdateAndGtime(itemBalanceSaveQuery.getSavingDate(), itemBalanceSaveQuery.getSavingTime());
            if (itembalanceHis.isEmpty() || itembalanceHis == null) {
                itemBalanceHisMapper.saveBalanceByDate(itemBalanceSaveQuery);
                log.trace("재고 날짜 기준 OK ");
                itemBalanceHisMapper.saveBalanceHisLot(itemBalanceSaveQuery);
                log.trace("재고 LOT 기준 OK ");
            }
        } catch (Exception e) {
            //messageService.send(messageDto);
            e.printStackTrace();
        }
    }

    @Override
    public void saveBalanceOldByLot(ItemBalanceSaveQuery itemBalanceSaveQuery) {

        try {
            List<ItemBalanceHisOld> itemBalanceHisOldLots =
                    itemBalanceHisOldRepository.findByGdateAndGtimeAndBltype(itemBalanceSaveQuery.getSavingDate(), itemBalanceSaveQuery.getSavingTime(), "OLDLOT");
            if (itemBalanceHisOldLots.isEmpty() || itemBalanceHisOldLots == null) {
                itemBalanceHisOldMapper.saveOldBalanceByLot(itemBalanceSaveQuery);
                log.trace("장기재고 LOT 기준 OK ");
            }
        } catch (Exception e) {
            //messageService.send(messageDto);
            e.printStackTrace();
        }
    }

    @Override
    public void saveBalanceOldByDate(ItemBalanceSaveQuery itemBalanceSaveQuery) {

        try {
            List<ItemBalanceHisOld> itemBalanceHisOldLots =
                    itemBalanceHisOldRepository.findByGdateAndGtimeAndBltype(itemBalanceSaveQuery.getSavingDate(), itemBalanceSaveQuery.getSavingTime(), "OLDDATE");
            if (itemBalanceHisOldLots.isEmpty() || itemBalanceHisOldLots == null) {
                itemBalanceHisOldMapper.saveOldBalanceByDate(itemBalanceSaveQuery);
                log.trace("장기재고 일자 기준 OK ");
            }
        } catch (Exception e) {
            //messageService.send(messageDto);
            e.printStackTrace();
        }
    }
    @Override
    public void saveBalanceHeader(ItemBalanceSaveQuery itemBalanceSaveQuery) {

        try {
            List<ItemBalanceHeader> itembalanceHeader
                    = itemBalanceHeaderRepository.findByGdateAndGtime(itemBalanceSaveQuery.getSavingDate(), itemBalanceSaveQuery.getSavingTime());
            if (itembalanceHeader.isEmpty() || itembalanceHeader == null) {
                itemBalanceHeaderMapper.saveBalanceHisHeader(itemBalanceSaveQuery);
                itemBalanceHeaderMapper.saveBalanceOldHeader(itemBalanceSaveQuery);
                log.trace("재고 Header 기준 OK ");
            }
        } catch (Exception e) {
            //messageService.send(messageDto);
            e.printStackTrace();
        }
    }
}
