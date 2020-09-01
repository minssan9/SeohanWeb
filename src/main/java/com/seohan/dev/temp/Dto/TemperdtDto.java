package com.seohan.dev.temp.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.ConstructorProperties;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemperdtDto {
    private String temper;
    private String humidity;
    private String ipaddress;
}

