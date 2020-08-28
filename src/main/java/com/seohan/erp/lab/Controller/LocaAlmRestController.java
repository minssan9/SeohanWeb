package com.seohan.erp.lab.Controller;

import com.seohan.erp.lab.Domain.LocaAlmEntity;
import com.seohan.erp.lab.Mapper.LocaAlmEntityRepository;
import com.seohan.erp.lab.Service.LocaAlmEntityService;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Service.ImportPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/erp/lab/locaalm")
@Slf4j 
@RestController
class LocaAlmRestController {
	@Autowired
	private LocaAlmEntityService locaAlmEntityService;
	@Autowired
	private LocaAlmEntityRepository locaAlmEntityRepository;

	@GetMapping
	public ResponseEntity<List<LocaAlmEntity>> getLocaAlmList() {
		return new ResponseEntity<List<LocaAlmEntity>>(locaAlmEntityRepository.findLocaAlmEntityByGubnAndSts("A2","1"), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<List<LocaAlmEntity>> endLocaAlmEntity(@RequestBody List<LocaAlmEntity> locaAlmEntitys) {
		return new ResponseEntity<List<LocaAlmEntity>>(locaAlmEntityService.endLocaAlmEntity(locaAlmEntitys), HttpStatus.OK);
	}
}
