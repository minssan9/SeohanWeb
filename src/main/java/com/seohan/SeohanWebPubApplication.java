package com.seohan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.seohan.config.FTPProperties;
import com.seohan.config.FileUploadProperties;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties({
    FileUploadProperties.class,
    FTPProperties.class
})
public class SeohanWebPubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeohanWebPubApplication.class, args);
	}

}
