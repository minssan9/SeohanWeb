package com.seohan.general.Mapper;

import java.util.List;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.It_Damage;


public interface EtcMapper {
	public List<FoodTable> foodList(Dto dto) throws Exception; 
	public List<It_Damage> itDamage() throws Exception; 
	
	// @Update("UPDATE SITLIB.IT_MST_HIS2 SET ctime = #{ctime} WHERE jtime = #{rtime}")
	public void postItDamage(It_Damage itDamage) throws Exception;
	
	public void putItDamage(It_Damage itDamage) throws Exception;
}
