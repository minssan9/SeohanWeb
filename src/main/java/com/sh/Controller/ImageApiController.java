package com.sh.Controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/api/image")
public class ImageApiController {
  
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public List<MultipartFile> upload(MultipartFile[] files) {
		return null;
  
        // PROCESS...
  
    }
	
    @Value("${temp.path}") private String tempPath; 
	
	@GetMapping("/{id}")
	public Resource download(@PathVariable String id) throws IOException {
		File file = new File(tempPath + id);
		InputStream is = FileUtils.openInputStream(file);
		return new InputStreamResource(is);
	}
}
