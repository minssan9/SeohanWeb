package com.seohan.auth.Dto;

import com.seohan.auth.Domain.AccountRoles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Account {
	private String accountId;
	private String password;
	private String name;
	private String address;
	private String email;
	private String phone;

	private Long socialId;
	private Set<AccountRoles> roles;
}