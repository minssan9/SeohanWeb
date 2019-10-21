package com.seohan.general.Controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Service.EtcService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/generalPage")
@Controller
public class EtcController {

	@Autowired
	private EtcService etcService;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@RequestMapping("/food")
	public String todayFood(Model model, String datepicker) {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());
		
		if (datepicker!= null ){
			nowDate =  datepicker;
		} 
		nowDate= nowDate.substring(0, 4) + "-" +nowDate.substring(4, 6)+"-"+nowDate.substring(6, 8);
		model.addAttribute("date", nowDate); 
		
		return "general/food";
	}

	@RequestMapping("/index")
	public String hello() {
		return "index";
	}
	
	@RequestMapping("/itdamage")
	public String selectItDamage() {		
		return "general/itDamage/list";
	}
	
	@RequestMapping("/itDamage/New")
	public String itDamageNew(Dto dto) { 
		return "general/itDamage/new";
	} 
}