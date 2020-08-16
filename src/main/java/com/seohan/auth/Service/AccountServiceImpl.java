//package com.seohan.auth.Service;
//
//import com.seohan.auth.Domain.Account;
//import com.seohan.auth.Mapper.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
///**
// * Created by vivie on 2017-06-08.
// */
//@Service
//public class AccountServiceImpl implements AccountService, UserDetailsService {
//
//	private static final String DEFAULT_NICKNAME = "번째러버";
//	private static final String PROFILE_DEFAULT_PATH = "/profile/0/profile_default.jpg";
//	private static final String NOTEXIST_EXCEPTION_MSG = "계정이 없습니다.";
//	private static final String SIGNIN_EXCEPTION_MSG = "로그인정보가 일치하지 않습니다.";
//	private static final String EMAIL_EXIST_EXCEPTION_MSG = "이미 계정이 존재합니다.";
//	private static final String NICKNAME_EXIST_EXCEPTION_MSG = "이미 닉네임이 존재합니다.";
//
//	@Autowired
//	private AccountRepository accountRepository;
//
//
//	@Override
//	public boolean isExist(String asabn) {
//		boolean isExist = false;
//		Optional<Account> member = accountRepository.findByAccountId(asabn);
//		if (member != null) {
//			isExist = true;
//		}
//		return isExist;
//	}
//
//	@Override
//	public void validate(String email) {
//		if (this.isExist(email)) {
//			throw new IllegalStateException(EMAIL_EXIST_EXCEPTION_MSG);
//		}
//	}
//
//	@Override
//	public Account signin(String companyCode, String asabn, String password) {
//		Optional<Account> member = accountRepository.findByAsabnAndCo_gb(asabn, companyCode);
//		member.ifPresent(m->{
//					if (!this.isAccordPassword(m, password)) {
//						throw new IllegalStateException(SIGNIN_EXCEPTION_MSG);
//					}
//				});
//
//		member.orElseGet(()->{
//			throw new IllegalStateException(NOTEXIST_EXCEPTION_MSG);
//		});
//		return member.get();
//	}
//
//	private boolean isAccordPassword(Account account, String password) {
//		String encodedPassword = account.getPassword().trim();
////		return BCrypt.checkpw(password, encodedPassword);
//		return password.equals(encodedPassword);
//	}
//
//
//	@Override
//	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//		Account account = accountRepository.findByAccountId(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
//		return new AccountAdapter(account);
//	}
//}
