package com.seohan.general.Service;

import java.util.Objects;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.general.Domain.User;
import com.seohan.general.Mapper.UserRepository;

/**
 * Created by vivie on 2017-06-08.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	private static final String DEFAULT_NICKNAME = "번째러버";
	private static final String PROFILE_DEFAULT_PATH = "/profile/0/profile_default.jpg";
	private static final String SIGNIN_EXCEPTION_MSG = "로그인정보가 일치하지 않습니다.";
	private static final String EMAIL_EXIST_EXCEPTION_MSG = "이미 계정이 존재합니다.";
	private static final String NICKNAME_EXIST_EXCEPTION_MSG = "이미 닉네임이 존재합니다.";

	@Autowired
	private UserRepository userRepository;
 
 
	@Override
	public boolean isExist(String asabn) {
		boolean isExist = false;
		User member = userRepository.findByAsabn(asabn);
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
	public User signin(String companyCode, String asabn, String password) {
		User user = userRepository.findByAsabnAndCo_gb(asabn, companyCode) ;
		Objects.requireNonNull(user, SIGNIN_EXCEPTION_MSG);

		if (!this.isAccordPassword(user, password)) {
			throw new IllegalStateException(SIGNIN_EXCEPTION_MSG);
		} 
		return user;
	}

	private boolean isAccordPassword(User user, String password) {
		String encodedPassword = user.getPass().trim();
//		return BCrypt.checkpw(password, encodedPassword);
		return password.equals(encodedPassword);
	}
  
	@Override
	public User findByCompanyCodeAndAsabn(User user) {
		return userRepository.findByAsabnAndCo_gb(user.getAsabn(), user.getCompanyCode());
	}
 
}
