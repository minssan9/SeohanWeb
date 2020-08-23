package com.seohan.erp.prod.Dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ProdPlanDto   {
    private String prodDate;
    private String prodLine;
    private String prodItemNo;

}

