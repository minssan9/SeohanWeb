package com.seohan.dev.temp.Controller;

import com.seohan.dev.Dto.TemperdtDto;
import com.seohan.dev.temp.Domain.TemperdtEntity;
import com.seohan.dev.temp.Mapper.TemperdtRepository;
import com.seohan.dev.temp.Service.TemperdtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dev/temp")
@Slf4j 
@RestController
class TemperDtController {
	@Autowired
	private TemperdtService temperdtService;

	@Autowired
	private TemperdtRepository temperdtRepository;
    
	@PostMapping()
	public ResponseEntity<TemperdtEntity> createTemperdtEntity(@RequestBody TemperdtDto temperdtDto)  throws Exception {
		return new ResponseEntity<TemperdtEntity>(temperdtService.save(temperdtDto), HttpStatus.OK);
	}	 
}
