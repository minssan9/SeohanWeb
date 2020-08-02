
package com.seohan.mat.Dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
public class ImportPlanAlarm   {
    private String      cstcd	;
    private String      itmno	;
    private String      warhs	;
    private Integer         mqty	;
    private Integer         bsqty	;
    private Integer         tsqty	;
    private Integer         preqty	;
    private Integer         expqty	;
    private String      dscrp	;
    private String      cusna	;

    public ImportPlanAlarm(String cstcd, String itmno, String warhs, Integer mqty, Integer bsqty, Integer tsqty, Integer preqty, Integer expqty, String dscrp, String cusna) {
        this.cstcd = cstcd;
        this.itmno = itmno;
        this.warhs = warhs;
        this.mqty = mqty;
        this.bsqty = bsqty;
        this.tsqty = tsqty;
        this.preqty = preqty;
        this.expqty = expqty;
        this.dscrp = dscrp;
        this.cusna = cusna;
    }
}
