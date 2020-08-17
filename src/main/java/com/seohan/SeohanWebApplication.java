package com.seohan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.text.SimpleDateFormat;

@SpringBootApplication
@EnableScheduling
@Configuration
@PropertySource(value = {"classpath:account.properties" })
public class SeohanWebApplication extends SpringBootServletInitializer {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	public static SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SeohanWebApplication.class);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(SeohanWebApplication.class, args);
	}
}
