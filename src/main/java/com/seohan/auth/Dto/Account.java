package com.seohan.auth.Dto;

import com.seohan.auth.Domain.AccountRoles;
import lombok.*;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Alias("account")
public class Account {
	private String accountid;
	private String password;
	private String name;
	private String email;
	private String phone;
//	private String isAdmin;
//
//	private String address;
//	private Long socialId;
	@ElementCollection(fetch = FetchType.EAGER)
//	@Enumerated(EnumType.STRING)
//	@JoinColumn(name="accountid", nullable = false)
	private List<AccountRoles> roles;
}