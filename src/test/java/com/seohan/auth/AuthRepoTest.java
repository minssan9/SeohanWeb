package com.seohan.auth;

import com.seohan.auth.Domain.Member;
import com.seohan.auth.Mapper.MemberRepository;

import com.seohan.auth.Service.MemberService;
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
    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    public void 로그인 (){
        Member member1 = new Member();
        member1.setAsabn("4150149");
        member1.setPass("1234");
        member1.setCompanyCode("SEOHAN");

        Member member2 = memberRepository.findByAsabnAndCo_gb("4150149","SEOHAN" ).get();

        Assert.assertEquals(member1,member2);
    }

}
