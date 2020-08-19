package com.seohan.erp.general.Controller;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seohan.file.Service.FileService;
import com.seohan.erp.general.Domain.ItDamage;
import com.seohan.erp.general.Mapper.ItDamageRepository;
import com.seohan.erp.general.Service.ItDamageService;

import lombok.extern.slf4j.Slf4j; 

@RequestMapping("/general/itdamage")
@Slf4j 
@RestController
class ItDamageRestController { 
	@Autowired
	private FileService fileService;
	@Autowired
	private ItDamageService itDamageService;
	@Autowired
	private ItDamageRepository itDamageRepo;
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("")
	public @ResponseBody List<ItDamage> getAllList(@RequestParam String stat) throws Exception {		
		return itDamageRepo.findItDamageByStat(stat); 
	}

	@GetMapping("{rtime}")
	public @ResponseBody ItDamage getOneItDamage(@PathVariable String rtime) throws Exception { 
		return itDamageRepo.findItDamageByRtime("SEOHAN", rtime);
	}
	@PutMapping("update")
	public ResponseEntity<ItDamage> updateItDamage(@RequestBody ItDamage itDamage ) throws Exception { 		
		ItDamage itDamageUpdated = itDamageService.update(itDamage); 
		return new ResponseEntity<ItDamage>(itDamageUpdated, HttpStatus.OK);
	}

	@PostMapping("save")
	public ResponseEntity<ItDamage> createItDamage(@RequestBody ItDamage itDamage)  throws Exception {		
		ItDamage itDamageCreated= itDamageService.save(itDamage );  
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+itDamageCreated.getRtime()	).buildAndExpand(itDamageCreated.getRtime()).toUri();
//		return   ResponseEntity.created(uri).build();
		return new ResponseEntity<ItDamage>(itDamageCreated, HttpStatus.OK);
	}	 
}
