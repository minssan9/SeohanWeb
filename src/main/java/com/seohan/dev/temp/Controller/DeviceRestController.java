package com.seohan.dev.temp.Controller;

import com.seohan.auth.Dto.OrgUserDto;
import com.seohan.auth.Repository.OrgUserRepository;
import com.seohan.erp.base.Domain.Code;
import com.seohan.erp.base.Domain.ExecuteHis;
import com.seohan.erp.base.Mapper.AccessHisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("/base/user")
@Slf4j
@RestController
class DeviceRestController {
	@Autowired
	private AccessHisRepository accessHisRepository;

	@PostMapping("/ip")
	public ResponseEntity saveAccessHis(@RequestBody ExecuteHis executeHis) throws Exception {
		executeHis.setExectime( new Date());
		return new ResponseEntity(accessHisRepository.save(executeHis), HttpStatus.OK);
	}
}
