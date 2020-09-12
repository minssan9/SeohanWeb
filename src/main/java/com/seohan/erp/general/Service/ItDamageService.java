package com.seohan.erp.general.Service;

import java.util.List;

import com.seohan.erp.general.Domain.ItDamage;

public interface ItDamageService {
	List<ItDamage> itDamage() throws Exception;
	ItDamage save(ItDamage itDamage) throws Exception;
	ItDamage update(ItDamage itDamage) throws Exception; 
}
