package com.seohan.erp.general.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "MNGSUB", schema = "SITLIB", catalog = "")
public class MngsubEntity {
    @Id @GeneratedValue
    private int id;
    private String company;
    private String docuno;
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
    private String class01;
    private String class02;
    private String class03;
    private String class04;
    private String class05;
    private String content01;
    private String content02;
    private String content03;
    private String content04;
    private String content05;
    private String content06;
    private String content07;
    private String content08;
    private String content09;
    private String content10;
    private String ref01;
    private String ref02;
    private String ref03;

    @ManyToOne
    @JoinColumn(name = "DOCUNO")
    private MngmstEntity mngmstEntity;

}
