package com.seohan.erp.lab.Controller;

import com.seohan.erp.lab.Domain.LocaAlmEntity;
import com.seohan.erp.lab.Mapper.LocaAlmEntityRepository;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Service.ImportPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/erp/lab/locaalm")
@Slf4j 
@RestController
class LocaAlmRestController {
	@Autowired
	private LocaAlmEntityRepository locaAlmEntityRepository;

	@GetMapping
	public ResponseEntity<List<LocaAlmEntity>> getLocaAlmList() {
		return new ResponseEntity<List<LocaAlmEntity>>(locaAlmEntityRepository.findLocaAlmEntityByGubnAndSts("A2","1"), HttpStatus.OK);
	}
}
