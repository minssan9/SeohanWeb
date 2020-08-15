package com.seohan.auth.Domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@IdClass(Account.class)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AKMSTRP", schema = "SILIB")
@Builder
public class Account implements Serializable {

	@Id
	@Column(name="ASABN")
	private String accountId;
	
//	@Id
//	@Column(name="CO_GB")
//	private String companyCode;

	@Column(name="PASSWD")
	private String password;
	private String asosk;

	@Column(name="KNAME")
	private String name;

	private String	ugroup;
	private String	ename;
	private String	hname;
	private String	amtgb;
	private String	aigub;
	private String	afagb;
	private String	anogb;
	private String	sosok;
	private String	aline;
	private String	jikb;
	private int	hobon;
	private String	ajikc;
	private String	ajikj;
	private String	jumin;
	private String	idate;
	private String	gdate;
	private String	marred;
	private String	bpost;
	private String	baddr;
	private String	hpost;
	private String	haddr;
	private String	telno;

	@Column(name="HANDP")
	private String phone;

	private double	height;
	private double	weight;
	private String	blood;
	private double	leye;
	private double	reye;
	private String	hobby;
	private String	faith;
	private String	agubn;
	private String	ajong;
	private String	army;
	private String	aclass1;
	private String	aclass2;
	private String	anumbr;
	private String	aterm;
	private String	areason1;
	private String	areason2;
	private String	atgub;
	private String	atdat;
	private double	atmny;
	private String	atresn;
	private String	bgub1;
	private String	bnam1;
	private String	btel1;
	private String	bterm1;
	private String	bgub2;
	private String	bnam2;
	private String	btel2;
	private String	bterm2;
	private String	binsur;
	private String	aggmj;
	private String	acgmj;
	private String	edate;
	private String	etime;
	private String	filler;


	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<AccountRoles> roles;
//	private String role;
}