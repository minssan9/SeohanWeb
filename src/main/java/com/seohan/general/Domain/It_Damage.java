package com.seohan.general.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity
public class It_Damage { 
	private String co_gb;  
	private String fact;  
	private String wrkct;  
	private String class1;
	private String class2;
	private String class3;   
	@Id
	private String rtime;
	private String rsabun;
	private String rteam;
	private String rname;
	private String rtel;
	private String rtxt;
	private String ctime;
	private String csabun;
	private String cname;
	private String cteam;
	private String ctel;
	private String ctxt;  
	private String attach;  
	private String stat;
}