package com.seohan.global.Service;

import com.seohan.global.Dto.MessageDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    @Value("${server.message}")
    public String SERVER_MESSAGE_URL ;

    public void sendMessage(MessageDto messageDto) {
        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        // RestTemplate 에 MessageConverter 세팅
        converters.add(new FormHttpMessageConverter());
        converters.add(new StringHttpMessageConverter());
        converters.add(new MappingJackson2HttpMessageConverter());

        restTemplate.setMessageConverters(converters);

        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<MessageDto> requestEntity = new HttpEntity<>(messageDto, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(SERVER_MESSAGE_URL, requestEntity, String.class);

        restTemplate.postForEntity(SERVER_MESSAGE_URL, messageDto, String.class);
    }
}