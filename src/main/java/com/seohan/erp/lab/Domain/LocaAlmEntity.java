package com.seohan.erp.lab.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "LOCA_ALM", schema = "SMLIB", catalog = "")
public class LocaAlmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String gubn;
    private String jdate;
    private int    ser;
    private String gubn_txt;
    private String warhs;
    private String itmno;
    private String itm_nm;
    private String line_cd;
    private String line_nm;
    private String cst_cd;
    private String cst_nm;
    private String locat;
    private int    qty;
    private String lotno;
    private String bigo01;
    private String bigo02;
    private String bigo03;
    private String jsabn;
    private String jname;
    private String jymdhms;
    private String csabn;
    private String cname;
    private String cymdhms;
    private String sts;

}
