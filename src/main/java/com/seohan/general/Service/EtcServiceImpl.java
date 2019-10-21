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
import com.seohan.global.Domain.Response;

@Service
public class EtcServiceImpl implements EtcService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	@Autowired
	private EtcMapper etcMapper; 
	
	@Override
	public List<Food> foodList(Dto dto) throws Exception { 
		return etcMapper.foodList(dto);
	}
 

	@Override
	public List<ItDamage> itDamage() throws Exception {
		return etcMapper.itDamage();
	}

	@Override
	public void putItDamage(ItDamage itDamage) throws Exception { 
		etcMapper.postItDamage(itDamage) ; 
	}

	@Override
	public void postItDamage(ItDamage itDamage) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());		 
		SmsModel smsModel = new SmsModel();
		Response<Object> response = new Response<Object>();
		
		itDamage.setCtime(nowDate);
		itDamage.setStat("09");
		smsModel.setContent(itDamage.getRtxt() + " - 조치 완료 / 확인 후 미조치사항 전산팀 연락 바람");
		smsModel.setPhone(itDamage.getRtel());
		smsModel.setSendNo("043-530-3174");
		
		etcMapper.postItDamage(itDamage);
	} 
}
