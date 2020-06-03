package com.seohan.mes.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(ProdPlan.class)
@Table(name="PRDPDPF", schema="SBLIB")
public class ProdPlan implements Serializable {

    @Id
    String  PLDTE;
    @Id
    double SEQNO;
    String WRKCT;
    String WRKJO;
    String ITMNO;
    double PLQTY;
    double RHQTY;
    double REQTY;
    String REMARK;
    String FILL;
    double PRTQTY;
    String WRKSTS;
    String PERCNT;
    String JTIME;
    String JMH;
    double TGUPH;
    double TGUPM;


}
