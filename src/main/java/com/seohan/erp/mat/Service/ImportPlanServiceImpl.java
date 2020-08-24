package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Domain.ImportPlan;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Dto.ImportPlanAlarmQuery;
import com.seohan.erp.mat.Mapper.ImportPlanMapper;
import com.seohan.erp.mat.Repository.ImportPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ImportPlanServiceImpl implements ImportPlanService {

    @Autowired
    ImportPlanMapper importPlanMapper;

    @Autowired
    ImportPlanRepository importPlanRepository;

    @Override
    public List<ImportPlanAlarm> getOmissionItemList( String userId) {
        String workDate = importPlanRepository.findMaxWorkDate(userId);

        String toDate  = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String fromDate  = LocalDate.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        ImportPlanAlarmQuery importPlanAlarmQuery
                = ImportPlanAlarmQuery.builder()
                .workdate(workDate)
                .fromdate(fromDate)
                .todate(toDate)
                .userid(userId)
                .build();
        try {
            return importPlanMapper.findGetOmissionItemList(importPlanAlarmQuery);
        }catch (Exception e){
            throw new IllegalStateException("날짜를 확인하세요");
        }
    }
}



