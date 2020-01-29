package com.seohan.general.Service;

import org.springframework.stereotype.Service;

import com.seohan.general.Domain.User;

/**
 * Created by vivie on 2017-06-08.
 */
@Service
public interface UserService {

	boolean isExist(String email);
    
    void validate(String email);

    User signin( String companyCode, String asabn, String password);
       
	User findByCompanyCodeAndAsabn(User user);
}
