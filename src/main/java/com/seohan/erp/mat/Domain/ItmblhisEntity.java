package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ITMBLHIS", schema = "SMLIB", catalog = "")
public class ItmblhisEntity {
    private String gdate;
    private String gtime;
    private String warhs;
    private String itmno;
    private int qty;
    private int trim;
    private BigDecimal mny;

    @Basic
    @Column(name = "GDATE", nullable = false, length = 8)
    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
    }

    @Basic
    @Column(name = "GTIME", nullable = false, length = 4)
    public String getGtime() {
        return gtime;
    }

    public void setGtime(String gtime) {
        this.gtime = gtime;
    }

    @Basic
    @Column(name = "WARHS", nullable = false, length = 5)
    public String getWarhs() {
        return warhs;
    }

    public void setWarhs(String warhs) {
        this.warhs = warhs;
    }

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "QTY", nullable = false, precision = 0)
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "TRIM", nullable = false, precision = 0)
    public int getTrim() {
        return trim;
    }

    public void setTrim(int trim) {
        this.trim = trim;
    }

    @Basic
    @Column(name = "MNY", nullable = false, precision = 2)
    public BigDecimal getMny() {
        return mny;
    }

    public void setMny(BigDecimal mny) {
        this.mny = mny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmblhisEntity that = (ItmblhisEntity) o;
        return qty == that.qty &&
                trim == that.trim &&
                Objects.equals(gdate, that.gdate) &&
                Objects.equals(gtime, that.gtime) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(mny, that.mny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gdate, gtime, warhs, itmno, qty, trim, mny);
    }
}
