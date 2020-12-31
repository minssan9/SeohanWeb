package com.seohan.auth.Service;

import com.seohan.auth.Domain.ExtAccount;
import com.seohan.auth.Dto.Account;
import com.seohan.auth.Mapper.AccountMapper;
import com.seohan.auth.Repository.ExtAccountRepository;
import com.seohan.auth.Repository.InAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by vivie on 2017-06-08.
 */
@Service
public class AccountService implements UserDetailsService {

	private static final String DEFAULT_NICKNAME = "번째러버";
	private static final String PROFILE_DEFAULT_PATH = "/profile/0/profile_default.jpg";
	private static final String NOTEXIST_EXCEPTION_MSG = "계정이 없습니다.";
	private static final String SIGNIN_EXCEPTION_MSG = "로그인정보가 일치하지 않습니다.";
	private static final String EMAIL_EXIST_EXCEPTION_MSG = "이미 계정이 존재합니다.";
	private static final String NICKNAME_EXIST_EXCEPTION_MSG = "이미 닉네임이 존재합니다.";

    @Autowired
    private AccountMapper accountMapper;
	@Autowired
	private InAccountRepository inAccountRepository;
	@Autowired
	private ExtAccountRepository extAccountRepository;

	private boolean isAccordPassword(Account account, String password) {
		String encodedPassword = account.getPassword().trim();
//		return BCrypt.checkpw(password, encodedPassword);
		return password.equals(encodedPassword);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		HashMap map = new HashMap();

		AccountAdapter accountAdapter = new AccountAdapter(accountMapper.findByAccountId(username).get());

		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

		User.UserBuilder builder =	User.builder()
						.passwordEncoder(encoder::encode);

//		if (accountAdapter!= null) {
//			userDetails = builder.username(accountAdapter.getUsername())
//					.password(accountAdapter.getPassword())
//					.roles(accountAdapter.getAuthorities())
//					.build();
//		}

		return accountAdapter;
	}



    public Optional<Account> findByAccountId(String userName) {
        return  accountMapper.findByAccountId(userName);
    }
}
