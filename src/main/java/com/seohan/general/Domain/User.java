package com.seohan.general.Domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@IdClass(User.class)
@Table(name = "GR_INSA", schema = "TPRLIB")
public class User implements Serializable {
	@Id 
	private String asabn;	
	
	@Id
	@Column(name="CO_GB")
	private String companyCode; 
	
	private String pass;
	private String asosk;
	private String kname;
	private String mt_gb;
	private String jikc_cd;
	private String jikb_cd;
	private String fagb_cd;
	private String ctel_no;
	private String mobi_no;
	private String reti_gb;
	private String jikb;
	private String team_nm;
	private String part_nm;

	private String role;
}