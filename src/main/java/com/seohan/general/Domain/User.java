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
	private String asabn;
    @Id  
	private String co_gb;
	private String asosk;
	private String nasosk;
	private String rco_gb;
	private String passwd;
	private String kname;
	private String ename;
	private String hname;
	private String jumin_no;
	private String enter_cd;
	private String enter_ymd;
	private String guns_ymd;
	private String mt_gb;
	private String jikj_cd;
	private String jikc_cd;
	private String jikb_cd;
	private String fagb_cd;
	private String line_cd;
	private String dir_fl;
	private String duty_nm;
	private String apsosk;
	private String send_fl;
	private String unio_gb;
	private String ctel_no;
	private String htel_no;
	private String mobi_no;
	private String bpost_no;
	private String bsido;
	private String baddr;
	private String hpost_no;
	private String hsido;
	private String haddr;
	private String live_gb;
	private String birt_gb;
	private String birt_ymd;
	private String marr_fl;
	private String marr_ymd;
	private Double height;
	private Double weight;
	private String blood;
	private Double leye;
	private Double reye;
	private String army_fl;
	private String sdate_ymd;
	private String edate_ymd;
	private String reti_gb;
	private String reti_ymd;
	private Double reti_mny;
	private String retremk;
	private String wkjo1_cd;
	private String wkjo2_cd;
	private String genr_gb;
	private String goga_gb;
	private String posi_gb;
	private String wkjo_gb;
	private String aces_cd;

	private String role;  
}