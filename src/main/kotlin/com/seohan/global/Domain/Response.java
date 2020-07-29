package com.seohan.global.Domain;

import lombok.Data;

@Data
public class Response<T> {

//	@ApiModelProperty(value="상태코드")
	private int code = 200;
	
	private String message;

	private boolean check = true;
	
	private T response;	
}
