package com.seohan.erp.base.Controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.seohan.erp.base.Domain.LineView;
import com.seohan.erp.base.Mapper.LineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j; 

@RequestMapping("/base/line")
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
	public @ResponseBody List<LineView> getAllList(@RequestParam String actgb) throws Exception {  
		return lineRepository.findByActgb(actgb);
	}

	@GetMapping("/fact/{factory}")
	public @ResponseBody List<LineView> getListByFactory(@PathVariable String factory) throws Exception {  
		return lineRepository.findByFact (factory);
	}
	
	@GetMapping("{wrkct}")
	public @ResponseBody LineView getOneLine(@PathVariable String wrkct) throws Exception { 
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
