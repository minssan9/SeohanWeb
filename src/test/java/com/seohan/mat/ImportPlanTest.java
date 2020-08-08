package com.seohan.mat;

import com.seohan.mat.Domain.ImportPlan;
import com.seohan.mat.Dto.ImportPlanAlarm;
import com.seohan.mat.Dto.ImportPlanAlarmQuery;
import com.seohan.mat.Mapper.ImportPlanMapper;
import com.seohan.mat.Service.ImportPlanService;
import com.sun.deploy.trace.Trace;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
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

    @Autowired
    ImportPlanMapper importPlanMapper;

    @Test
    public void importPlanAlarmsTest() {
        Assert.assertNotNull(importPlanService.getOmissionItemList("4060066"));
    }

    @Test
    public void importPlanAlarmsMybatisTest() {
        ImportPlanAlarmQuery importPlanAlarmQuery
                = ImportPlanAlarmQuery.builder()
                .workdate("20200729")
                .fromdate("20200723")
                .todate("20200807")
                .userid("4060066")
                .build();

        List<ImportPlanAlarm> importPlanAlarms = importPlanMapper.findGetOmissionItemList(importPlanAlarmQuery);
        Trace.println(importPlanAlarms.toString());
        Assert.assertNotNull(importPlanMapper.findGetOmissionItemList(importPlanAlarmQuery));
    }


}
