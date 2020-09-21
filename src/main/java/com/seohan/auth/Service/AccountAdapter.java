package com.seohan.auth.Service;

import com.seohan.auth.Domain.AccountRoles;
import com.seohan.auth.Dto.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AccountAdapter extends User {

    private Account account;

    public AccountAdapter(Account account) {
        super(account.getAccountid(), account.getPassword(), authorities(account.getRoles()));
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    private static Collection<? extends GrantedAuthority> authorities(List<AccountRoles> roles) {
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        for (AccountRoles accountRoles:roles) {
            authorityList.add(new SimpleGrantedAuthority("ROLE_" + accountRoles));
        }
//        roles.stream().forEach(r -> authorityList.add(new SimpleGrantedAuthority("ROLE_" + r.name())));
        return authorityList;
    }
}
