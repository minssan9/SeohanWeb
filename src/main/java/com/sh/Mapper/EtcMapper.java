package com.sh.Mapper;

import java.util.List;

import com.sh.Domain.Dto;
import com.sh.Domain.Food;
import com.sh.Domain.ItDamage;

public interface EtcMapper {
	public List<Food> foodList(Dto dto); 
	public List<ItDamage> selectItDamage();
	public void endDamage(ItDamage itDamage);
}
