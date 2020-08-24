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
    public Boolean saveBalance() {
//        LocalDate savingDateTime = LocalDate.parse(savingDateString, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDateTime savingDateTime = LocalDateTime.now();
        LocalDateTime oldDateTime = savingDateTime.plusDays(150);
        String oldDate = oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingDateString = savingDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String savingTimeString = savingDateTime.format(DateTimeFormatter.ofPattern("HHmm"));

        ItemBalanceSaveQuery itemBalanceSaveQuery = ItemBalanceSaveQuery.builder()
                .savingDate(savingDateString)
                .savingTime(savingTimeString)
                .oldDate(oldDate)
                .build();

        try {
            List<ItemBalanceHis> itembalanceHis = itemBalanceHisRepository.findByGdateAndGtime(savingDateString, savingTimeString);
            if (itembalanceHis.isEmpty() || itembalanceHis == null) {
                itemBalanceHisMapper.saveBalanceByDate(itemBalanceSaveQuery);
                log.trace("재고 날짜 기준 OK ");
                itemBalanceHisMapper.saveBalanceHisLot(itemBalanceSaveQuery);
                log.trace("재고 LOT 기준 OK ");
            }

            List<ItemBalanceHeader> itembalanceHeader = itemBalanceHeaderRepository.findByGdateAndGtime(savingDateString, savingTimeString);
            if (itembalanceHeader.isEmpty() || itembalanceHeader == null) {
                itemBalanceHeaderMapper.saveBalanceHisHeader(itemBalanceSaveQuery);
                log.trace("재고 Header 기준 OK ");
            }

            List<ItemBalanceHisOld> itemBalanceHisOldDates = itemBalanceHisOldRepository.findByGdateAndGtimeAndBltype(savingDateString, savingTimeString, "OLDDATE");
            if (itemBalanceHisOldDates.isEmpty() || itemBalanceHisOldDates == null) {
                itemBalanceHisOldMapper.saveOldBalanceByDate(itemBalanceSaveQuery);
                log.trace("장기재고 날짜 기준 OK ");
            }

            List<ItemBalanceHisOld> itemBalanceHisOldLots = itemBalanceHisOldRepository.findByGdateAndGtimeAndBltype(savingDateString, savingTimeString, "OLDLOT");
            if (itemBalanceHisOldLots.isEmpty() || itemBalanceHisOldLots == null) {
                itemBalanceHisOldMapper.saveOldBalanceByLot(itemBalanceSaveQuery);
                log.trace("장기재고 LOT 기준 OK ");
            }
            return true;
        } catch (Exception e) {
            //messageService.send(messageDto);

            e.printStackTrace();
            return false;
        }
    }
}
