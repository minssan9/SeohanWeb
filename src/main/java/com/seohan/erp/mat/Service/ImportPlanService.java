package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImportPlanService {
    List<ImportPlanAlarm> getOmissionItemList(String userId);
}