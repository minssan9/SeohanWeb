package com.seohan.erp.general.Service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.erp.general.Domain.FoodTable;
import com.seohan.erp.general.Mapper.FoodTableRepository;

@Service
public class FoodTableServiceImpl implements FoodTableService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
  
    @Autowired
    FoodTableRepository foodTableRepository; 
	
	@Override
	public List<FoodTable> foodTableList(FoodTable foodTable) throws Exception { 
//		return etcMapper.foodList(dto);
		List<FoodTable> foodTableResult = foodTableRepository.findByGdate(foodTable.getGdate());
		return foodTableResult;
	} 
	  
}
