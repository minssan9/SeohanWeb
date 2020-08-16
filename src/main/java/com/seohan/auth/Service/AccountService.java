package com.seohan.auth.Service;

import com.seohan.auth.Domain.Account;

import com.seohan.auth.Domain.ExtAccount;
import com.seohan.auth.Domain.InAccount;
import com.seohan.auth.Mapper.ExtAccountRepository;
import com.seohan.auth.Mapper.InAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService implements UserDetailsService {

    @Autowired
    private InAccountRepository inAccountRepository;

    @Autowired
    private ExtAccountRepository extAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        ExtAccount extAccount = extAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
        InAccount inAccount = inAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
        return new AccountAdapter(extAccount);
    }

//    public Optional<Account> findByAccountId(String userName) {
//        ExtAccount extAccount = extAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        InAccount inAccount = inAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        return new ;
//    }
}
