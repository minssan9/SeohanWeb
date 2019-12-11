package com.seohan.file.Service;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.seohan.Config.FileProperties;
import com.seohan.file.Domain.FileDownloadException;
import com.seohan.file.Domain.FileUploadException;

@Service
public class FileService { 
	private final Path fileLocation;

	@Autowired
	public FileService(FileProperties fileproperties) {
	    this.fileLocation = Paths.get(fileproperties.getUploadDir())
	            .toAbsolutePath().normalize(); 
	    try {
	        Files.createDirectories(this.fileLocation);
	    }catch(Exception e) {
	        throw new FileUploadException("파일을 업로드할 디렉토리를 생성하지 못했습니다.", e);
	    }
	}

	public String storeFile(String destPath, MultipartFile file) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// 파일명에 부적합 문자가 있는지 확인한다.
			if (fileName.contains(".."))
				throw new FileUploadException("파일명에 부적합 문자가 포함되어 있습니다. " + fileName);
			destPath = destPath; 
			Path targetLocation = this.fileLocation.resolve(fileName);

			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

			return fileName;
		} catch (Exception e) {
			throw new FileUploadException("[" + fileName + "] 파일 업로드에 실패하였습니다. 다시 시도하십시오.", e);
		}
	}

	public Resource loadFileAsResource(String path, String fileName) {
		try {
			Path filePath = this.fileLocation.resolve(path + fileName).normalize();
			Resource resource = new UrlResource(filePath.toUri());

			if (resource.exists()) {
				return resource;
			} else {
				throw new FileDownloadException(fileName + " File not found.");
			}
		} catch (MalformedURLException e) {
			throw new FileDownloadException(fileName + " File not found.", e);
		}
	}
}
