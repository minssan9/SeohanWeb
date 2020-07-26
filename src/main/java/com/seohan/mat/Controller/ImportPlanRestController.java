package com.seohan.mat.Controller;

import com.seohan.mat.Domain.ImportPlan;
import com.seohan.mat.Dto.ImportPlanAlarm;
import com.seohan.mat.Mapper.ImportPlanRepository;
import com.seohan.mat.Service.ImportPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RequestMapping("/mat/importPlan")
@Slf4j 
@RestController
class ImportPlanRestController {
	@Autowired
	private ImportPlanService importPlanService;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("")
	public @ResponseBody List<ImportPlanAlarm> getImportPlanList(@RequestParam String querydate, String userid) {
		return importPlanService.getOmissionItemList(querydate, userid);
	}

//	@GetMapping("{udate}")
//	public @ResponseBody List<ImportPlan> getOneImportPlan(@PathVariable String udate) throws Exception {
//		return importPlanRepository.importPlanListbyUdate(udate);
//	}
}
