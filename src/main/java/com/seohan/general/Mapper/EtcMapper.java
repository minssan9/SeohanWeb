package com.seohan.general.Mapper;

import java.util.List;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.Food;
import com.seohan.general.Domain.ItDamage;

public interface EtcMapper {
	public List<Food> foodList(Dto dto); 
	public List<ItDamage> itDamage();
	public void postItDamage(ItDamage itDamage);
	public void endItDamage(ItDamage itDamage);
}
