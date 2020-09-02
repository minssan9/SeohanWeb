package com.seohan.erp.lab;

import com.seohan.erp.mat.Domain.ItmblpfsubEntity;
import com.seohan.erp.mat.Domain.LocaAlmEntity;
import com.seohan.erp.mat.Repository.ItmblpfsubRepository;
import com.seohan.erp.mat.Repository.LocaAlmEntityRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabTest {
    @Autowired
    LocaAlmEntityRepository locaAlmEntityRepository;

    @Autowired
    ItmblpfsubRepository itmblpfsubRepository;

    @Test
    public void LocaAlmTest (){
        List<LocaAlmEntity> locaAlmEntityList = locaAlmEntityRepository.findLocaAlmEntityByGubnAndSts("A2", "1");
        Assert.assertNotNull(locaAlmEntityList);
    }
    @Test
    public void WarehouseTest (){
        List<ItmblpfsubEntity> locaAlmEntityList = itmblpfsubRepository.findByWarhsAndItmnoContains("XB", "100");
        Assert.assertNotNull(locaAlmEntityList);
    }
}