package com.seohan.erp.general.Domain;

import lombok.Data;

@Data
public class SmsModel {
	private String phone;
	private String title;
	private String content;
	private int quantity;
	private String sendNo;
}
