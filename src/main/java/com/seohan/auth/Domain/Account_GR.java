//package com.seohan.auth.Domain;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Set;
//
//@Entity
//@Data
//@IdClass(Account_GR.class)
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "GR_INSA", schema = "TPRLIB")
//@Builder
//public class Account_GR implements Serializable {
//
//	@Id
//	@Column(name="ASABN")
//	private String accountId;
//
//	@Id
//	@Column(name="CO_GB")
//	private String companyCode;
//
//	@Column(name="PASS")
//	private String password;
//	private String asosk;
//
//	@Column(name="KNAME")
//	private String name;
//	private String mt_gb;
//	private String jikc_cd;
//	private String jikb_cd;
//	private String fagb_cd;
//
//	private String ctel_no;
//	@Column(name="MOBI_NO")
//	private String phone;
//	private String reti_gb;
//	private String jikb;
//	private String team_nm;
//	private String part_nm;
//
//	@ElementCollection(fetch = FetchType.EAGER)
//	@Enumerated(EnumType.STRING)
//	private Set<AccountRoles> roles;
////	private String role;
//}