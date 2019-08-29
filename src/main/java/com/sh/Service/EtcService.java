package com.sh.Service;

import java.util.List;

import com.sh.Domain.Dto;
import com.sh.Domain.Food;
import com.sh.Domain.ItDamage;

public interface EtcService { 
	public List<Food> foodList(Dto dto);

	public List<ItDamage> selectItDamage();

	public void endDamage(ItDamage itDamage);
}
