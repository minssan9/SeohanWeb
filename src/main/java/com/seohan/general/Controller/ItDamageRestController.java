package com.seohan.general.Controller;

import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seohan.Config.FileProperties;
import com.seohan.file.Domain.FileDownloadException;
import com.seohan.file.Service.FTPService;
import com.seohan.general.Domain.It_Damage;
import com.seohan.general.Mapper.It_DamageRepository;
import com.seohan.general.Service.ItDamageService;

import lombok.extern.slf4j.Slf4j; 


@RequestMapping("/general")
@Slf4j 
@RestController
public class ItDamageRestController { 
	
	@Autowired
	private ItDamageService itDamageService;
	@Autowired
	private It_DamageRepository it_DamageRepo;
	
	@Autowired
	private FTPService ftpService; 
 
	@Autowired
	private FileProperties fileproperties;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd"); 
	
	@GetMapping(value="/itdamage/file", produces="text/plain;charset=UTF-8")
	public  Resource fileDownload(@RequestParam("attach") String attach, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
		    Path fileLocation = null;
		    File theDirs = new File("C:\\SeoHan\\ITDAMAGE");
		    theDirs.mkdirs();
		    
		    boolean success = ftpService.downloadFile("/SeoHan/ITDAMAGE/" + attach,  "C:/SeoHan/ITDAMAGE/" + attach);		    
//		    File file = new File("C:/SeoHan/ITDAMAGE/" + attach);
		    
		    fileLocation = Paths.get(fileproperties.getUploadDir())
		            .toAbsolutePath().normalize();   
		    
			Path filePath = fileLocation.resolve(attach).normalize();
			Resource resource = new UrlResource(filePath.toUri());

			if (resource.exists()) {
				return resource;
			} else {
				throw new FileDownloadException(attach + " 파일을 찾을 수 없습니다.");
			}
		} catch (MalformedURLException e) {
			throw new FileDownloadException(attach + " 파일을 찾을 수 없습니다.", e);
		} 
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
