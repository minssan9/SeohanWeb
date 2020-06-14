package com.seohan;
import com.seohan.fta.Domain.PoHeader;
import com.seohan.fta.Mapper.PoRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class FTATest{

    @Autowired
    private PoRepository poRepo;

    @Test
    public void test() throws Exception{
        List<PoHeader> poHeaders = new ArrayList<>();
        try {
            poHeaders = poRepo.findByCogbAndPono("SEOHAN", "PO20200608043");
            System.out.print(poHeaders);
        }catch (Exception e){
            e.printStackTrace();
        };
    }
}