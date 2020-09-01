package com.seohan.erp.mat.Mapper;

import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Dto.ImportPlanAlarmQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public class ImportPlanMapper {
	protected static final String NAMESPACE = "com.seohan.erp.mat.mapper.";

	@Autowired
	private SqlSession sqlSessionTemplate;

	public List<ImportPlanAlarm> findGetOmissionItemList(ImportPlanAlarmQuery importPlanAlarmQuery){
		return sqlSessionTemplate.selectList(NAMESPACE +  "findGetOmissionItemList", importPlanAlarmQuery);
	};
}
