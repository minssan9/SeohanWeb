package com.seohan.erp.mat.Controller;

import com.seohan.erp.mat.Domain.ItmblpfsubEntity;
import com.seohan.erp.mat.Dto.ImportPlanAlarm;
import com.seohan.erp.mat.Dto.QueryDto;
import com.seohan.erp.mat.Repository.ItmblpfsubRepository;
import com.seohan.erp.mat.Service.ImportPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/mat/warehouse")
@Slf4j 
@RestController
class WarehouseRestController {
	@Autowired
	private ItmblpfsubRepository itmblpfsubRepository;

//	@Autowired
//	private ItmblpfsubService itmblpfsubEntityService;

	@GetMapping("params")
	public ResponseEntity<List<ItmblpfsubEntity>> getWarehouseItemList(@RequestParam String warhs, @RequestParam String itmno) {
		return new ResponseEntity<List<ItmblpfsubEntity>>(
				itmblpfsubRepository.findByWarhsAndItmnoContains(warhs, itmno ), HttpStatus.OK);
	}
}
