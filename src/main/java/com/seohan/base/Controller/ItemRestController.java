package com.seohan.base.Controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.seohan.base.Domain.ItemView;
import com.seohan.base.Mapper.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/base/item")
@Slf4j
@RestController
class ItemRestController {

	// @Autowired
	// private LineService lineService;

	@Autowired
	private ItemRepository itemRepository;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");

	// @GetMapping("/getAll/{pNo}/{size}")
	// public @ResponseBody List<ItemView> getAllList(@PathVariable Integer pNo, 

	// @PathVariable Integer size,) throws Exception {
	// 	Page<ItemView> getAllEmp(Pageable page);
	// 	return itemRepository.findByActgb("A");
	// }

	// @GetMapping("/{pumgb}")
	// public @ResponseBody List<ItemView> getListByPumgb(@PathVariable String pumgb) throws Exception {
	// 	return itemRepository.findByPumgb(pumgb);
	// }

	@GetMapping("{itmno}")
	public @ResponseBody ItemView getOneItem(@PathVariable String itmno) throws Exception {
		return itemRepository.findByItmno(itmno);
	}

	// @PutMapping("save")
	// public ResponseEntity<Item> updateItem(@PathVariable String udate,
	// @PathVariable String ser, @RequestBody Item report ) throws Exception {
	// Item reportUpdated = ItemService.save(report );
	// return new ResponseEntity<Item>(reportUpdated, HttpStatus.OK);
	// }

	// @PostMapping("")
	// public ResponseEntity<Void> createItem(@RequestBody Item report ) throws
	// Exception {
	// Item reportCreated= ItemService.save(report );
	// URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{udate}"
	// ).buildAndExpand(reportCreated.getUdate()).toUri();
	// return ResponseEntity.created(uri).build();
	// }
}

 