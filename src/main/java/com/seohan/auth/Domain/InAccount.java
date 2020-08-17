//package com.seohan.auth.Domain;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Set;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Builder
//@ToString
//@IdClass(InAccount.class)
//@Table(name = "EMP_MST", schema = "TSILIB")
//public class InAccount implements Account, Serializable {
//	@Id
//	@Column(name="ASABN")
//	private String accountId;
//	@Id
//	@Column(name="CO_GB")
//	private String companyCode;
//
//	@Column(name="PASSWD")
//	private String password;
//
//	private String 	asosk;
//	private String 	nasosk;
//	private String 	rco_gb;
//	private String 	kname;
//	private String 	ename;
//	private String 	hname;
//	private String 	jumin_no;
//	private String 	enter_cd;
//	private String 	enter_ymd;
//	private String 	guns_ymd;
//	private String 	mt_gb;
//	private String 	jikj_cd;
//	private String 	jikc_cd;
//	private String 	jikb_cd;
//	private String 	fagb_cd;
//	private String 	line_cd;
//	private String 	dir_fl;
//	private String 	duty_nm;
//	private String 	apsosk;
//	private String 	send_fl;
//	private String 	unio_gb;
//	private String 	ctel_no;
//	private String 	htel_no;
//	private String 	mobi_no;
//	private String 	bpost_no;
//	private String 	bsido;
//	private String 	baddr;
//	private String 	hpost_no;
//	private String 	hsido;
//	private String 	haddr;
//	private String 	live_gb;
//	private String 	birt_gb;
//	private String 	birt_ymd;
//	private String 	marr_fl;
//	private String 	marr_ymd;
//	private double HEIGHT;
//	private double WEIGHT;
//	private String 	BLOOD;
//	private double LEYE;
//	private double REYE;
//	private String 	ARMY_FL;
//	private String 	SDATE_YMD;
//	private String 	EDATE_YMD;
//	private String 	RETI_GB;
//	private String 	RETI_YMD;
//	private double RETI_MNY;
//	private String 	RETREMK;
//	private String 	WKJO1_CD;
//	private String 	WKJO2_CD;
//	private String 	GENR_GB;
//	private String 	GOGA_GB;
//	private String 	POSI_GB;
//	private String 	WKJO_GB;
//	private String 	ACES_CD;
//
//
//
//	@ElementCollection(fetch = FetchType.EAGER)
//	@Enumerated(EnumType.STRING)
//	private Set<AccountRoles> roles;
//
//}