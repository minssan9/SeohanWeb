package com.sh.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sh.Domain.ItDamage;
import com.sh.Service.EtcService;

@Controller
public class EtcController {

	@Autowired
	private EtcService etcService;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@RequestMapping("/foodPage")
	public String todayFood(Model model, String datepicker) {
		Calendar cal = Calendar.getInstance();
		String nowDate = sdf.format(cal.getTime());
		
		if (datepicker!= null ){
			nowDate =  datepicker;
		} 
		nowDate= nowDate.substring(0, 4) + "-" +nowDate.substring(4, 6)+"-"+nowDate.substring(6, 8);
		model.addAttribute("date", nowDate); 

		return "food";
	}

	@RequestMapping("/itdamage")
	public ModelAndView selectItDamage(ModelAndView mav) { 
		List<ItDamage> damageList = etcService.selectItDamage(); 
		mav.addObject("List", damageList); 
		mav.setViewName("itDamage");
		return mav;
	}
	
	@RequestMapping("/endDamage")
	public String endDamage(ModelAndView mav, ItDamage itDamage) { 
		etcService.endDamage(itDamage); 

		return "redirect:itdamage";
	} 
}