package com.seohan.erp.base.Controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.seohan.erp.base.Domain.Code;
import com.seohan.erp.base.Mapper.CodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/base/code")
@Slf4j
@RestController
class CodeRestController {
	@Autowired
	private CodeRepository codeRepo;

	@GetMapping
	public @ResponseBody List<Code> getAllList() throws Exception {
		return codeRepo.findAll();
	}

	@GetMapping("{adgub}")
	public @ResponseBody List<Code> getCodeByAdgub(@PathVariable String adgub) throws Exception {
		return codeRepo.findByAdgub(adgub);
	}

	@PutMapping
	public ResponseEntity<Code> updateCode(@RequestBody Code code ) throws Exception {
		Code codeUpdated = codeRepo.save(code);
		return new ResponseEntity<Code>(codeUpdated, HttpStatus.OK);
	}

	@GetMapping("/fact")
	public @ResponseBody List<Code> getFact() throws Exception {
		return codeRepo.findFact();
	}
}
