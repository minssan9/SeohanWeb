package com.seohan.message.Service;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.seohan.base.Domain.KakaoMessageModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KakaoMessageServiceImpl implements KakaoMessageService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	@Override
	public String sendMessage(KakaoMessageModel kakaoMessageModel) throws Exception {
		URI uri = new URI("http://211.40.184.7:5090/kakao/save");

		// RestTemplate 에 MessageConverter 세팅
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new FormHttpMessageConverter());
		converters.add(new StringHttpMessageConverter());
		converters.add(new MappingJackson2HttpMessageConverter());

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setMessageConverters(converters); 

		// REST API 호출
		String result = restTemplate.postForObject(uri, kakaoMessageModel, String.class);
		System.out.println("------------------ TEST 결과 ------------------");
		System.out.println(result);

		return result;
	}

}
