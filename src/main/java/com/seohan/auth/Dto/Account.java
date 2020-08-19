package com.seohan.auth.Dto;

import com.seohan.auth.Domain.AccountRoles;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(of = "id")
public class Account {
	private String accountId;
	private String password;
	private String name;
	private String email;
	private String phone;
//	private String isAdmin;
//
//	private String address;
//	private Long socialId;
	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
//	@JoinColumn(name="accountid", nullable = false)
	private Set<AccountRoles> roles;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}