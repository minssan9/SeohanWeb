package com.seohan.general.Controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    // @Value("${temp.path}") private String tempPath; 
	
    // @RequestMapping(value = "/upload", method = RequestMethod.POST)
    // public List<MultipartFile> upload(MultipartFile[] files) {
	// 	return null;
  
    //     // PROCESS... 
	// }
	
	// @GetMapping("/{id}")
	// public Resource download(@PathVariable String id) throws IOException {
	// 	File file = new File(tempPath + id);
	// 	InputStream is = FileUtils.openInputStream(file);
	// 	return new InputStreamResource(is);
	// }
}
