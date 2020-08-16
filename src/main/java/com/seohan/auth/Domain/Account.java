package com.seohan.auth.Domain;

import java.util.HashSet;
import java.util.Set;

public interface Account  {
	String accountId="";
	String companyCode="";
	String password="";
	Set<AccountRoles> roles= new HashSet<>();

	String getAccountId();
	String getPassword();
	Set<AccountRoles> getRoles();

}