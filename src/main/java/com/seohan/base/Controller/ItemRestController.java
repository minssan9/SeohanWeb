package com.seohan.base.Controller;
 
import com.seohan.base.Mapper.BomAssyRepository;
import com.seohan.base.Mapper.BomRepository;
import com.seohan.base.Mapper.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/base")
@Slf4j
@RestController
class ItemRestController {
 	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private BomRepository bomRepository;

	@Autowired
	private BomAssyRepository bomAssyRepository;

	 @GetMapping("/item")
	 public ResponseEntity getItems(Pageable pageable) {
		 return new ResponseEntity(itemRepository.findAll(pageable), HttpStatus.OK);
	 }

	@GetMapping(path= {"/item/{pumgb}"})
	 public ResponseEntity getItemsByPumgb(@PathVariable String pumgb, Pageable pageable) throws Exception {
		return new ResponseEntity(itemRepository.findByPumgb(pumgb, pageable), HttpStatus.OK);
	 }

	@GetMapping("/item/{itmno}")
	public ResponseEntity getItem(@PathVariable String itmno) throws Exception {
		return new ResponseEntity(itemRepository.findByItmno(itmno), HttpStatus.OK);		
	}

	@GetMapping("/bom")
	public ResponseEntity getBoms( Pageable pageable) throws Exception {
		return new ResponseEntity(bomRepository.findAll(pageable), HttpStatus.OK);
	}

	@GetMapping("/bom/assy")
	public ResponseEntity getBomAssys( Pageable pageable) throws Exception {
		return new ResponseEntity(bomAssyRepository.findAll(pageable), HttpStatus.OK);
	}

}

 