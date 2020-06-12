package com.seohan.fta.Domain.com.seohan.fta.Controller;

import com.seohan.fta.Domain.PoHeader;

import com.seohan.fta.Domain.com.seohan.fta.Mapper.PoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/fta")
@Slf4j
@RestController
class FTARestController {
	@Autowired
	private PoRepository PoRepo;

//	@Autowired
//	private PoDetailRepository PoDetailRepo;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");

	@GetMapping("/Po")
	public @ResponseBody
	List<PoHeader> PoHeader(@RequestParam(value = "company") String company, @RequestParam(value = "poNo") String poNo) throws Exception {
		List<PoHeader> retList = PoRepo.findByCogbAndPono(company, poNo);
		return retList;
	}
}
