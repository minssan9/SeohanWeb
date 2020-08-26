package com.seohan.erp.mat.Mapper;

import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public class ItemBalanceHeaderMapper {
	protected static final String NAMESPACE = "com.seohan.erp.mat.mapper.";

	@Autowired
	private SqlSession sqlSessionTemplate;


	public void saveBalanceHisHeader(ItemBalanceSaveQuery itemBalanceSaveQuery){
		sqlSessionTemplate.update(NAMESPACE +  "saveBalanceHisHeader", itemBalanceSaveQuery);
	};

//	public void saveBalanceHisOldHeader(ItemBalanceSaveQuery itemBalanceSaveQuery){
//		sqlSessionTemplate.update(NAMESPACE +  "saveBalanceHisOldHeader", itemBalanceSaveQuery);
//	};

}
