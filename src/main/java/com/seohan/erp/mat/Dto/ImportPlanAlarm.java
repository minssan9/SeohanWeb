
package com.seohan.erp.mat.Dto;

import lombok.Data;
import lombok.Value;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Value
public class ImportPlanAlarm   {
    private String      cstcd	;
    private String      itmno	;
    private String      warhs	;
    private Integer     mqty	;
    private Integer     bsqty	;
    private Integer     tsqty	;
    private Integer     preqty	;
    private Integer     expqty	;
    private String      dscrp	;
    private String      cusna	;

    public ImportPlanAlarm(String cstcd, String itmno, String warhs, Integer mqty, Integer bsqty, Integer tsqty, Integer preqty, Integer expqty, String dscrp, String cusna) {
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

