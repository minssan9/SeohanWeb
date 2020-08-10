package com.seohan.mat.Service;

import com.seohan.mat.Domain.ImportPlan;
import com.seohan.mat.Dto.ImportPlanAlarm;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public interface ImportPlanService {
    List<ImportPlanAlarm> getOmissionItemList(String userId);
}