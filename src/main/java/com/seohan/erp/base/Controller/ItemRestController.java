package com.seohan.erp.base.Controller;
 
import com.seohan.erp.base.Mapper.BomAssyRepository;
import com.seohan.erp.base.Mapper.BomRepository;
import com.seohan.erp.base.Mapper.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/base/item")
@Slf4j
@RestController
class ItemRestController {
 	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private BomRepository bomRepository;

	@Autowired
	private BomAssyRepository bomAssyRepository;

	 @GetMapping("params" )
	 public ResponseEntity searchItems(Pageable pageable, @RequestParam String itmno, @RequestParam String itemtype) {
//		 return new ResponseEntity(itemRepository.findByItmnoContains(itmno,  pageable), HttpStatus.OK);
		 return new ResponseEntity(itemRepository.findByItmnoContainsAndPumgbContains(itmno, itemtype, pageable), HttpStatus.OK);
	 }

//	@GetMapping(path= {"/search"})
//	 public ResponseEntity getItemsByPumgb(@PathVariable String pumgb, Pageable pageable) throws Exception {
//		return new ResponseEntity(itemRepository.findByPumgb(pumgb, pageable), HttpStatus.OK);
//	 }

	@GetMapping("/{itmno}")
	public ResponseEntity getItem(@PathVariable("itmno") String itmno) throws Exception {
		return new ResponseEntity(itemRepository.findByItmno(itmno), HttpStatus.OK);
	}


}

 