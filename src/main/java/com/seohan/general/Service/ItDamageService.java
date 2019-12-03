package com.seohan.general.Service;

import java.util.List;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.ItDamage;

public interface ItDamageService {
	public List<ItDamage> itDamage() throws Exception;
	public ItDamage save(ItDamage itDamage) throws Exception; 
}
