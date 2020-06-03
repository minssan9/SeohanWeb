package com.seohan.mes.Domain;

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
    String ITMNO;
    @Id
    String WARHS;
    @Id
    String TRSCD ;
    @Id
    String TRSDT;
    @Id
    String SERNO ;
    String QUNTY;
    String WEIGT ;
    String MONEY;
    String TRGAE ;
    String LOCAT;
    String LOTNO ;
    String CSTCD;
    String REF01 ;
    String REF02;
    String STATS ;
    String FILL;


}
