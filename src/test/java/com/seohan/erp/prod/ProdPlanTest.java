package com.seohan.erp.prod;

import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Service.ImportPlanService;
import com.seohan.erp.prod.Domain.PrdpdpfEntity;
import com.seohan.erp.prod.Dto.ProdPlanDto;
import com.seohan.erp.prod.Service.ProdPlanService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdPlanTest {

    @Autowired
    private ProdPlanService prodPlanService;

    @Test
    public void getProdPlanTest() {
        ProdPlanDto prodPlanDto = ProdPlanDto.builder()
                .prodLine("F06")
                .prodDate("20200820")
                .build();
        List<PrdpdpfEntity> prdpdpfEntities = prodPlanService.getPlanList(prodPlanDto );
        System.out.println(prdpdpfEntities .toString());
        Assert.assertNotNull(prdpdpfEntities );
    }


}
