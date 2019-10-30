package com.seohan.general.Mapper;

import java.util.List;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.Food;
import com.seohan.general.Domain.ItDamage;

import org.apache.ibatis.annotations.Update;

public interface EtcMapper {
	public List<Food> foodList(Dto dto) throws Exception; 
	public List<ItDamage> itDamage() throws Exception; 
	
	// @Update("UPDATE SITLIB.IT_MST_HIS2 SET ctime = #{ctime} WHERE jtime = #{rtime}")
	public void postItDamage(ItDamage itDamage) throws Exception;
	
	public void putItDamage(ItDamage itDamage) throws Exception;
}
