package com.seohan.erp.mat.Dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItmblpfsubDto {
    private Long id;
    private String itmno;
    private String warhs;
    private String locat;
    private String lotno;
    private String indate;
    private String intime;
    private int qty;
    private int jqty;
    private String sts;

    private String changedLocat;
    private int changedQty;
}
