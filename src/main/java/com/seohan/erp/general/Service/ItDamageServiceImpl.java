package com.seohan.erp.general.Service;

import com.seohan.erp.general.Domain.ItDamage;
import com.seohan.erp.general.Domain.Report;
import com.seohan.erp.general.Mapper.ItDamageRepository;
import com.seohan.erp.general.Mapper.ReportRepository;
import com.seohan.file.Service.FileService;
import com.seohan.global.Dto.MessageDto;
import com.seohan.global.Service.MessageService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service
public class ItDamageServiceImpl implements ItDamageService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	@Autowired
	FileService fileService;
	@Autowired
    ReportRepository reportRepository; 
    @Autowired
    ItDamageRepository itDamageRepository;
    @Autowired
	MessageService messageService;

      
	@Override
	public List<ItDamage> itDamage() throws Exception {
		return itDamageRepository.findItDamageByStat("01");
	}

	@Override
//	@Transactional
	public ItDamage update(ItDamage itDamage) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());	 
		
		itDamage.setCtime(nowDate);
		itDamage.setStat("09");

		if (itDamage.getClass3().trim().length()> 0 ) {
			Report report = new Report();
			String docuNo[] = itDamage.getClass3().split("-");
			report.setUdate(docuNo[0]);
			report.setSer((docuNo[1]));
			report.setSgub("G");
			report.setSdate(nowDate.substring(8));
			report.setStime(nowDate.substring(8, 14));
			report.setEdate(nowDate.substring(8));
			report.setEtime(nowDate.substring(8, 14));
			report.setStat("9");
			try{
				reportRepository.save(report);			
			}
			catch(Exception e){
				e.printStackTrace(); //오류 출력(방법은 여러가지)
			}
		}		
		itDamageRepository.save(itDamage );

		MessageDto messageDto = MessageDto.builder()
				.company(itDamage.getCo_gb())
				.recipient_num(itDamage.getRtel())
				.accountId(itDamage.getRsabun())
				.receiverId(itDamage.getRsabun())
				.text(itDamage.getRtxt() + "/n" + itDamage.getCtxt() + " - 조치 완료 / 확인 후 미조치사항 전산팀 연락 바람")
				.build();

		messageService.sendMessage(messageDto);

		return itDamage;
	}


	@Override 
	public ItDamage save(ItDamage itDamage) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());	 
		
		itDamage.setCo_gb("SEOHAN");
		itDamage.setStat("01");
		itDamage.setRtime(nowDate); 
		itDamage.setClass1(itDamage.getClass1().replace(" ",""));
		if(!itDamage.getAttach().equals("")) {
			String ext = FilenameUtils.getExtension(itDamage.getAttach());
			itDamage.setAttach(nowDate + "." + ext);
		}
//		smsModel.setContent(itDamage.getRtxt() + " - 조치 완료 / 확인 후 미조치사항 전산팀 연락 바람");
//		smsModel.setPhone(itDamage.getRtel());
//		smsModel.setSendNo("043-530-3174");
		itDamageRepository.save(itDamage );	
		
		return itDamage;
	} 
}
