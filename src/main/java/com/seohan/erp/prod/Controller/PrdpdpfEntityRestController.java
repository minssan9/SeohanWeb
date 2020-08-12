package com.seohan.erp.prod.Controller;

import com.seohan.erp.prod.Service.PrdpdpfEntityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/prd/plan")
@Slf4j 
@RestController
class PrdpdpfEntityRestController {
	@Autowired
	private PrdpdpfEntityService prdpdpfEntityService;
}
