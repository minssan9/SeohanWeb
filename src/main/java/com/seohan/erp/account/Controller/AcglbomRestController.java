package com.seohan.erp.account.Controller;

import com.seohan.erp.account.Mapper.AcglbomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account/acglbom")
@Slf4j
@RestController
class AcglbomRestController {
 	@Autowired
	private AcglbomRepository acglbomRepository;

	 @GetMapping("search" )
	 public ResponseEntity searchItems(Pageable pageable, @RequestParam String itmno, @RequestParam String pumgb) {
		 return new ResponseEntity(acglbomRepository.findByItmnoContainsOrPumgbContains(itmno, pumgb, pageable), HttpStatus.OK);
	 }

	@GetMapping("/{id}")
	public ResponseEntity getItem(@PathVariable("id") Long id ) throws Exception {
		return new ResponseEntity(acglbomRepository.findById(id), HttpStatus.OK);
	}


}

 