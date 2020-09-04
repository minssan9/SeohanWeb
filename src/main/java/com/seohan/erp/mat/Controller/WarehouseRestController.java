package com.seohan.erp.mat.Controller;

import com.seohan.erp.mat.Domain.ItmblpfsubEntity;
import com.seohan.erp.mat.Dto.ItmblpfsubDto;
import com.seohan.erp.mat.Repository.ItmblpfsubRepository;
import com.seohan.erp.mat.Repository.ItmblpfsubViewRepository;
import com.seohan.erp.mat.Service.ItmblpfsubService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mat/warehouse")
@Slf4j 
@RestController
class WarehouseRestController {
	@Autowired
	private ItmblpfsubViewRepository itmblpfsubViewRepository;
	@Autowired
	private ItmblpfsubRepository itmblpfsubRepository;

	@Autowired
	private ItmblpfsubService itmblpfsubService;

	@GetMapping("params")
	public ResponseEntity getWarehouseItemList(Pageable pageable, @RequestParam String warhs, @RequestParam String itmno ) {
		return new ResponseEntity(
				itmblpfsubViewRepository.findByWarhsAndItmnoContainsOrderByItmnoAscLocatAsc(warhs, itmno, pageable ), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity moveLocation(@RequestBody ItmblpfsubDto itmblpfsubDto ) throws Exception {
		ItmblpfsubEntity itmblpfsubEntity = itmblpfsubService.moveLocation(itmblpfsubDto);
		return new ResponseEntity(itmblpfsubEntity, HttpStatus.OK);
	}


//	@PostMapping
////	public

}
