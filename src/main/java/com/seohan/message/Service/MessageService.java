package com.seohan.message.Service;

import com.seohan.base.Domain.KakaoMessageModel;

public interface MessageService {
	public String sendMessage(KakaoMessageModel kakaoMessageModel) throws Exception; 
}
