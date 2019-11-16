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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seohan.file.Service.FTPService;
import com.seohan.general.Domain.It_Damage;
import com.seohan.general.Service.ItDamageService;

import lombok.extern.slf4j.Slf4j; 


@RequestMapping("/general")
@Slf4j 
@RestController
class ItDamageRestController {  
	@Autowired
	private ItDamageService itDamageService;
	@Autowired
	private FTPService ftpService;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");
	
	
	@RequestMapping("/fileDownload")
	public  Resource fileDownload( It_Damage itDamage) throws Exception { 
		
//		ftpFileWriter.open();
//		if(ftpFileWriter.isConnected()){
//		    ftpFileWriter.loadFile("/SeoHan/ITDAMAGE/" + itDamage.getFileName(),  "C:/temp/" + itDamage.getFileName());
//		    ftpFileWriter.saveFile(inputstream, "/SeoHan/ITDAMAGE/" + itDamage.getFileName(), false);
//		    ftpFileWriter.saveFile(sourcepath, "C:/temp/" + itDamage.getFileName(), true);
////		    ftpFileWriter.loadFile(path, outputstream);
////		    ftpFileWriter.saveFile(inputstream, remotepath, false);
////		    ftpFileWriter.saveFile(sourcepath, destpath, true);
//		}
//		ftpFileWriter.close();
		
		File file = new File("/SeoHan/ITDAMAGE/" + itDamage.getAttach());
		InputStream is = FileUtils.openInputStream(file);
		return new InputStreamResource(is);
	} 
	 
	@GetMapping("/itdamage")
	public @ResponseBody List<It_Damage> iddamage() throws Exception { 
		List<It_Damage> damageList = itDamageService.itDamage(); 
		return damageList;
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
