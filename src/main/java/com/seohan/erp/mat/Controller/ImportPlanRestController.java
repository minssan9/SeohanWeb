package com.seohan.erp.mat.Controller;

import com.seohan.erp.mat.Domain.ImportPlan;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Repository.ImportPlanRepository;
import com.seohan.erp.mat.Service.ImportPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/mat/importplan")
@Slf4j
@RestController
class ImportPlanRestController {
	@Autowired
	private ImportPlanService importPlanService;

	@Autowired
	ImportPlanRepository importPlanRepository;
	@GetMapping("{importPlanId}")
	public @ResponseBody List<ImportPlan> getOneImportPlan(@PathVariable Long importPlanId) throws Exception {
//		return importPlanRepository.findByWarhsAndItmno(importPlanId, "" );
		return null;
	}
}
