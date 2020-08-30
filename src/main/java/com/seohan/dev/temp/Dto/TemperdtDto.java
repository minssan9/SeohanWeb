package com.seohan.dev.temp.Dto;

import lombok.Builder;
import lombok.Data;

import java.beans.ConstructorProperties;

@Builder
@Data
public class TemperdtDto {
    private String temper;
    private String humidity;
    private String ipaddress;
}

