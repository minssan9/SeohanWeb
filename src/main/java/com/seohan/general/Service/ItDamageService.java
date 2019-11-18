package com.seohan.general.Service;

import java.util.List;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.It_Damage;

public interface ItDamageService {
	public List<It_Damage> itDamage() throws Exception;
	public void saveItDamage(It_Damage itDamage) throws Exception;
	public void updateItDamage(It_Damage itDamage) throws Exception;
}