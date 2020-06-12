package com.seohan.fta.Domain;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class PoHeaderId implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private String cogb;

    @EqualsAndHashCode.Include
    @Id
    private String pono;
}