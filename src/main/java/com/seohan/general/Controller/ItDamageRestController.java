package com.seohan.general.Controller;

import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seohan.file.Service.FTPService;
import com.seohan.general.Domain.It_Damage;
import com.seohan.general.Mapper.It_DamageRepository;
import com.seohan.general.Service.ItDamageService;

import lombok.extern.slf4j.Slf4j; 


@RequestMapping("/general")
@Slf4j 
@RestController
class ItDamageRestController { 
	
	@Autowired
	private ItDamageService itDamageService;
	@Autowired
	private It_DamageRepository it_DamageRepo;
	
	@Autowired
	private FTPService ftpService;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	
	@GetMapping("/itdamage/file")
	public  Resource fileDownload(@RequestParam("attach") String attach) throws Exception { 
		
		ftpService.open();
//		if(ftpService.isConnected()){
		    ftpService.downloadFile("/SeoHan/ITDAMAGE/" + attach,  "C:/temp/" + attach);
//		    ftpService.saveFile(inputStream, "/SeoHan/ITDAMAGE/" + fileName, false);
//		    ftpService.saveFile(sourcepath, "C:/temp/" + fileName, true);
//		    ftpFileWriter.loadFile(path, outputstream);
//		    ftpFileWriter.saveFile(inputstream, remotepath, false);
//		    ftpFileWriter.saveFile(sourcepath, destpath, true);
//		}
		ftpService.close();
		
		File file = new File("C:/temp/" + attach);
		InputStream is = FileUtils.openInputStream(file);
		return new InputStreamResource(is);
	} 
	 
	@GetMapping("/itdamage")
	public @ResponseBody List<It_Damage> iddamage() throws Exception { 
		return it_DamageRepo.it_DamageListbyStat("01");
	}

	@PutMapping("/itdamage/save")
	public void putItDamage(@RequestBody It_Damage itDamage ) throws Exception { 		
		itDamageService.saveItDamage(itDamage ); 		
	}

	@PostMapping("/itdamage/post")
	public void postItDamage(@RequestBody It_Damage itDamage )  throws Exception { 		
		itDamageService.saveItDamage(itDamage); 		
	}	

	@GetMapping("/ftptest")
	public void ftptest()  throws Exception { 		
		ftpService.open();
		ftpService.close(); 
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
