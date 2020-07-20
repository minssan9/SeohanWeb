
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
    private int         mqty	;
    private int         bsqty	;
    private int         tsqty	;
    private int         preqty	;
    private int         expqty	;
    private String      dscrp	;
    private String      cusna	;
}