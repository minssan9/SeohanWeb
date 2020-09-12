package com.seohan.file.Service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileService {

//	FileService(FileProperties fileproperties);

	String storeFile(String destPath, MultipartFile file);

	Resource loadFileAsResource(String path, String fileName);
}
