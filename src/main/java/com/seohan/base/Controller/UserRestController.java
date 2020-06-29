package com.seohan.base.Controller;

import com.seohan.base.Domain.AccessHis;
import com.seohan.base.Domain.Code;
import com.seohan.base.Dto.OrgUserDto;
import com.seohan.base.Mapper.AccessHisRepository;
import com.seohan.base.Mapper.OrgUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/base/user")
@Slf4j 
@RestController
class UserRestController { 
	
//	@Autowired
//	private OrgUserService orgUserService;

	@Autowired
	private AccessHisRepository accessHisRepository;

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
		return orgUserRepository.findByCompanycode(orgUserDto.getCompanycode());
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

	@PostMapping("/ip")
	public ResponseEntity saveAccessHis(@RequestBody AccessHis accessHis ) throws Exception {
		accessHis.setExectime( new Date());
		return new ResponseEntity(accessHisRepository.save(accessHis), HttpStatus.OK);
	}
}
