
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
@IdClass(ItemBalanceHeader.class)
@Table(name = "ITMBL08_HD", schema = "SMLIB")
public class ItemBalanceHeader implements Serializable {
    @Id
    @Length(max=8)
    private String gdate;
    @Id
    @Length(max=4)
    private String gtime;
;
    private String 	timeflag;
    private String 	type;
    private String 	typeds;
    private String 	fact;
    private String 	warhs;
    private String 	warhs_nm;
    private double qty;
    private double 	mny;
    private String 	ref;
    private String 	fill;
    private String 	bltype;
}