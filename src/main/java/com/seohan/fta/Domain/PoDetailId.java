package com.seohan.fta.Domain;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class PoDetailId implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @Column(name="CO_GB")
    private String cogb;

    @EqualsAndHashCode.Include
    @Id
    @Column(name="PO_NO")
    private String pono;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue
    @Column(name="PO_SEQ")
    private double poseq;
}