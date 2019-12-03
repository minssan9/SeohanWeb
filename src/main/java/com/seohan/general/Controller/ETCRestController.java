package com.seohan.general.Controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");
	 
	@GetMapping( "/food")
	public @ResponseBody List<FoodTable> FoodList(@RequestParam String gdate) throws Exception {		
		FoodTable foodTable= new FoodTable();
		foodTable.setGdate(gdate);
		return foodTableRepo.findByGdate(foodTable.getGdate());  
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
