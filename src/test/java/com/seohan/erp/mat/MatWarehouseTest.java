package com.seohan.erp.mat;

import com.seohan.erp.mat.Domain.ItmblpfsubEntity;
import com.seohan.erp.mat.Domain.LocaAlmEntity;
import com.seohan.erp.mat.Dto.ItmblpfsubDto;
import com.seohan.erp.mat.Repository.ItmblpfsubRepository;
import com.seohan.erp.mat.Repository.LocaAlmEntityRepository;
import com.seohan.erp.mat.Service.ItmblpfsubService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

import static com.seohan.SeohanWebApplication.dateFormatString;
import static com.seohan.SeohanWebApplication.timeFormatString;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MatWarehouseTest {
    @Autowired
    LocaAlmEntityRepository locaAlmEntityRepository;

    @Autowired
    ItmblpfsubRepository itmblpfsubRepository;

    @Autowired
    ItmblpfsubService itmblpfsubService;

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
    @Test
    public void moveLocationTest () throws Exception{
        String nowDateString = LocalDateTime.now().format(dateFormatString);
        String nowTimeString = LocalDateTime.now().format(timeFormatString);

        long id = 2721;
        ItmblpfsubDto itmblpfsubDto = ItmblpfsubDto.builder()
                .warhs("XB")
                .itmno("R551712B000")
                .lotno("")
                .changedLocat("S503")
                .changedQty(37)
                .id(id)
                .build();

        long newId = 7900;
        ItmblpfsubEntity newItmblpfsubEntity = ItmblpfsubEntity.builder()
                .warhs("XB")
                .itmno("R551712B000")
                .locat("S503")
                .lotno("")
                .qty(37)
                .jqty(37)
                .indate(nowDateString)
                .intime(nowTimeString)
                .id(newId)
                .sts("1")
                .build();

        ItmblpfsubEntity changedItmblpfsub = itmblpfsubService.moveLocation(itmblpfsubDto) ;

        Assert.assertEquals(newItmblpfsubEntity, changedItmblpfsub);
    }
}