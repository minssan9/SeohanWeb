package com.seohan.auth.Mapper;

import com.seohan.auth.Dto.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Mapper
public class AccountMapper  {
	protected static final String NAMESPACE = "com.seohan.auth.mapper.";

	@Autowired SqlSession sqlSessionTemplate;

	public Optional<Account> findByAccountId(String accountid){
		Optional<Account> account = Optional.of(sqlSessionTemplate.selectOne(NAMESPACE +  "findByAccountId", accountid));
		return account;
	};
}
 