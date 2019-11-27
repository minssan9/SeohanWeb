//package com.seohan.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter { 
//	
////	@Override
////	public void configure(WebSecurity web) throws Exception {
////		web.ignoring().antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**");
////	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.httpBasic()
//				.and()
//			.authorizeRequests()			
//				.antMatchers("/admin/**").hasRole("ADMIN")
//				.antMatchers("/generalPage/**", "/hello").hasRole("USER")
//				.anyRequest().authenticated()
//				.and()
//			.formLogin()
//				.permitAll()
//				.and()				
//			.logout();
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	}
//}