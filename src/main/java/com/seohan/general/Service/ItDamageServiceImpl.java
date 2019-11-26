package com.seohan.general.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.It_Damage;
import com.seohan.general.Domain.SmsModel;
import com.seohan.general.Mapper.It_DamageRepository;
import com.seohan.global.Domain.Response;

@Service
public class ItDamageServiceImpl implements ItDamageService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

//	@Autowired
//	private EtcMapper etcMapper; 

    @Autowired
    It_DamageRepository it_DamageRepository;
      
	@Override
	public List<It_Damage> itDamage() throws Exception {
//		return etcMapper.itDamage();
		return it_DamageRepository.it_DamageListbyStat("01");
	}

	@Override
	public It_Damage save(It_Damage itDamage) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());		 
		SmsModel smsModel = new SmsModel();
		Response<Object> response = new Response<Object>();
		
		itDamage.setCtime(nowDate);
		itDamage.setStat("09");
		smsModel.setContent(itDamage.getRtxt() + " - 조치 완료 / 확인 후 미조치사항 전산팀 연락 바람");
		smsModel.setPhone(itDamage.getRtel());
		smsModel.setSendNo("043-530-3174");
		
		it_DamageRepository.save(itDamage); 
		return itDamage;
	} 
}
