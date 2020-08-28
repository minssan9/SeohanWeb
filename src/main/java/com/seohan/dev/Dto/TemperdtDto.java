package com.seohan.dev.Dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TemperdtDto {
    private String temper;
    private String humidity;
    private String ipaddress;

}

