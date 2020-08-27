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
    private int ser;
    private String gubnTxt;
    private String warhs;
    private String itmno;
    private String itmNm;
    private String lineCd;
    private String lineNm;
    private String cstCd;
    private String cstNm;
    private String locat;
    private int qty;
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
