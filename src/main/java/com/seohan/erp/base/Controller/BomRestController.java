package com.seohan.erp.base.Controller;

import com.seohan.erp.base.Mapper.BomAssyRepository;
import com.seohan.erp.base.Mapper.BomRepository;
import com.seohan.erp.base.Mapper.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/base/bom")
@Slf4j
@RestController
class BomRestController {
// 	@Autowired
//	private ItemRepository itemRepository;

	@Autowired
	private BomRepository bomRepository;

	@Autowired
	private BomAssyRepository bomAssyRepository;

//	 @GetMapping("search" )
//	 public ResponseEntity searchItems(Pageable pageable, @RequestParam String itmno, @RequestParam String pumgb) {
//		 pumgb= "";
//		 return new ResponseEntity(itemRepository.findByItmnoContains(itmno, pageable), HttpStatus.OK);
//	 }

//	@GetMapping(path= {"/search"})
//	 public ResponseEntity getItemsByPumgb(@PathVariable String pumgb, Pageable pageable) throws Exception {
//		return new ResponseEntity(itemRepository.findByPumgb(pumgb, pageable), HttpStatus.OK);
//	 }

//	@GetMapping("/{itmno}")
//	public ResponseEntity getItem(@PathVariable("itmno") String itmno) throws Exception {
//		return new ResponseEntity(itemRepository.findByItmno(itmno), HttpStatus.OK);
//	}

	@GetMapping
	public ResponseEntity getBoms( Pageable pageable) throws Exception {
		return new ResponseEntity(bomRepository.findAll(pageable), HttpStatus.OK);
	}

	@GetMapping("/assy")
	public ResponseEntity getBomAssys( Pageable pageable) throws Exception {
		return new ResponseEntity(bomAssyRepository.findAll(pageable), HttpStatus.OK);
	}
}

 