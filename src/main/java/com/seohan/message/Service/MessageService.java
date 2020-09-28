package com.seohan.message.Service;

import com.seohan.message.Dto.MessageModel;

public interface MessageService {
	public String sendMessage(MessageModel messageModel) throws Exception;
}
