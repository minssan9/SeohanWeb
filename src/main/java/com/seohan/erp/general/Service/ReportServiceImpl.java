package com.seohan.erp.general.Service;

import com.seohan.erp.general.Domain.Report;
import com.seohan.erp.general.Mapper.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@Service
public class ReportServiceImpl implements ReportService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    @Autowired
    ReportRepository reportRepository;
      
	@Override
	public Report save(Report report) throws Exception {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());
   
		report.setUdate(nowDate);
		report.setSer( reportRepository.getMaxSerReportByUdate(nowDate).toString());
		report.setStat("1");		
		reportRepository.save(report);		 
		return report;
	} 
}
