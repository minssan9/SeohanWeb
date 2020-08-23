package com.seohan.mes.Controller;

import com.seohan.mes.Domain.Trans;
import com.seohan.mes.Mapper.ProdPlanRepository;
import com.seohan.mes.Mapper.TransRepository;
import com.seohan.mes.Service.MesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RequestMapping("/mes")
@Slf4j 
@RestController
class MesController {
	@Autowired
	private MesService mesService;
	@Autowired
	private TransRepository transRepository;
	@Autowired
	private ProdPlanRepository prodPlanRepository;
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 

	@PostMapping("save")
	public ResponseEntity<Trans> createUser(@RequestBody Trans trans)  throws Exception {
//		User userCreated= mesService.save(user );


		return new ResponseEntity<Trans>(trans, HttpStatus.OK);
	}
}
