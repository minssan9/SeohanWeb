package com.seohan.dev.temp.Domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "TEMPERHD", schema = "GMLIB", catalog = "")
public class TemperhdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coGb;
    private String warhs;
    private String line;
    private String ipAddress;
    private BigDecimal tCycle;
    private BigDecimal temperMin;
    private BigDecimal temperMax;
    private BigDecimal humidMin;
    private BigDecimal humidMax;
    private String state;
    private String bigo;
    private String crtDate;
}
