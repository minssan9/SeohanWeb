
package com.seohan.mat.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(ItemBalance.class)
@Table(name = "ITMBLPF", schema = "SMLIB")
public class ItemBalance implements Serializable {
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