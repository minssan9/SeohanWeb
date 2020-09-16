package com.seohan.erp.general.Domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Table(name = "MNG_INWORKSUB", schema = "SMLIB", catalog = "")
public class MngInworksubEntity {
    @Id @GeneratedValue
    @Column(name = "INWORKSUB_ID")
    private long id;

    private String company;
    private String docutype;
    private int docusubno;
    private String fact;
    private String wrkct;
    private String cstcd;
    private String startdt;
    private String starttm;
    private String execdt;
    private String exectm;
    private String enddt;
    private String endtm;
    private String jobtitle;
    private String jobtype;
    private String mainjob;
    private double expectedmny;
    private double execmny;
    private String modreason;
    private String execmnystr1;
    private String execmnystr2;
    private String execmnystr3;
    private String exptmnystr1;
    private String exptmnystr2;
    private String exptmnystr3;
    private String ref01;
    private String ref02;
    private String ref03;

    @ManyToOne
    @JoinColumn(name = "DOCUNO", updatable = false, insertable = false)
    private MngInworkmstEntity mngInworkmstEntity;
}
