package com.seohan.general.Controller;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seohan.file.Service.FTPService;
import com.seohan.general.Domain.Report;
import com.seohan.general.Mapper.ReportRepository;
import com.seohan.general.Service.ReportService;

import lombok.extern.slf4j.Slf4j; 

@RequestMapping("/general/report")
@Slf4j 
@RestController
class ReportRestController { 
	
	@Autowired
	private ReportService reportService;
	@Autowired
	private ReportRepository it_DamageRepo;
	
	@Autowired
	private FTPService ftpService;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("/")
	public @ResponseBody List<Report> getAllList() throws Exception { 
		return it_DamageRepo.it_DamageListbyStat("01");
	}

	@GetMapping("/{udate}")
	public @ResponseBody Report getOneReport(@PathVariable String udate) throws Exception { 
		return it_DamageRepo.it_DamageListbyRdate(udate);
	}
	
	@PutMapping("/save")
	public ResponseEntity<Report> updateReport(@PathVariable String udate, @RequestBody Report report ) throws Exception { 		
		Report reportUpdated = reportService.save(report );
		return new ResponseEntity<Report>(reportUpdated, HttpStatus.OK);
	}

	@PostMapping("/{udate}")
	public ResponseEntity<Void> createReport(@PathVariable String udate, @RequestBody Report report )  throws Exception { 		
		Report reportCreated= reportService.save(report );
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{udate}"	).buildAndExpand(reportCreated.getUDATE()).toUri();
		return   ResponseEntity.created(uri).build();
	}

}
