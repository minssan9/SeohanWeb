package com.seohan.erp.it.Domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@JsonSerialize(using = ItDamageFileSerializer.class)
public class ItDamageFile {

    @Id
    @GeneratedValue
    private Long id;
    private String fileName;
    private String uploadPath;
    private String uuid;

    @ManyToOne
    private ItDamage itDamage;
}
