package com.seohan.common.Interceptor;

import com.seohan.common.Error.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.seohan.common.Service.JwtService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class JwtInterceptor implements HandlerInterceptor{
	private static final String HEADER_AUTH = "Authorization";

	@Autowired
	private JwtService jwtService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		final String token = request.getHeader(HEADER_AUTH);

		if (request.getRequestURI().equals("/auth/signin")) {
			return  true;
		}
		if(token != null && jwtService.isUsable(token) ){
			return true;
		}else{
			throw new UnauthorizedException();
		}

	}
}
