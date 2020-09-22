package com.seohan.erp.general.Domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "MNG_INWORKMST", schema = "SMLIB", catalog = "")
public class MngInworkmstEntity {
    @Id @GeneratedValue
    @Column(name = "INWORKMST_ID")
    private Long id;
    private String company;

    @Column(name = "DOCUNO")
    private String docuno;
    private String docutype;
    private String rdate;
    private int ser;
    private String rsabn;
    private String title;
    private String content;
    private String stat;
    private String ref01;


    @OneToMany(mappedBy = "mngInworkmstEntity", cascade = CascadeType.ALL)
    private List<MngInworksubEntity> mngInworksubEntities = new ArrayList<>();
}
