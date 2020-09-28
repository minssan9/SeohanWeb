package com.seohan.dev.access.Controller;

import com.seohan.dev.access.Domain.AccessHistory;
import com.seohan.dev.access.Repository.AccessHistoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequestMapping("/base/user")
@Slf4j
@RestController
class AccessHistoryRestController {
	@Autowired
	private AccessHistoryRepository accessHistoryRepository;

	@PostMapping("/ip")
	public ResponseEntity saveAccessHis(@RequestBody AccessHistory accessHistory) throws Exception {
		accessHistory.setExectime( LocalDateTime.now());
		return new ResponseEntity(accessHistoryRepository.save(accessHistory), HttpStatus.OK);
	}
}
