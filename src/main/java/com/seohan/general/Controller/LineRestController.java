package com.seohan.general.Controller;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seohan.general.Domain.Line;
import com.seohan.general.Mapper.LineRepository;

import lombok.extern.slf4j.Slf4j; 

@RequestMapping("/general/line")
@Slf4j 
@RestController
class LineRestController { 
	
//	@Autowired
//	private LineService lineService;
	@Autowired
	private LineRepository lineRepository; 
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	 
	@GetMapping("")
	public @ResponseBody List<Line> getAllList(@RequestParam String stat) throws Exception {  
		return lineRepository.findByActgb(stat);
	}

	@GetMapping("{udate}")
	public @ResponseBody Line getOneLine(@PathVariable String wrkct) throws Exception { 
		return lineRepository.findByWrkct(wrkct);
	}
	
//	@PutMapping("save")
//	public ResponseEntity<Line> updateLine(@PathVariable String udate, @PathVariable String ser, @RequestBody Line report ) throws Exception { 		
//		Line reportUpdated = lineService.save(report );
//		return new ResponseEntity<Line>(reportUpdated, HttpStatus.OK);
//	}

//	@PostMapping("")
//	public ResponseEntity<Void> createLine(@RequestBody Line report )  throws Exception { 		
//		Line reportCreated= lineService.save(report );
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{udate}"	).buildAndExpand(reportCreated.getUdate()).toUri();
//		return   ResponseEntity.created(uri).build();
//	}

}
