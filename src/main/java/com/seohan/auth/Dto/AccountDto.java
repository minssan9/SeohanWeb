package com.seohan.auth.Dto;

import com.seohan.auth.Domain.AccountRoles;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
@Builder
public class AccountDto {
    private String accountId;
    private String password;
    private String name;
    private String address;
    private String email;
    private String phone;

    private Long socialId;
//    private SocialCode socialCode;
    private Set<AccountRoles> role;
}