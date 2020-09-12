package com.seohan.erp.prod.Service;

import com.seohan.erp.prod.Domain.PrdpdpfEntity;
import com.seohan.erp.prod.Dto.ProdPlanDto;
import com.seohan.erp.prod.Repository.PrdpdpfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdPlanServiceImpl implements ProdPlanService {

    @Autowired
    PrdpdpfRepository prdpdpfRepository;

    @Override
    public List<PrdpdpfEntity> getPlanList(ProdPlanDto prodPlanDto){
        return prdpdpfRepository.findPrdpdpfEntitiesByPldteAndWrkct(prodPlanDto.getProdDate(), prodPlanDto.getProdLine());
//        return prdpdpfEntityRepository.findPrdpdpfEntitiesByPldteAndWrkct( prodPlanDto);
    }

}



