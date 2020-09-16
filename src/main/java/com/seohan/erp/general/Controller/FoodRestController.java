package com.seohan.erp.general.Controller;

import java.util.List;

import com.seohan.erp.general.Domain.MngFood;
import com.seohan.erp.general.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/general/food")
@Slf4j
@RestController
class FoodRestController {
	@Autowired
	private FoodRepository foodRepo;

	@GetMapping
	public @ResponseBody List<MngFood> FoodTable(@RequestParam String gdate, @RequestParam String companycode) {
		List<MngFood> foods = foodRepo.findByCompanycodeAndGdate(companycode, gdate);

//		switch (companycode) {
//			case "KAMTEC":
//				List<FoodTableKamtec> foodTableKamtecs = foodTableKamtecRepo.findByGdate(gdate);
//				for (FoodTableKamtec foodTableKamtec : foodTableKamtecs) {
//					foods.add(foodTableKamtec);
//				}
//				break;
//			case "SEOHAN":
//				List<FoodTable>  foodTables = foodTableRepo.findByGdate(gdate);
//				for (FoodTable foodTable : foodTables) {
//					foods.add(foodTable);
//				}
//				break;
//			case "LAB":
//				List<FoodTableLab> foodTableLabs = foodTableLabRepo.findByGdate(gdate);
//				for (FoodTableLab foodTableLab : foodTableLabs) {
//					foods.add(foodTableLab);
//				}
//				break;
//		}

		return foods;
	}

//	@GetMapping("/foodTableKamtec")
//	public @ResponseBody List<FoodTableKamtec> FoodTableKamtec(@RequestParam String gdate) throws Exception {
//		List<Food> foods = foodTableKamtecRepo.findByGdate(gdate);
//
//		return foodTableKamtecRepo.findByGdate(gdate);
//	}
//
//	@GetMapping("/foodTableLab")
//	public @ResponseBody List<FoodTableLab> FoodTableLab(@RequestParam String gdate) throws Exception {
//		FoodTable foodTable = new FoodTable();
//		foodTable.setGdate(gdate);
//		return foodTableLabRepo.findByGdate(foodTable.getGdate());
//	}

}
