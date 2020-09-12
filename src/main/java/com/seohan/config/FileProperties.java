package com.seohan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class FileProperties {
	@Value("${file.upload-dir}")
    public static String FILE_FOLDER_ROOT_PATH;

    @Value("${file.upload-dir}")
    public void fileUploadDir (String uploadDir){
        FILE_FOLDER_ROOT_PATH = uploadDir;
    }
}
