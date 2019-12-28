package com.seohan.general.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface JwtService {
	public <T> String create(String key, T data, String subject);
}
