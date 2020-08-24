package com.seohan.erp.general.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="IT_DAMAGE", schema="SITLIB") 
public class ItDamage { 
	private String co_gb;  
	private String fact;  
	private String wrkct;  
	private String class1;
	private String class2="";
	private String class3="";   
	@Id
	private String rtime;
	private String rsabun="";
	private String rteam="";
	private String rname="";
	private String rtel;
	private String rtxt="";
	private String ctime="";
	private String csabun="";
	private String cname="";
	private String cteam="";
	private String ctel="";
	private String ctxt="";  
	private String attach="";  
	private String stat; 
}