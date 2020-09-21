package com.seohan.message.Service;

import com.seohan.message.Domain.KakaoMessageModel;

public interface MessageService {
	public String sendMessage(KakaoMessageModel kakaoMessageModel) throws Exception; 
}
