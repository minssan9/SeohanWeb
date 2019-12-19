package com.seohan.general.Controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/generalPage")
@Controller
public class TemplateController { 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");
	 

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
	 
}