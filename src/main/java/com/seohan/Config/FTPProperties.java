package com.seohan.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

//@Data 
//@Component
//public class FTPProperties { 
//	
//	@Value("${ftp.url}")
//	private String url; // FTP 접속지 IP
//	@Value("${ftp.port}")
//	private int    port;             // FTP 접속지 Port
//	@Value("${ftp.id}")
//	private String id;// ID
//	@Value("${ftp.password}")
//    private String password;        // PASSWORD
//	@Value("${ftp.path}")
//    private String path;
//} 


@Data 
@Configuration
@ConfigurationProperties(prefix = "ftp")
public class FTPProperties {  
	private String url; // FTP 접속지 IP
	private int    port;             // FTP 접속지 Port
	private String id;// ID
    private String password;        // PASSWORD
    private String path;
} 