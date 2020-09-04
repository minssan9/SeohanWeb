package com.seohan.erp.mat.Domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ITMBLPFSUB_VW", schema = "SMLIB", catalog = "")
public class ItmblpfsubView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String itmno;
    private String warhs;
    private String locat;
    private String lotno;
    private String indate;
    private String intime;
    private int qty;
    private int jqty;
    private String sts;
    private String dscrp;
    private String spcds;

}
