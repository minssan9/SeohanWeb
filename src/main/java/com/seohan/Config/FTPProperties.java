package com.seohan.config;

import java.io.FileInputStream; 
import org.springframework.boot.context.properties.ConfigurationProperties; 
import com.jcraft.jsch.ChannelSftp; 
import lombok.Data;

@Data
@ConfigurationProperties(prefix="ftp")
public class FTPProperties { 
	private String url; // FTP 접속지 IP
	private int    port;             // FTP 접속지 Port
	private String id;// ID
    private String password;        // PASSWORD
    private String path;
} 