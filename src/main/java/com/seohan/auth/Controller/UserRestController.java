package com.seohan.auth.Controller;

import com.seohan.erp.base.Domain.AccessHis;
import com.seohan.erp.base.Domain.Code;
import com.seohan.auth.Dto.OrgUserDto;
import com.seohan.erp.base.Mapper.AccessHisRepository;
import com.seohan.auth.Mapper.OrgUserRepository;
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
	@Autowired
	private AccessHisRepository accessHisRepository;

	@Autowired
	private OrgUserRepository orgUserRepository;
 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 

	@GetMapping("{adgub}")
	public @ResponseBody List<Code> getUserInfo(@RequestBody OrgUserDto orgUserDto ) throws Exception { 
		return orgUserRepository.findByCompanycode(orgUserDto.getCompanycode());
	}

	@PostMapping("/ip")
	public ResponseEntity saveAccessHis(@RequestBody AccessHis accessHis ) throws Exception {
		accessHis.setExectime( new Date());
		return new ResponseEntity(accessHisRepository.save(accessHis), HttpStatus.OK);
	}
}
