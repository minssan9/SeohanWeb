package com.seohan.message.Service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.seohan.message.Dto.MessageModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

	@Value("${server.message}")
	private String messageServerUrl;

	@Override
	public String sendMessage(MessageModel messageModel) throws Exception {
		URI uri = new URI(messageServerUrl + "/message");

		// RestTemplate 에 MessageConverter 세팅
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new FormHttpMessageConverter());
		converters.add(new StringHttpMessageConverter());
		converters.add(new MappingJackson2HttpMessageConverter());

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setMessageConverters(converters); 

		// REST API 호출
		String result = restTemplate.postForObject(uri, messageModel, String.class);


		System.out.println("------------------ TEST 결과 ------------------");
		System.out.println(result);
		return result;
	}

}
