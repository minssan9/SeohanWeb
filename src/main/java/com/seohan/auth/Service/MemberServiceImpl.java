package com.seohan.auth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.auth.Domain.Member;
import com.seohan.auth.Mapper.MemberRepository;

/**
 * Created by vivie on 2017-06-08.
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	private static final String DEFAULT_NICKNAME = "번째러버";
	private static final String PROFILE_DEFAULT_PATH = "/profile/0/profile_default.jpg";
	private static final String NOTEXIST_EXCEPTION_MSG = "계정이 없습니다.";
	private static final String SIGNIN_EXCEPTION_MSG = "로그인정보가 일치하지 않습니다.";
	private static final String EMAIL_EXIST_EXCEPTION_MSG = "이미 계정이 존재합니다.";
	private static final String NICKNAME_EXIST_EXCEPTION_MSG = "이미 닉네임이 존재합니다.";

	@Autowired
	private MemberRepository memeberRepository;
 
 
	@Override
	public boolean isExist(String asabn) {
		boolean isExist = false;
		Member member = memeberRepository.findByAsabn(asabn);
		if (member != null) {
			isExist = true;
		}
		return isExist;
	}

	@Override
	public void validate(String email) {
		if (this.isExist(email)) {
			throw new IllegalStateException(EMAIL_EXIST_EXCEPTION_MSG);
		}
	}

	@Override
	public Member signin(String companyCode, String asabn, String password) {
		Member member = memeberRepository.findByAsabnAndCo_gb(asabn, companyCode) ;
		if(member==null){
			throw new IllegalStateException(NOTEXIST_EXCEPTION_MSG);
		}
		if (!this.isAccordPassword(member, password)) {
			throw new IllegalStateException(SIGNIN_EXCEPTION_MSG);
		}
		return member;
	}

	private boolean isAccordPassword(Member member, String password) {
		String encodedPassword = member.getPass().trim();
//		return BCrypt.checkpw(password, encodedPassword);
		return password.equals(encodedPassword);
	}
  
	@Override
	public Member findByCompanyCodeAndAsabn(Member member) {
		return memeberRepository.findByAsabnAndCo_gb(member.getAsabn(), member.getCompanyCode());
	}
 
}
