package com.seohan.auth.Service;

import com.seohan.auth.Dto.Account;
import com.seohan.auth.Mapper.AccountMapper;
import com.seohan.auth.Repository.ExtAccountRepository;
import com.seohan.auth.Repository.InAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService implements UserDetailsService {
    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private ExtAccountRepository extAccountRepository;

    @Autowired
    private InAccountRepository inAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        ExtAccount extAccount = extAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        InAccount inAccount = inAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        AccountDto account = accountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
        Account account = accountMapper.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
        return new AccountAdapter(account);
    }

    public Optional<Account> findByAccountId(String userName) {
//        if (isNumeric( userName.substring(0,1))){
//            InAccount inAccount = inAccountRepository.findByAsabn(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        }else{
//            ExtAccount extAccount = extAccountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//        }

//        Optional<Account> account = accountMapper.findByAccountId(userName);

        return  accountMapper.findByAccountId(userName);
    }
}
