package com.seohan.message.Service;

import com.seohan.erp.base.Domain.KakaoMessageModel;

public interface MessageService {
	public String sendMessage(KakaoMessageModel kakaoMessageModel) throws Exception; 
}
