package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "PRDPTPF", schema = "SBLIB", catalog = "")
public class PrdptpfEntity {
    private String pldte;
    private String wrkct;
    private String wrkjo;
    private BigDecimal jinw;
    private int jtim;
    private int jmh;
    private BigDecimal omh;
    private BigDecimal ouph;
    private String fill;

    @Basic
    @Column(name = "PLDTE", nullable = false, length = 8)
    public String getPldte() {
        return pldte;
    }

    public void setPldte(String pldte) {
        this.pldte = pldte;
    }

    @Basic
    @Column(name = "WRKCT", nullable = false, length = 4)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "WRKJO", nullable = false, length = 1)
    public String getWrkjo() {
        return wrkjo;
    }

    public void setWrkjo(String wrkjo) {
        this.wrkjo = wrkjo;
    }

    @Basic
    @Column(name = "JINW", nullable = false, precision = 2)
    public BigDecimal getJinw() {
        return jinw;
    }

    public void setJinw(BigDecimal jinw) {
        this.jinw = jinw;
    }

    @Basic
    @Column(name = "JTIM", nullable = false, precision = 0)
    public int getJtim() {
        return jtim;
    }

    public void setJtim(int jtim) {
        this.jtim = jtim;
    }

    @Basic
    @Column(name = "JMH", nullable = false, precision = 0)
    public int getJmh() {
        return jmh;
    }

    public void setJmh(int jmh) {
        this.jmh = jmh;
    }

    @Basic
    @Column(name = "OMH", nullable = false, precision = 1)
    public BigDecimal getOmh() {
        return omh;
    }

    public void setOmh(BigDecimal omh) {
        this.omh = omh;
    }

    @Basic
    @Column(name = "OUPH", nullable = false, precision = 2)
    public BigDecimal getOuph() {
        return ouph;
    }

    public void setOuph(BigDecimal ouph) {
        this.ouph = ouph;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 20)
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrdptpfEntity that = (PrdptpfEntity) o;
        return jtim == that.jtim &&
                jmh == that.jmh &&
                Objects.equals(pldte, that.pldte) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(wrkjo, that.wrkjo) &&
                Objects.equals(jinw, that.jinw) &&
                Objects.equals(omh, that.omh) &&
                Objects.equals(ouph, that.ouph) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pldte, wrkct, wrkjo, jinw, jtim, jmh, omh, ouph, fill);
    }
}
