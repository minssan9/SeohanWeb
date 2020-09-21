package com.seohan.erp.prod.Domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Data
@IdClass(PrdpdpfEntity.class)
@Table(name = "PRDPDPF", schema = "SBLIB", catalog = "")
public class PrdpdpfEntity  implements Serializable {
    @Id
    private String pldte;
    @Id
    private String wrkct;
    @Id
    private String wrkjo;
    @Id
    private int seqno;
    private String itmno;
    private int plqty;
    private int rhqty;
    private int reqty;
    private String remark;
    private String fill;
    private int prtqty;
    private String wrksts;
    private BigDecimal percnt;
    private int jtime;
    private BigDecimal jmh;
    private BigDecimal tguph;
    private BigDecimal tgupm;

}
