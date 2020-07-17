package com.seohan.mat.Controller;

import com.seohan.general.Mapper.ReportRepository;
import com.seohan.mat.Domain.ImportPlan;
import com.seohan.mat.Mapper.ImportPlanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/mat/importPlan")
@Slf4j 
@RestController
class ImportPlanRestController {
	@Autowired
	private ImportPlanRepository importPlanRepository;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("")
	public @ResponseBody List<ImportPlan> getAllList(@RequestParam String stat) throws Exception {
		return importPlanRepository.findByStat(stat);
	}

	@GetMapping("{udate}")
	public @ResponseBody List<ImportPlan> getOneImportPlan(@PathVariable String udate) throws Exception {
		return importPlanRepository.importPlanListbyUdate(udate);
	}
}
