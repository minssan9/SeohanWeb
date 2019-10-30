package com.seohan.general.Domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ItDamage { 
	private String class1;
	private String class2; 
	private String co_gb;  
	private String rtime;
	private String rsabun;
	private String rteam;
	private String rname;
	private String rtel;
	private String rtxt; 
	private String ctxt; 
	private String ctime;
	private MultipartFile file;	
	private String stat;
}