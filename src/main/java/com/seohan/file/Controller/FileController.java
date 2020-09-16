package com.seohan.file.Controller;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.seohan.erp.it.Domain.ItDamageFile;
import com.seohan.file.Dto.FileUploadDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seohan.file.Domain.FileUploadResponse;
import com.seohan.file.Service.FileService;

import static com.seohan.config.FileProperties.FILE_FOLDER_ROOT_PATH;

@RequestMapping("/file")
@Slf4j
@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload/{folderPath}")
    public FileUploadResponse uploadFile(@PathVariable String folderPath, @RequestPart MultipartFile file) {        //HttpServletRequest request,
        String fileName = "";
        String fileDownloadUri = "";

        try {
            fileName = fileService.storeFile(folderPath, file);
            fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("file" + "/itdamage/")
                    .path(fileName)
                    .toUriString();
        } catch (Exception e) {

        }
        return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
    }

    @PostMapping("/files")
    public ResponseEntity addFiles(@RequestBody FileUploadDto  fileUploadDto) {
//    public ResponseEntity addFiles(@RequestBody MultipartFile[] uploadFile) {

        List<ItDamageFile> itDamageFileList = new ArrayList<>();
        for (MultipartFile multipartFile : fileUploadDto.getMultipartFiles()) {
            ItDamageFile itDamageFile = new ItDamageFile();

            String uploadFileName = multipartFile.getOriginalFilename();
            itDamageFile.setFileName(uploadFileName);            // 오리지날 이름저장

            UUID uuid = UUID.randomUUID();
            uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1);
            uploadFileName = uuid.toString() + "_" + uploadFileName;

            java.io.File saveFile = new java.io.File(fileUploadDto.getFolderPath(), uploadFileName);

            itDamageFile.setUuid(uuid.toString());                // uuid 저장
            itDamageFile.setUploadPath(fileUploadDto.getFolderPath());             // 경로

            try {
                multipartFile.transferTo(saveFile);
                itDamageFileList.add(itDamageFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new ResponseEntity(itDamageFileList, HttpStatus.OK);
    }

//	    @PostMapping("/uploadFiles")
//	    public List<FileUploadResponse> uploadMultipleFiles(String destPath,
//	    		@RequestParam("files") ArrayList<MultipartFile> files) throws IOException{
//	    	return files
//	                .stream()
//	                .map(file -> uploadFile(file))
//	                .collect(Collectors.toList());
//	    }

    @GetMapping
    public ResponseEntity<Resource> downloadFile(
            @RequestParam String folderPath, @RequestParam String filename, HttpServletRequest request) throws IOException {

        File file = new File(FILE_FOLDER_ROOT_PATH + "/" + folderPath + "/", filename);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        Path path = Paths.get(file.getPath());

//	    	Path path = Paths.get(FILE_FOLDER_ROOT_PATH + "/" + folderPath + "/", filename);
//	        Resource resource = fileService.loadFileAsResource( "/" + folderPath + "/", filename);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, Files.probeContentType(path));
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + path.getFileName().toString() + "\"");

//			String contentType= "application/octet-stream";
//	        try {
//	            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
//	        } catch (IOException ex) {
//	            log.info("Could not determine file type.");
//	        }


        return new ResponseEntity(resource, headers, HttpStatus.OK);

    }

//	    @NoArgsConstructor
//	    @Data
//	    private static class UploadAttachmentResponse {
//	        private String fileName;
//	        private long fileSize;
//	        private String fileContentType;
//	        private String attachmentUrl;
//	    }
}
