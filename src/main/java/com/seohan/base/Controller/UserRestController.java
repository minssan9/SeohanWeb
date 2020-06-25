package com.seohan.base.Controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.seohan.base.Domain.Code;
import com.seohan.base.Dto.OrgUserDto;
import com.seohan.base.Mapper.CodeRepository;
import com.seohan.base.Mapper.OrgUserRepository;

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

@RequestMapping("/base/user")
@Slf4j 
@RestController
class UserRestController { 
	
//	@Autowired
//	private OrgUserService orgUserService;
	
	@Autowired
	private OrgUserRepository orgUserRepository;
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
//	@GetMapping("")
//	public @ResponseBody List<Code> getAllList() throws Exception { 
//		return codeRepo.findAll(); 
//	}
//
	@GetMapping("{adgub}")
	public @ResponseBody List<Code> getUserInfo(@RequestBody OrgUserDto orgUserDto ) throws Exception { 
		return orgUserRepository.findByCompanycode(orgUserDto.getCOMPANYCODE());
	} 	
//	
//	@PutMapping("")
//	public ResponseEntity<Code> updateCode(@RequestBody Code itDamage ) throws Exception { 		
//		Code itDamageUpdated = codeRepo.save(itDamage ); 
//		return new ResponseEntity<Code>(itDamageUpdated, HttpStatus.OK);
//	}
//
////	@PostMapping("save")
////	public ResponseEntity<Void> createCode(@RequestBody Code Code )  throws Exception { 		
////		Code CodeCreated= CodeService.save(Code ); 
////		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{rtime}"	).buildAndExpand(CodeCreated.getRtime()).toUri();
////		return   ResponseEntity.created(uri).build();
////	}	  
}
