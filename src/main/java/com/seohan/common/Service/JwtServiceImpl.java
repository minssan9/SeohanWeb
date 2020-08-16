//package com.seohan.common.Service;
//
//import com.seohan.common.Error.UnauthorizedException;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jws;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.io.UnsupportedEncodingException;
//
//@Slf4j
//@Service
//public class JwtServiceImpl implements JwtService {
//	private static final String SALT = "luvookSecret";
//
//	@Override
//	public <T> String create(String key, T data, String subject) {
//		String jwt = Jwts.builder().setHeaderParam("typ", "JWT").setHeaderParam("regDate", System.currentTimeMillis())
//				.setSubject(subject).claim(key, data).signWith(SignatureAlgorithm.HS256, this.generateKey()).compact();
//		return jwt;
//	}
//
//	private byte[] generateKey() {
//		byte[] key = null;
//		try {
//			key = SALT.getBytes("UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			if (log.isInfoEnabled()) {
//				e.printStackTrace();
//			} else {
//				log.error("Making JWT Key Error ::: {}", e.getMessage());
//			}
//		}
//		return key;
//	}
//
//	@Override
//	public boolean isUsable(String jwt) {
//		try {
//			Jws<Claims> claims = Jwts.parser()
//								.setSigningKey(this.generateKey())
//								.parseClaimsJws(jwt);
//			return true;
//		} catch (Exception e) {
//			if (log.isInfoEnabled()) {
//				e.printStackTrace();
//			} else {
//				log.error(e.getMessage());
//			}
//			throw new UnauthorizedException();
//		}
//	}
//}