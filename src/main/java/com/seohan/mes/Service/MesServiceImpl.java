package com.seohan.mes.Service;

import com.seohan.mes.Domain.Trans;
import com.seohan.mes.Mapper.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class MesServiceImpl implements MesService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
  
    @Autowired
    TransRepository transRepository;
	
	@Override
	public List<Trans> TransList(Trans trans) throws Exception {
		List<Trans> transResult = transRepository.findByTrsdt(trans.getTRSDT());
		return transResult ;
	} 
	  
}
