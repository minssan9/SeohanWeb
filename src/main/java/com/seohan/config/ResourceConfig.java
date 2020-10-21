package com.seohan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableResourceServer
public class
ResourceConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("seohan");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .anonymous()
                .and()
                .authorizeRequests()
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/websockethandler/**").permitAll() 
                .antMatchers("/app/**").permitAll()
                .mvcMatchers(HttpMethod.GET, "/**/*").permitAll()  // 해당 요청은 누구나 가능하며
                .mvcMatchers(HttpMethod.POST, "/mat/**").permitAll()  // 해당 요청은 누구나 가능하며
                .mvcMatchers(HttpMethod.POST, "/erp/**").permitAll()        //  현재는 전체 허용
                .mvcMatchers(HttpMethod.POST, "/dev/**").permitAll()
                .mvcMatchers(HttpMethod.POST, "/oauth").permitAll()
                .mvcMatchers(HttpMethod.POST, "/auth/join/check").permitAll()
                .anyRequest().authenticated()       //  나머지 요청은 권한이 필요합니다.
                .and()
                .exceptionHandling()
                .accessDeniedHandler(new OAuth2AccessDeniedHandler());

        // h2-console
        http
                .csrf()
                .requireCsrfProtectionMatcher(new AntPathRequestMatcher("!/h2-console/**"))
                .and()
                .headers()
                .addHeaderWriter(new StaticHeadersWriter("X-Content-Security-Policy", "script-src 'self'"))
                .frameOptions()
                .disable();
    }
}
