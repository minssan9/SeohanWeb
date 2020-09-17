
package com.seohan.erp.mat.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class QueryDto {
    private String gubn ;
    private String      warhs	;
    private String      itmno	;
    private String      dscrp	;
    private String      cstcd	;
    private String      cusna	;
}

