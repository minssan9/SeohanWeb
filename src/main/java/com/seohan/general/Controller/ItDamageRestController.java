package com.seohan.general.Controller;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seohan.Config.FileProperties;
import com.seohan.file.Service.FTPService;
import com.seohan.general.Domain.It_Damage;
import com.seohan.general.Mapper.It_DamageRepository;
import com.seohan.general.Service.ItDamageService;

import lombok.extern.slf4j.Slf4j; 


@CrossOrigin(origins= {"http://localhost:8091", "http://localhost:8090"})
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

	 
	@GetMapping("/itdamage")
	public @ResponseBody List<It_Damage> getAllItDamage() throws Exception { 
		return it_DamageRepo.it_DamageListbyStat("01");
	}

	@GetMapping("/itdamage/{rdate}")
	public @ResponseBody List<It_Damage> getItDamage(@PathVariable String rdate) throws Exception { 
		return it_DamageRepo.it_DamageListbyRdate(rdate);
	}

	@PutMapping("/itdamage/{rdate}")
	public ResponseEntity<It_Damage> updateItDamage(@RequestBody It_Damage itDamage ) throws Exception { 		
		It_Damage itDamageUpdated = itDamageService.save(itDamage); 
		return new ResponseEntity<It_Damage>(itDamage, HttpStatus.OK);
	}

	@PostMapping("/itdamage")
	public ResponseEntity<Void> createItDamage(@RequestBody It_Damage itDamage )  throws Exception { 		
		It_Damage itDamageCreated =  itDamageService.save(itDamage); 		

	    URI uri = ServletUriComponentsBuilder
	    		.fromCurrentRequest()
	    		.path("/{rdate}")
	    		.buildAndExpand(itDamageCreated.getRtime())
	        .toUri();

	    return ResponseEntity.created(uri).build();
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
