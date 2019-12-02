package com.seohan.general.Service;

import java.util.List;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.Report;

public interface ReportService {
	public List<Report> report() throws Exception;
	public Report save(Report report) throws Exception; 
}
