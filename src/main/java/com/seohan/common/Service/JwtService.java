package com.seohan.common.Service;

public interface JwtService {
	public <T> String create(String key, T data, String subject);

	boolean isUsable(String jwt);
}
