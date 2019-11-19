package com.seohan.general.Controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seohan.file.Service.FTPService;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.TemperatureData;
import com.seohan.general.Mapper.FoodTableRepository;
import com.seohan.general.Mapper.TemperatureRepository;

import lombok.extern.slf4j.Slf4j; 


@RequestMapping("/general")
@Slf4j 
@RestController
class ETCRestController {  
//	@Autowired
//	private FoodTableService foodTableService;

	@Autowired
	private FoodTableRepository foodTableRepo;
	@Autowired
	private TemperatureRepository temperatureRepo;
	
	@Autowired
	private FTPService ftpService;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");
	 
	@GetMapping( "/food")
	public @ResponseBody List<FoodTable> FoodList(FoodTable foodTable) throws Exception {		
		return foodTableRepo.foodTableListbyGdate(foodTable.getGdate());  
	}   

	@GetMapping( "/temperature")
	public @ResponseBody List<TemperatureData> TemperatureList(TemperatureData temperatureData) throws Exception {		
		return temperatureRepo.TemperatureDataList(temperatureData.getCO_GB(), temperatureData.getCO_GB());
				
	}   
//     private String tempPath = "C:/"; 
	
    // @RequestMapping(value = "/upload", method = RequestMethod.POST)
    // public List<MultipartFile> upload(MultipartFile[] files) {
	// 	return null;
  
    //     // PROCESS... 
//	// }
//	
//	 @GetMapping("/file")
//	 public Resource download(@PathVariable String fileName) throws IOException {
//		 
//	 	File file = new File(tempPath + fileName);
//	 	InputStream is = FileUtils.openInputStream(file);
//	 	ftpService.open();
//	 	return new InputStreamResource(is);
//	 }
}
