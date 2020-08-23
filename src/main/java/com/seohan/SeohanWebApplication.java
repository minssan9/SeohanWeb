package com.seohan;

import com.seohan.config.PasswordEncoderCustom;
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

@SpringBootApplication
@EnableScheduling
@Configuration
@PropertySource(value = {"classpath:account.properties" })
public class SeohanWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SeohanWebApplication.class);
	}

	@Bean
	PasswordEncoder passwordEncoder() {

//		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
		return new PasswordEncoderCustom();
	}

	public static void main(String[] args) {
		SpringApplication.run(SeohanWebApplication.class, args);
	}
}
