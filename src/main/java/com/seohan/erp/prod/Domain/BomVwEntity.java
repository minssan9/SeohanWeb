package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

@Table(name = "BOM_VW", schema = "SBLIB", catalog = "")
public class BomVwEntity {
    private String pitem;
    private String pitmds;
    private String pspcds;
    private BigInteger citem;
    private BigDecimal citmds;
    private String cspcds;
    private String stdate;
    private String asyno;
    private String asyqt;
    private String stats;
    private String fill;

    @Basic
    @Column(name = "PITEM", nullable = false, length = 15)
    public String getPitem() {
        return pitem;
    }

    public void setPitem(String pitem) {
        this.pitem = pitem;
    }

    @Basic
    @Column(name = "PITMDS", nullable = false, length = 15)
    public String getPitmds() {
        return pitmds;
    }

    public void setPitmds(String pitmds) {
        this.pitmds = pitmds;
    }

    @Basic
    @Column(name = "PSPCDS", nullable = false, length = 8)
    public String getPspcds() {
        return pspcds;
    }

    public void setPspcds(String pspcds) {
        this.pspcds = pspcds;
    }

    @Basic
    @Column(name = "CITEM", nullable = false, precision = 0)
    public BigInteger getCitem() {
        return citem;
    }

    public void setCitem(BigInteger citem) {
        this.citem = citem;
    }

    @Basic
    @Column(name = "CITMDS", nullable = false, precision = 7)
    public BigDecimal getCitmds() {
        return citmds;
    }

    public void setCitmds(BigDecimal citmds) {
        this.citmds = citmds;
    }

    @Basic
    @Column(name = "CSPCDS", nullable = false, length = 1)
    public String getCspcds() {
        return cspcds;
    }

    public void setCspcds(String cspcds) {
        this.cspcds = cspcds;
    }

    @Basic
    @Column(name = "STDATE", nullable = true, length = 50)
    public String getStdate() {
        return stdate;
    }

    public void setStdate(String stdate) {
        this.stdate = stdate;
    }

    @Basic
    @Column(name = "ASYNO", nullable = false, length = 50)
    public String getAsyno() {
        return asyno;
    }

    public void setAsyno(String asyno) {
        this.asyno = asyno;
    }

    @Basic
    @Column(name = "ASYQT", nullable = false, length = 100)
    public String getAsyqt() {
        return asyqt;
    }

    public void setAsyqt(String asyqt) {
        this.asyqt = asyqt;
    }

    @Basic
    @Column(name = "STATS", nullable = false, length = 50)
    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 100)
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
        BomVwEntity that = (BomVwEntity) o;
        return Objects.equals(pitem, that.pitem) &&
                Objects.equals(pitmds, that.pitmds) &&
                Objects.equals(pspcds, that.pspcds) &&
                Objects.equals(citem, that.citem) &&
                Objects.equals(citmds, that.citmds) &&
                Objects.equals(cspcds, that.cspcds) &&
                Objects.equals(stdate, that.stdate) &&
                Objects.equals(asyno, that.asyno) &&
                Objects.equals(asyqt, that.asyqt) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pitem, pitmds, pspcds, citem, citmds, cspcds, stdate, asyno, asyqt, stats, fill);
    }
}
