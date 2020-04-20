package com.seohan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seohan.base.Domain.KakaoMessageModel;
import com.seohan.base.Service.KakaoMessageService; 

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeohanWebApplicationTests {
	
	// @Autowired
	// private KakaoMessageService kakaoMessageService;
	 	 
	// @Test 
	// public void requestTest () throws Exception {	 
	// 	com.seohan.base.Domain.KakaoMessageModel kakaoMessageModel = new KakaoMessageModel();
	// 	kakaoMessageModel.setRecipient_num("01067766160");
	// 	kakaoMessageModel.setContent("dksjaldjklasejksd");
	// 	kakaoMessageModel.setSubject("dksajflsjel");
	// 	kakaoMessageModel.setMt_refkey("P30-3wew" );
	// 	kakaoMessageService.sendMessage(kakaoMessageModel);
	// }

    // public static String asJsonString(final Object obj) {
    //     try {
    //         return new ObjectMapper().writeValueAsString(obj);
    //     } catch (Exception e) {
    //         throw new RuntimeException(e);
    //     }
    // }
}
