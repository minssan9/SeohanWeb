package com.seohan.general.Service;

import java.util.List;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.Food;
import com.seohan.general.Domain.ItDamage;

public interface EtcService { 
	public List<Food> foodList(Dto dto) throws Exception;

	public List<ItDamage> itDamage() throws Exception;

	public void postItDamage(ItDamage itDamage) throws Exception; 

	public void putItDamage(ItDamage itDamage) throws Exception;
}
