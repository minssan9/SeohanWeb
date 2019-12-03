package com.seohan.general.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.general.Domain.ItDamage;
import com.seohan.general.Domain.Report;
import com.seohan.general.Domain.SmsModel;
import com.seohan.general.Mapper.ItDamageRepository;
import com.seohan.general.Mapper.ReportRepository;
import com.seohan.global.Domain.Response;

@Service
public class ItDamageServiceImpl implements ItDamageService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	@Autowired
    ReportRepository reportRepository; 

    @Autowired
    ItDamageRepository itDamageRepository;
      
	@Override
	public List<ItDamage> itDamage() throws Exception {
		return itDamageRepository.findItDamageByStat("01");
	}

	@Override
	@Transactional
	public ItDamage save(ItDamage itDamage) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());	 
		
		itDamage.setCtime(nowDate);
		itDamage.setStat("09");
//		smsModel.setContent(itDamage.getRtxt() + " - 조치 완료 / 확인 후 미조치사항 전산팀 연락 바람");
//		smsModel.setPhone(itDamage.getRtel());
//		smsModel.setSendNo("043-530-3174");
		Report report = new Report();
		String docuNo[] = itDamage.getClass3().split("-");
		if (itDamage.getClass3().length()> 0 ) {
			report.setUDATE(docuNo[0]);
			report.setSER(docuNo[1]);
			report.setSGUB("G");
			report.setSDATE(nowDate.substring(8));
			report.setSTIME(nowDate.substring(8, 14));
			report.setEDATE(nowDate.substring(8));
			report.setETIME(nowDate.substring(8, 14));
			report.setSTAT("9");
			reportRepository.save(report);			
		}		
		itDamageRepository.save(itDamage );;		 
		return itDamage;
	} 
}
