package com.seohan.mat.Mapper;

import com.seohan.mat.Dto.ImportPlanAlarm;
import com.seohan.mat.Dto.ImportPlanAlarmQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public class ImportPlanMapper {
	protected static final String NAMESPACE = "com.seohan.mat.mapper.";

	@Autowired
	private SqlSession sqlSessionTemplate;

	public List<ImportPlanAlarm> findGetOmissionItemList(ImportPlanAlarmQuery importPlanAlarmQuery){
		return sqlSessionTemplate .selectList(NAMESPACE +  "findGetOmissionItemList", importPlanAlarmQuery);
	};
}
