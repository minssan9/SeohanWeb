package com.seohan.fta.Controller;

import com.seohan.fta.Domain.PoHeader;

import com.seohan.fta.Mapper.PoHeaderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/fta")
@Slf4j
@RestController
class FTARestController {
	@Autowired
	private PoHeaderRepository PoRepo;

//	@Autowired
//	private PoDetailRepository PoDetailRepo;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");

	@GetMapping("/po")
	public ResponseEntity po(@RequestParam String company, @RequestParam String pono) throws Exception {
		return new ResponseEntity( PoRepo.findByCogbAndPono(company, pono), HttpStatus.OK);
	}

	@GetMapping("/po/ymd")
	public ResponseEntity getPoByYmd(@RequestParam String company, @RequestParam String poymd, Pageable pageable) throws Exception {
		return new ResponseEntity(PoRepo.findByCogbAndPoYmd(company, poymd), HttpStatus.OK);
	}
}
