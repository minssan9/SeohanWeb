package com.seohan.auth;

import com.seohan.auth.Domain.Account;
import com.seohan.auth.Mapper.AccountRepository;
import com.seohan.auth.Service.AccountService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthRepoTest {
    @Autowired
    AccountService accountService;
    @Autowired
    AccountRepository AccountRepository;

    @Test
    public void 로그인 (){
        Account account1 = new Account();
        account1.setAccountId("4150149");
        account1.setPassword("1234");
        account1.setCompanyCode("SEOHAN");

//        Account account2 = AccountRepository.findByAsabnAndCo_gb("4150149","SEOHAN" ).get();
        Account account2 = AccountRepository.findByAccountId("4150149").get();

        Assert.assertEquals(account1, account2);
    }

}
