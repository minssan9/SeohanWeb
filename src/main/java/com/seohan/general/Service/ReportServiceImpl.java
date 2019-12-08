package com.seohan.general.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seohan.general.Domain.Report;
import com.seohan.general.Domain.SmsModel;
import com.seohan.general.Mapper.ReportRepository;
import com.seohan.global.Domain.Response;

@Service
public class ReportServiceImpl implements ReportService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    @Autowired
    ReportRepository reportRepository;
      
	@Override
	public Report save(Report report) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());		
		Response<Object> response = new Response<Object>();
   
		report.setUdate(nowDate);
		report.setSer( reportRepository.getMaxSerReportByUdate(nowDate).toString());
		report.setStat("1");		
		reportRepository.save(report);		 
		return report;
	} 
}
