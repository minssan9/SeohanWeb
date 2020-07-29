
package com.seohan.machine.Domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "SETTINGHIS", schema = "SGLIB")
public class SettingHis  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date createdat    ;
    private String wrkct;
    private String rut;
    private String itmno    ;
    private String class01    ;
    private String class02    ;
    private String class03    ;
    private String reason01    ;
    private String reason02    ;
    private String reason03    ;
    private double prespec    ;
    private double aftspec    ;
    private String testcase    ;
    private Date testdt    ;
    private String testdate    ;
    private double testdata    ;
    private String testresult    ;
    private String testemp    ;
    private Date confirmdt    ;
    private String confirmdate    ;
    private String confirmemp    ;
    private String remark01    ;
    private String remark02    ;
    private String stat    ;

}