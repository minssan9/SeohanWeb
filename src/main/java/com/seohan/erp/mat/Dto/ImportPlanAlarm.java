
package com.seohan.erp.mat.Dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ImportPlanAlarm   {
    private String      cstcd	;
    private String      itmno	;
    private String      warhs	;
    private BigDecimal   mqty	;
    private BigDecimal         bsqty	;
    private BigDecimal         tsqty	;
    private BigDecimal         preqty	;
    private BigDecimal         expqty	;
    private String      dscrp	;
    private String      cusna	;

    public ImportPlanAlarm(String cstcd, String itmno, String warhs, BigDecimal mqty, BigDecimal bsqty, BigDecimal tsqty, BigDecimal preqty, BigDecimal expqty, String dscrp, String cusna) {
        this.cstcd = cstcd;
        this.itmno = itmno;
        this.warhs = warhs;
        this.mqty  = mqty;
        this.bsqty = bsqty;
        this.tsqty = tsqty;
        this.preqty = preqty;
        this.expqty = expqty;
        this.dscrp = dscrp;
        this.cusna = cusna;
    }
}

