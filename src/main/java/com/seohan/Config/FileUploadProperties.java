package com.seohan.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FileUploadProperties {
	@Value("${file.upload-dir}")
    private String uploadDir;
}
