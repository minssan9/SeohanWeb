package com.seohan.scheduler;

import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Dto.ImportPlanAlarmQuery;
import com.seohan.erp.mat.Mapper.ImportPlanMapper;
import com.seohan.erp.mat.Service.ImportPlanService;
import com.sun.deploy.trace.Trace;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class ImportPlanTest {

    @Autowired
    ImportPlanService importPlanService;

    @Test
    public void importPlanAlarmsTest() {
        Assert.assertNotNull(importPlanService.getOmissionItemList("4060066"));
    }

    @Test
    public void importPlanAlarmsMybatisTest() {
        String testUserId ="4060066";

        List<ImportPlanAlarm> importPlanAlarms = importPlanService.getOmissionItemList(testUserId );

        System.out.println(importPlanAlarms.toString());
        Assert.assertNotNull(importPlanAlarms);
    }
}
