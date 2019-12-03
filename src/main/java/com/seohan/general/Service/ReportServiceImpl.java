package com.seohan.general.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.Report;
import com.seohan.general.Domain.SmsModel;
import com.seohan.general.Mapper.ReportRepository;
import com.seohan.global.Domain.Response;

@Service
public class ReportServiceImpl implements ReportService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

//	@Autowired
//	private EtcMapper etcMapper; 

    @Autowired
    ReportRepository reportRepository;
      
	@Override
	public List<Report> report() throws Exception {
//		return etcMapper.report();
		return reportRepository.reportListbyStat("01");
	}

	@Override
	public Report save(Report report) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());		 
		SmsModel smsModel = new SmsModel();
		Response<Object> response = new Response<Object>();
		 
		
		reportRepository.save(report); 
		return report;
	} 
}
