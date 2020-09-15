package com.seohan.erp.general.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "MNGMST", schema = "SITLIB", catalog = "")
public class MngmstEntity {
    @Id @GeneratedValue
    private int id;
    private String company;
    private String docuno;
    private String docutype;
    private String rdate;
    private int ser;
    private String rsabn;
    private String title;
    private String content;
    private String class01;
    private String class02;
    private String class03;
    private String class04;
    private String class05;
    private String stat;
    private String ref01;

    @OneToMany
    private List<MngsubEntity> mngsubEntity;
}
