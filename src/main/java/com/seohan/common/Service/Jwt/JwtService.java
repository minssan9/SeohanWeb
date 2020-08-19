package com.seohan.common.Service.Jwt;

public interface JwtService {
	public <T> String create(String key, T data, String subject);

	boolean isUsable(String jwt);
}
