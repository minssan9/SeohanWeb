package com.seohan.base.Controller;

import com.seohan.base.Domain.ItemView;
import com.seohan.base.Mapper.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;

@RequestMapping("/base/items")
@Slf4j
@RestController
class ItemRestController {
 	@Autowired
	private ItemRepository itemRepository;

	 @GetMapping
	 public ResponseEntity getItems(Pageable pageable) {
		 return new ResponseEntity(itemRepository.findAll(pageable), HttpStatus.OK);
	 }

	// @GetMapping("/{pumgb}")
	// public @ResponseBody List<ItemView> getListByPumgb(@PathVariable String pumgb) throws Exception {
	// 	return itemRepository.findByPumgb(pumgb);

	// }
	@GetMapping(path= {"/{actgb}", "/{pageNo}"})
	 public ResponseEntity getListByPumgb(@PathVariable String pumgb, Pageable pageable) throws Exception {
		return new ResponseEntity(itemRepository.findByPumgb(pumgb, pageable), HttpStatus.OK);
	 }

	@GetMapping("{itmno}")
	public @ResponseBody ItemView getOneItem(@PathVariable String itmno) throws Exception {
		return itemRepository.findByItmno(itmno);
	}


}

 