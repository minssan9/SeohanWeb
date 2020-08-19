package com.seohan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.text.SimpleDateFormat;

@SpringBootApplication
@EnableScheduling
@Configuration
@PropertySource(value = {"classpath:account.properties" })
@CrossOrigin(origins = { "http://localhost:8091",  "http://localhost:8090",  "http://localhost"})
public class SeohanWebApplication extends SpringBootServletInitializer {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	public static SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SeohanWebApplication.class);
	}
  
	public static void main(String[] args) {
		SpringApplication.run(SeohanWebApplication.class, args);
	}
}
