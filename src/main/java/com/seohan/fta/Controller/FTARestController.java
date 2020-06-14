package com.seohan.fta.Controller;

import com.seohan.fta.Domain.PoHeader;

import com.seohan.fta.Mapper.PoRepository;
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

	@GetMapping("/po")
	public @ResponseBody
	List<PoHeader> PoHeader(@RequestParam String company, @RequestParam String pono) throws Exception {

		return PoRepo.findByCogbAndPono(company, pono);
	}

	@GetMapping("/po/ymd")
	public @ResponseBody
	List<PoHeader> getPoByYmd(@RequestParam String company, @RequestParam String poymd) throws Exception {
		return PoRepo.findByCogbAndPoYmd(company, poymd);
	}
}
