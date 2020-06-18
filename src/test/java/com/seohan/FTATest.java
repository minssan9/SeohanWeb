package com.seohan;
import com.seohan.fta.Domain.PoDto;
import com.seohan.fta.Domain.PoHeader;
import com.seohan.fta.Mapper.PoHeaderRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class FTATest{

    @Autowired
    private PoHeaderRepository poRepo;

    @Test
    public void test() throws Exception{
        List<PoDto> poDtos = new ArrayList<>();
        try {

//            poDtos = poRepo.findByCogbAndPono("SEOHAN", "PO20200608043");
            System.out.print(poDtos);
        }catch (Exception e){
            e.printStackTrace();
        };
    }
}