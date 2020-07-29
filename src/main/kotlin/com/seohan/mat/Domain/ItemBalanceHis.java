
package com.seohan.mat.Domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(ItemBalanceHis.class)
@Table(name = "ITMBL0800", schema = "SMLIB")
public class ItemBalanceHis implements Serializable {
    @Id
    @Length(max=8)
    private String gdate;
    @Id
    @Length(max=4)
    private String gtime;
    private String  warhs;
    private String  itmno;
    private long    qty;
    private long    trim;
    private long    mny;
}