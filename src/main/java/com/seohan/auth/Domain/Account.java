package com.seohan.auth.Domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@IdClass(Account.class)
@Table(name = "GR_INSA", schema = "TPRLIB")
@Builder
public class Account implements Serializable {

	@Id
	@Column(name="ASABN")
	private String accountId;
	
	@Id
	@Column(name="CO_GB")
	private String companyCode;

	@Column(name="PASS")
	private String password;
	private String asosk;

	@Column(name="KNAME")
	private String name;
	private String mt_gb;
	private String jikc_cd;
	private String jikb_cd;
	private String fagb_cd;

	private String ctel_no;
	@Column(name="MOBI_NO")
	private String phone;
	private String reti_gb;
	private String jikb;
	private String team_nm;
	private String part_nm;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<AccountRoles> roles;
//	private String role;
}