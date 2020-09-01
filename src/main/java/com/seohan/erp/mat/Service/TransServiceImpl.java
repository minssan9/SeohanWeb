package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Domain.Trans;
import com.seohan.erp.mat.Repository.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransServiceImpl implements TransService {
  
    @Autowired
    private TransRepository transRepository;
	
	@Override
	public List<Trans> TransListByTrsdt(String transDate) {
		return  transRepository.findByTrsdt(transDate);
	} 
	  
}
