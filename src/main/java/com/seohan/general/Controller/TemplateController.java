package com.seohan.general.Controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.seohan.general.Domain.Dto;
import com.seohan.general.Service.FoodTableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/generalPage")
@Controller
public class TemplateController { 
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
		
		return "general/food/food";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "general/account/hello";
	}
	@RequestMapping("/my")
	public String my() {
		return "general/account/my";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/itdamage")
	public String itDamageList() {		
		return "general/itDamage/list";
	}
	
	@RequestMapping("/itdamage/new")
	public String itDamageNew() { 
		return "general/itDamage/new";
	} 
	
	@RequestMapping("/temperature")
	public String temperatureList() { 
		return "general/temperature/list";
	} 
}