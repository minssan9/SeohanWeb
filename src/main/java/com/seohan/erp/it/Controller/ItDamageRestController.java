package com.seohan.erp.it.Controller;

import com.seohan.erp.it.Domain.ItDamage;
import com.seohan.erp.it.Domain.ItDamageFile;
import com.seohan.erp.it.Repository.ItDamageRepository;
import com.seohan.erp.it.Service.ItDamageService;
import com.seohan.file.Service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.seohan.config.FileProperties.FILE_FOLDER_ROOT_PATH;


@RequestMapping("/general/itdamage")
@Slf4j
@RestController
class ItDamageRestController {
	String uploadFolder =
			FILE_FOLDER_ROOT_PATH + "\\" + this.getClass().getAnnotation(RequestMapping.class).value()[0].replace("/", "\\") + "\\";

	@Autowired
	private ItDamageService itDamageService;
	@Autowired
	private ItDamageRepository itDamageRepo;
	@Autowired
	private FileService fileService;

	@GetMapping("/params")
	public ResponseEntity getAllList(@RequestParam String stat) throws Exception {
		return new ResponseEntity(itDamageRepo.findItDamageByStat(stat), HttpStatus.OK);
	}

	@GetMapping("{rtime}")
	public  ResponseEntity getOneItDamage(@PathVariable String rtime) throws Exception {
		return new ResponseEntity(itDamageRepo.findItDamageByRtime("SEOHAN", rtime), HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity updateItDamage(@RequestBody ItDamage itDamage ) throws Exception {
		return new ResponseEntity(itDamageService.update(itDamage), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity createItDamage(@RequestBody ItDamage itDamage)  throws Exception {
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+itDamageCreated.getRtime()	).buildAndExpand(itDamageCreated.getRtime()).toUri();
		return new ResponseEntity(itDamageService.save(itDamage ), HttpStatus.OK);
	}

}
