
package com.seohan.erp.mat.Domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(ItemBalanceHisOld.class)
@Table(name = "ITMBL08_OLD", schema = "SMLIB")
public class ItemBalanceHisOld implements Serializable {
    @Id
    @Length(max=8)
    private String gdate;
    @Id
    @Length(max=4)
    private String gtime;
    private String warhs;
    private String itmno;
    private String locat;
    private String lotno;
    private String indate;
    private String intime;
    private double qty;
    private double price;
    private String sts;
    private String bltype;

}