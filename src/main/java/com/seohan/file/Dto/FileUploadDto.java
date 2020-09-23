package com.seohan.file.Dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class FileUploadDto {
    private String folderPath;
    private MultipartFile[] multipartFiles;
}
