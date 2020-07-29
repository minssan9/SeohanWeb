package com.seohan.machine.Controller;

import com.seohan.machine.Domain.SettingHis;
import com.seohan.machine.Mapper.SettingHisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/machine/settinghis")
@Slf4j 
@RestController
class SettingHisController {
//	@Autowired
//	private ItDamageService itDamageService;
	@Autowired
	private SettingHisRepository settingHisRepo;
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("")
	public @ResponseBody List<SettingHis> getAllList(@RequestParam String stat) throws Exception {
		return settingHisRepo.findSettingHisByStat(stat);
	}

	@GetMapping("{id}")
	public @ResponseBody SettingHis getOneSettingHis(@PathVariable long id) throws Exception {
		return settingHisRepo.findSettingHisById(id);
	}

	@GetMapping("{testemp}")
	public ResponseEntity<List<SettingHis>> findSettingHisByTestemp(@PathVariable String testemp) throws Exception {
		return new ResponseEntity<List<SettingHis>>(settingHisRepo.findSettingHisByTestemp(testemp),HttpStatus.OK);
	}

	@GetMapping("{confirmemp}")
	public ResponseEntity<List<SettingHis>> findSettingHisByConfirmemp(@PathVariable String confirmemp) throws Exception {
		return new ResponseEntity<List<SettingHis>> (settingHisRepo.findSettingHisByTestemp(confirmemp), HttpStatus.OK);
	}

	@PutMapping("update")
	public ResponseEntity<SettingHis> updateSettingHis(@RequestBody SettingHis settingHis ) throws Exception {
		return new ResponseEntity<SettingHis>( settingHisRepo.save(settingHis), HttpStatus.OK);
	}

	@PostMapping("save")
	public ResponseEntity<SettingHis> createSettingHis(@RequestBody SettingHis settingHis)  throws Exception {
		SettingHis settingHisCreated =  settingHisRepo.save(settingHis );
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+settingHisCreated.getId()	).buildAndExpand(settingHisCreated.getId()).toUri();
//		return   ResponseEntity.created(uri).build();
		return new ResponseEntity<SettingHis>(settingHisRepo.save(settingHis ), HttpStatus.OK);
	}	 
}
