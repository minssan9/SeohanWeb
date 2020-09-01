package com.seohan.erp.mat.Service;

import com.seohan.erp.mat.Domain.LocaAlmEntity;
import com.seohan.erp.mat.Repository.LocaAlmEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
