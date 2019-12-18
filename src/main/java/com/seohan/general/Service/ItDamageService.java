package com.seohan.general.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.seohan.general.Domain.ItDamage;

public interface ItDamageService {
	List<ItDamage> itDamage() throws Exception;
	ItDamage save(ItDamage itDamage) throws Exception;
	ItDamage update(ItDamage itDamage) throws Exception; 
}
