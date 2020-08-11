package com.seohan.erp.base.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "BOM_JORIP", schema = "SMLIB", catalog = "")
public class BomJoripEntity {
    private String line;
    private String itmno;
    private String citem;
    private String level;
    private String bdate;
    private BigDecimal qty;
    private String bunit;

    @Basic
    @Column(name = "LINE", nullable = false, length = 4)
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 25)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "CITEM", nullable = false, length = 25)
    public String getCitem() {
        return citem;
    }

    public void setCitem(String citem) {
        this.citem = citem;
    }

    @Basic
    @Column(name = "LEVEL", nullable = false, length = 2)
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "BDATE", nullable = false, length = 14)
    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    @Basic
    @Column(name = "QTY", nullable = false, precision = 7)
    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "BUNIT", nullable = false, length = 2)
    public String getBunit() {
        return bunit;
    }

    public void setBunit(String bunit) {
        this.bunit = bunit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BomJoripEntity that = (BomJoripEntity) o;
        return Objects.equals(line, that.line) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(citem, that.citem) &&
                Objects.equals(level, that.level) &&
                Objects.equals(bdate, that.bdate) &&
                Objects.equals(qty, that.qty) &&
                Objects.equals(bunit, that.bunit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, itmno, citem, level, bdate, qty, bunit);
    }
}
