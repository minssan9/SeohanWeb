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

    @Column(name = "CO_GB")
    private String coGb;
    private String warhs;
    private String line;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;
    @Column(name = "T_CYCLE")
    private BigDecimal tCycle;
    @Column(name = "TEMPER_MIN")
    private BigDecimal temperMin;
    @Column(name = "TEMPER_MAX")
    private BigDecimal temperMax;
    @Column(name = "HUMID_MIN")
    private BigDecimal humidMin;
    @Column(name = "HUMID_MAX")
    private BigDecimal humidMax;
    private String state;
    private String bigo;
    @Column(name = "CRT_DATE")
    private String crtDate;
}
