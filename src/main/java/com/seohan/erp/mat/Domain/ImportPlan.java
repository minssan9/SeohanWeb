
package com.seohan.erp.mat.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(ImportPlan.class)
@Table(name = "ITMBLPF", schema = "SMLIB")
public class ImportPlan implements Serializable {
    @Id
    private String      itmno;
    @Id
    private String      warhs;
    private String      locat;
    private int         onhnd;
    private int         safmx;
    private int         safmn;
    private String      avrgb;
    private int         avrqt;
    private int         leadt;
    private int         purut;
    private int         purtm;
    private String      purgb;
    private String      fill;
}