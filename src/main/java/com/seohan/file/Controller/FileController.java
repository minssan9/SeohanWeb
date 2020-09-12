//package com.seohan.file.Controller;
//
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.Resource;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestPart;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.seohan.file.Domain.FileUploadResponse;
//import com.seohan.file.Service.FileService;
//
//@RequestMapping("/file")
//@RestController
//public class FileController {
//    private static final Logger logger = LoggerFactory.getLogger(FileController.class);
//	 @Autowired
//	    private FileService service;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");
//
//	    @PostMapping("/upload/{folderPath}")
//	    public FileUploadResponse uploadFile  (@PathVariable String folderPath, @RequestPart MultipartFile file)
//	    {		//HttpServletRequest request,
//	    	String fileName="";
//	    	String fileDownloadUri ="";
//
//	    	try {
//		    	fileName = service.storeFile(folderPath, file);
//		        fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//		                                .path("file"+"/itdamage/")
//		                                .path(fileName)
//		                                .toUriString();
//	    	} catch(Exception e) {
//
//	    	}
//            return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
//	    }
//
////	    @PostMapping("/uploadFiles")
////	    public List<FileUploadResponse> uploadMultipleFiles(String destPath,
////	    		@RequestParam("files") ArrayList<MultipartFile> files) throws IOException{
////	    	return files
////	                .stream()
////	                .map(file -> uploadFile(file))
////	                .collect(Collectors.toList());
////	    }
//
//	    @GetMapping("/{folderPath}/{fileName:.+}")
//	    public ResponseEntity<Resource> downloadFile(
//	    		@PathVariable String folderPath, @PathVariable String fileName, HttpServletRequest request){
//	    	 // Load file as Resource
//	        Resource resource = service.loadFileAsResource( "/" + folderPath + "/", fileName);
//
//	        // Try to determine file's content type
//	        String contentType = null;
//	        try {
//	            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
//	        } catch (IOException ex) {
//	            logger.info("Could not determine file type.");
//	        }
//
//	        // Fallback to the default content type if type could not be determined
//	        if(contentType == null) {
//	            contentType = "application/octet-stream";
//	        }
//
//	        return ResponseEntity.ok()
//	                .contentType(MediaType.parseMediaType(contentType))
//	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
//	                .body(resource);
//	    }
//
////	    @NoArgsConstructor
////	    @Data
////	    private static class UploadAttachmentResponse {
////	        private String fileName;
////	        private long fileSize;
////	        private String fileContentType;
////	        private String attachmentUrl;
////	    }
//}
