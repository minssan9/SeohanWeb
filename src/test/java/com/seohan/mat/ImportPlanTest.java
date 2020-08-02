package com.seohan.mat;

import com.seohan.mat.Dto.ImportPlanAlarm;
import com.seohan.mat.Service.ImportPlanService;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImportPlanTest {

    @Autowired
    ImportPlanService importPlanService;

    @Test
    public void importPlanAlarmsTest() {
        Assert.assertNotNull(importPlanService.getOmissionItemList("4060066"));
    }

}
