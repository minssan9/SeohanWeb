package com.seohan.auth.Service;

import org.springframework.stereotype.Service;
import com.seohan.auth.Domain.Member;
import java.util.Optional;

/**
 * Created by vivie on 2017-06-08.
 */
@Service
public interface MemberService {

	boolean isExist(String email);
    
    void validate(String email);

    Member signin( String companyCode, String asabn, String password);
}
