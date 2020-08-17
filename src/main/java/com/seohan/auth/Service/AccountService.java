package com.seohan.auth.Service;

import com.seohan.auth.Domain.Account;
import com.seohan.auth.Mapper.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {

    @Autowired
    private AccountRepository accountRepository;

//    @Autowired
//    private ExtAccountRepository extAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        ExtAccount extAccount = extAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        InAccount inAccount = inAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
        Account ａccount = accountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
        return new AccountAdapter(ａccount);
    }

//    public Optional<Account> findByAccountId(String userName) {
//        ExtAccount extAccount = extAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        InAccount inAccount = inAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        return new ;
//    }
}
