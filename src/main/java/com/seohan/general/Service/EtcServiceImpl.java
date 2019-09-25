package com.seohan.general.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.Food;
import com.seohan.general.Domain.ItDamage;
import com.seohan.general.Domain.SmsModel;
import com.seohan.general.Mapper.EtcMapper;

@Service
public class EtcServiceImpl implements EtcService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	@Autowired
	private EtcMapper etcMapper; 
	
	@Override
	public List<Food> foodList(Dto dto) { 
		return etcMapper.foodList(dto);
	}
 

	@Override
	public List<ItDamage> selectItDamage() {
		return etcMapper.selectItDamage();
	}

	@Override
	public void endDamage(ItDamage itDamage) { 
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());		 
		SmsModel smsModel = new SmsModel();
		itDamage.setCtime(nowDate);
		smsModel.setContent(itDamage.getRtxt() + " - 조치 완료 / 확인 후 미조치사항 전산팀 연락 바람");
		smsModel.setPhone(itDamage.getRtel());
		smsModel.setSendNo("043-530-3174");
		
		 etcMapper.endDamage(itDamage); 
	}

}
