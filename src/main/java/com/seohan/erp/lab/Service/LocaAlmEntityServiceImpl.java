package com.seohan.erp.lab.Service;

import com.seohan.erp.general.Domain.FoodTable;
import com.seohan.erp.general.Mapper.FoodTableRepository;
import com.seohan.erp.lab.Domain.LocaAlmEntity;
import com.seohan.erp.lab.Mapper.LocaAlmEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class LocaAlmEntityServiceImpl implements LocaAlmEntityService {
  
    @Autowired
	LocaAlmEntityRepository locaAlmEntityRepository;


	@Override
	public List<LocaAlmEntity> endLocaAlmEntity(List<LocaAlmEntity> locaAlmEntitys)  {
		for (LocaAlmEntity locaAlmEntity : locaAlmEntitys){
			locaAlmEntity.setSts("9");
		}
		return locaAlmEntityRepository.saveAll(locaAlmEntitys);
	}
}
