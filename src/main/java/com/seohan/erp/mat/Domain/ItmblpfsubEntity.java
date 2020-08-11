package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ITMBLPFSUB", schema = "SMLIB", catalog = "")
public class ItmblpfsubEntity {
    private String itmno;
    private String warhs;
    private String locat;
    private String lotno;
    private String indate;
    private String intime;
    private int qty;
    private int jqty;
    private String sts;

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
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
    @Column(name = "LOCAT", nullable = false, length = 4)
    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
    }

    @Basic
    @Column(name = "LOTNO", nullable = false, length = 12)
    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno;
    }

    @Basic
    @Column(name = "INDATE", nullable = false, length = 8)
    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    @Basic
    @Column(name = "INTIME", nullable = false, length = 4)
    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
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
    @Column(name = "JQTY", nullable = false, precision = 0)
    public int getJqty() {
        return jqty;
    }

    public void setJqty(int jqty) {
        this.jqty = jqty;
    }

    @Basic
    @Column(name = "STS", nullable = false, length = 10)
    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmblpfsubEntity that = (ItmblpfsubEntity) o;
        return qty == that.qty &&
                jqty == that.jqty &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(indate, that.indate) &&
                Objects.equals(intime, that.intime) &&
                Objects.equals(sts, that.sts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, warhs, locat, lotno, indate, intime, qty, jqty, sts);
    }
}
