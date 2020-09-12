package com.seohan.erp.mat.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Builder
@Table(name = "ITMBLPFSUB", schema = "SMLIB")
@NoArgsConstructor
@AllArgsConstructor
public class ItmblpfsubEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itmno;
    private String warhs;
    private String locat;
    private String lotno;
    private String indate;
    private String intime;
    private int qty;
    private int jqty;
    private String sts;
}
