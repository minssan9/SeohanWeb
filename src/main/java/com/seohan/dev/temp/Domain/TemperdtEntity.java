package com.seohan.dev.temp.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TEMPERDT", schema = "GMLIB", catalog = "")
public class TemperdtEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String co_gb;
    private String warhs;
    private String line;
    private String dtime;
    private String temper;
    private String humidity;

}
