package com.seohan.erp.mat.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(Trans.class)
@Table(name="TRANSPF", schema="SMLIB")
public class Trans implements Serializable {

    @Id
    String itmno;
    @Id
    String warhs;
    @Id
    String trscd ;
    @Id
    String trsdt;
    @Id
    String serno ;
    String qunty;
    String weigt ;
    String money;
    String trgae ;
    String locat;
    String lotno ;
    String cstcd;
    String ref01 ;
    String ref02;
    String stats ;
    String fill;


}
