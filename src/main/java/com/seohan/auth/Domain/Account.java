package com.seohan.auth.Domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
@Table(name = "EMP_MST", schema = "TSILIB")
public class Account implements Serializable {

	@Id
	@Column(name="ASABN")
	private String accountId;

	@Column(name="RCO_GB")
	private String companyCode;

	@Column(name="PASSWD")
	private String password;

	private String	asosk;
	private String	nasosk;
	private String	rco_gb;
	private String	kname;
	private String	ename;
	private String	hname;
	private String	jumin_no;
	private String	enter_cd;
	private String	enter_ymd;
	private String	guns_ymd;
	private String	mt_gb;
	private String	jikj_cd;
	private String	jikc_cd;
	private String	jikb_cd;
	private String	fagb_cd;
	private String	line_cd;
	private String	dir_fl;
	private String	duty_nm;
	private String	apsosk;
	private String	send_fl;
	private String	unio_gb;
	private String	ctel_no;
	private String	htel_no;
	private String	mobi_no;
	private String	bpost_no;
	private String	bsido;
	private String	baddr;
	private String	hpost_no;
	private String	hsido;
	private String	haddr;
	private String	live_gb;
	private String	birt_gb;
	private String	birt_ymd;
	private String	marr_fl;
	private String	marr_ymd;
	private double	height;
	private double	weight;
	private String	blood;
	private double	leye;
	private double	reye;
	private String	army_fl;
	private String	sdate_ymd;
	private String	edate_ymd;
	private String	reti_gb;
	private String	reti_ymd;
	private double	reti_mny;
	private String	retremk;
	private String	wkjo1_cd;
	private String	wkjo2_cd;
	private String	genr_gb;
	private String	goga_gb;
	private String	posi_gb;
	private String	wkjo_gb;
	private String	aces_cd;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@CollectionTable(schema = "TSILIB", name = "EMP_MST_ROLES", joinColumns = @JoinColumn(name = "asabn"))
	private Set<AccountRoles> roles;
}