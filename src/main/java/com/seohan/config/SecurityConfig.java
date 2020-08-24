//package com.seohan.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private AuthEntryPointJwt unauthorizedHandler;
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.httpBasic()
//				.and()
//			.authorizeRequests()
//				.antMatchers("/admin/**").hasRole("ADMIN")
//				.antMatchers("/general/**", "/hello").hasRole("USER")
//				.antMatchers("/login").permitAll()
//				.anyRequest().authenticated();
//
//		http.formLogin()
//			.loginPage("/general/auth/login")
//			.defaultSuccessUrl("/home")
//			.usernameParameter("id")
//			.passwordParameter("password")	;
//
//		http.logout()
//			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//			.logoutSuccessUrl("/")
//			.invalidateHttpSession(true);
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	}
//}