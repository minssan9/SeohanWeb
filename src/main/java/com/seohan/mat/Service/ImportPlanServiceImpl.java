package com.seohan.mat.Service;

import com.seohan.mat.Domain.ImportPlan;
import com.seohan.mat.Dto.ImportPlanAlarm;
import com.seohan.mat.Mapper.ImportPlanRepository;
import com.seohan.mat.Service.ImportPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ImportPlanServiceImpl implements ImportPlanService {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    ImportPlanRepository importPlanRepository;

    @Override
    public List<ImportPlanAlarm> getOmissionItemList( String userId) {
        String workDate = importPlanRepository.findMaxWorkDate(userId);
        String toDate  = "";
        String fromDate  = "";
        Date now = new Date();

        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(now);
            calendar.add(Calendar.DATE,  -1);

            toDate = sdf.format(now);
            fromDate = sdf.format(calendar.getTime());
        }catch (Exception e){
            throw new IllegalStateException("날짜를 확인하세요");
        }
        return importPlanRepository.findGetOmissionItemList(fromDate, toDate, workDate, userId);
    }
}



