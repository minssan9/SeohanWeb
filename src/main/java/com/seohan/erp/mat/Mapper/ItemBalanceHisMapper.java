package com.seohan.erp.mat.Mapper;

import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public class ItemBalanceHisMapper {
	protected static final String NAMESPACE = "com.seohan.erp.mat.mapper.";

	@Autowired
	private SqlSession sqlSessionTemplate;

	public void saveBalanceByDate(ItemBalanceSaveQuery itemBalanceSaveQuery){
		sqlSessionTemplate.update(NAMESPACE +  "saveBalanceByDate", itemBalanceSaveQuery);
	};
}
