package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "RUTMSPF", schema = "SBLIB", catalog = "")
public class RutmspfEntity {
    private String wrkct;
    private String rut;
    private String ruth;
    private String mch;
    private String mce;
    private String jsno;
    private String mcgb;
    private BigDecimal san;
    private String stats;
    private String fill;

    @Basic
    @Column(name = "WRKCT", nullable = false, length = 4)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "RUT", nullable = false, length = 4)
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Basic
    @Column(name = "RUTH", nullable = false, length = 30)
    public String getRuth() {
        return ruth;
    }

    public void setRuth(String ruth) {
        this.ruth = ruth;
    }

    @Basic
    @Column(name = "MCH", nullable = false, length = 30)
    public String getMch() {
        return mch;
    }

    public void setMch(String mch) {
        this.mch = mch;
    }

    @Basic
    @Column(name = "MCE", nullable = false, length = 30)
    public String getMce() {
        return mce;
    }

    public void setMce(String mce) {
        this.mce = mce;
    }

    @Basic
    @Column(name = "JSNO", nullable = false, length = 35)
    public String getJsno() {
        return jsno;
    }

    public void setJsno(String jsno) {
        this.jsno = jsno;
    }

    @Basic
    @Column(name = "MCGB", nullable = false, length = 1)
    public String getMcgb() {
        return mcgb;
    }

    public void setMcgb(String mcgb) {
        this.mcgb = mcgb;
    }

    @Basic
    @Column(name = "SAN", nullable = false, precision = 2)
    public BigDecimal getSan() {
        return san;
    }

    public void setSan(BigDecimal san) {
        this.san = san;
    }

    @Basic
    @Column(name = "STATS", nullable = false, length = 1)
    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Basic
    @Column(name = "FILL", nullable = true, length = 20)
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
        RutmspfEntity that = (RutmspfEntity) o;
        return Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(rut, that.rut) &&
                Objects.equals(ruth, that.ruth) &&
                Objects.equals(mch, that.mch) &&
                Objects.equals(mce, that.mce) &&
                Objects.equals(jsno, that.jsno) &&
                Objects.equals(mcgb, that.mcgb) &&
                Objects.equals(san, that.san) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrkct, rut, ruth, mch, mce, jsno, mcgb, san, stats, fill);
    }
}
