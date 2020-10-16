package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Domain.ImportPlan;
import com.seohan.erp.mat.Domain.PurPlna;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Dto.ImportPlanAlarmQuery;
import com.seohan.erp.mat.Mapper.ImportPlanMapper;
import com.seohan.erp.mat.Repository.ImportPlanRepository;
import com.seohan.erp.mat.Repository.PurPlnARepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@Slf4j
public class ImportPlanServiceImpl implements ImportPlanService {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    ImportPlanMapper importPlanMapper;

    @Autowired
    ImportPlanRepository importPlanRepository;

    @Autowired
    PurPlnARepository purPlnARepository;

    @Override
    public List<ImportPlanAlarm> getOmissionItemList( String userId) {
//        String workDate = importPlanRepository.findMaxWorkDate(userId);
        String workDate = purPlnARepository.findPurPlnaByStatAndSabun("S", userId).getJdate();

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
//            log.info(importPlanRepository.findGetOmissionItemList(userId, workDate, fromDate, toDate).toString());
//            List<ImportPlanAlarm> resultList = importPlanRepository.findGetOmissionItemList(userId, workDate, fromDate, toDate);

            List<ImportPlanAlarm> resultList = em.createNamedQuery("findGetOmissionItemList")
                    .setParameter("workdate", workDate)
                    .setParameter("fromdate", fromDate)
                    .setParameter("todate", toDate)
                    .setParameter("userid", userId)
                    .getResultList();

//            return importPlanRepository.findGetOmissionItemList(userId, workDate, fromDate, toDate);
            return resultList;
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new IllegalStateException("날짜를 확인하세요");
        }
    }
}



