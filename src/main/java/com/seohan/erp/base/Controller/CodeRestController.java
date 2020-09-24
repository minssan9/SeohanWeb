package com.seohan.erp.base.Controller;

import java.util.List;

import com.seohan.erp.base.Domain.Code;
import com.seohan.erp.base.Repository.CodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

import javax.xml.ws.Response;

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
	public ResponseEntity getCodeByAdgub(Pageable pageable, @PathVariable String adgub) throws Exception {
		switch (adgub){
			case "31":
				return new ResponseEntity(codeRepo.findFact(), HttpStatus.OK);
			default:
				return new ResponseEntity(codeRepo.findByAdgub(adgub, pageable), HttpStatus.OK);
		}
	}

	@PutMapping
	public ResponseEntity updateCode(@RequestBody Code code ) throws Exception {
		Code codeUpdated = codeRepo.save(code );
		return new ResponseEntity (codeUpdated, HttpStatus.OK);
	}

//	@PostMapping("save")
//	public ResponseEntity<Void> createCode(@RequestBody Code Code )  throws Exception {
//		Code CodeCreated= CodeService.save(Code );
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{rtime}"	).buildAndExpand(CodeCreated.getRtime()).toUri();
//		return   ResponseEntity.created(uri).build();
//	}

	@GetMapping("/fact")
	public ResponseEntity getFact() throws Exception {
		return new ResponseEntity(codeRepo.findFact(), HttpStatus.OK);
	}
}
