package com.seohan.erp.prod.Service;

import com.seohan.erp.prod.Domain.PrdpdpfEntity;
import com.seohan.erp.prod.Dto.ProdPlanDto;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public interface ProdPlanService {
    List<PrdpdpfEntity> getPlanList(ProdPlanDto prodPlanDto);
}