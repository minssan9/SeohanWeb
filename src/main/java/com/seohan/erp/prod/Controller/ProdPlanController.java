package com.seohan.erp.prod.Controller;

import com.seohan.erp.prod.Domain.PrdpdpfEntity;
import com.seohan.erp.prod.Dto.ProdPlanDto;
import com.seohan.erp.prod.Service.ProdPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/prd/plan")
@Slf4j 
@RestController
class ProdPlanController {

	@Autowired
	private ProdPlanService prodPlanService;

	@GetMapping
	public ResponseEntity<List<PrdpdpfEntity>> getPlanList(@RequestBody ProdPlanDto prodPlanDto){
		return new ResponseEntity<> (prodPlanService.getPlanList(prodPlanDto), HttpStatus.OK);
	}
}
