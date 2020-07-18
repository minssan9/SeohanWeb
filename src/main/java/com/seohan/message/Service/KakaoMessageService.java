package com.seohan.message.Service;

import com.seohan.base.Domain.KakaoMessageModel;

public interface KakaoMessageService { 
	public String sendMessage(KakaoMessageModel kakaoMessageModel) throws Exception; 
}
