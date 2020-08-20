package com.seohan.erp.mat.Mapper;

import com.seohan.erp.mat.Domain.ItemBalanceHisOld;
import com.seohan.erp.mat.Dto.ImportPlanAlarmQuery;
import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public class ItemBalanceHisOldMapper {
	protected static final String NAMESPACE = "com.seohan.erp.mat.mapper.";

	@Autowired
	private SqlSession sqlSessionTemplate;

	public List<ItemBalanceHisOld> getOldBalanceByDate(ItemBalanceSaveQuery itemBalanceSaveQuery){
		return sqlSessionTemplate.selectList(NAMESPACE +  "getOldBalanceByDate", itemBalanceSaveQuery);
	};
}
