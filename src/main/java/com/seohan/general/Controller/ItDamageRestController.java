package com.seohan.general.Controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seohan.file.Service.FTPService;
import com.seohan.general.Domain.ItDamage;
import com.seohan.general.Mapper.ItDamageRepository;
import com.seohan.general.Service.ItDamageService;

import lombok.extern.slf4j.Slf4j; 

@RequestMapping("/general/itdamage")
@Slf4j 
@RestController
class ItDamageRestController { 
	
	@Autowired
	private ItDamageService itDamageService;
	@Autowired
	private ItDamageRepository itDamageRepo;
	
	@Autowired
	private FTPService ftpService;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("")
	public @ResponseBody List<ItDamage> getAllList() throws Exception { 
		return itDamageRepo.findItDamageByStat("01"); 
	}

	@GetMapping("{rtime}")
	public @ResponseBody ItDamage getOneItDamage(@PathVariable String rtime) throws Exception { 
		return itDamageRepo.findItDamageByRtime("SEOHAN", rtime);
	}
	@PutMapping("")
	public ResponseEntity<ItDamage> updateItDamage(@PathVariable String rtime, @RequestBody ItDamage itDamage ) throws Exception { 		
		ItDamage itDamageUpdated = itDamageService.save(itDamage );
		
		return new ResponseEntity<ItDamage>(itDamageUpdated, HttpStatus.OK);
	}

	@PostMapping("save")
	public ResponseEntity<Void> createItDamage(@RequestBody ItDamage itDamage )  throws Exception { 		
		ItDamage itDamageCreated= itDamageService.save(itDamage );
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{rtime}"	).buildAndExpand(itDamageCreated.getRtime()).toUri();
		return   ResponseEntity.created(uri).build();
	}	 
}
