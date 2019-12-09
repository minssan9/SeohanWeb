package com.seohan.general.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@IdClass(User.class)
@Table(name="EMP_MST", schema="TSILIB")
public class User  implements Serializable{ 
    @Id  
	private String ASABN;
    @Id  
	private String CO_GB;
	private String ASOSK;
	private String NASOSK;
	private String RCO_GB;
	private String PASSWD;
	private String KNAME;
	private String ENAME;
	private String HNAME;
	private String JUMIN_NO;
	private String ENTER_CD;
	private String ENTER_YMD;
	private String GUNS_YMD;
	private String MT_GB;
	private String JIKJ_CD;
	private String JIKC_CD;
	private String JIKB_CD;
	private String FAGB_CD;
	private String LINE_CD;
	private String DIR_FL;
	private String DUTY_NM;
	private String APSOSK;
	private String SEND_FL;
	private String UNIO_GB;
	private String CTEL_NO;
	private String HTEL_NO;
	private String MOBI_NO;
	private String BPOST_NO;
	private String BSIDO;
	private String BADDR;
	private String HPOST_NO;
	private String HSIDO;
	private String HADDR;
	private String LIVE_GB;
	private String BIRT_GB;
	private String BIRT_YMD;
	private String MARR_FL;
	private String MARR_YMD;
	private Double HEIGHT;
	private Double WEIGHT;
	private String BLOOD;
	private Double LEYE;
	private Double REYE;
	private String ARMY_FL;
	private String SDATE_YMD;
	private String EDATE_YMD;
	private String RETI_GB;
	private String RETI_YMD;
	private Double RETI_MNY;
	private String RETREMK;
	private String WKJO1_CD;
	private String WKJO2_CD;
	private String GENR_GB;
	private String GOGA_GB;
	private String POSI_GB;
	private String WKJO_GB;
	private String ACES_CD;

	private String role;  
}