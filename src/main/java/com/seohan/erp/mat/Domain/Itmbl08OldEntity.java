package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ITMBL08_OLD", schema = "SMLIB", catalog = "")
public class Itmbl08OldEntity {
    private String gdate;
    private String gtime;
    private String warhs;
    private String itmno;
    private String locat;
    private String lotno;
    private String indate;
    private String intime;
    private int qty;
    private BigDecimal price;
    private String sts;

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
    @Column(name = "ITMNO", nullable = false, length = 50)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
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
    @Column(name = "LOTNO", nullable = false, length = 10)
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
    @Column(name = "PRICE", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "STS", nullable = false, length = 2)
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
        Itmbl08OldEntity that = (Itmbl08OldEntity) o;
        return qty == that.qty &&
                Objects.equals(gdate, that.gdate) &&
                Objects.equals(gtime, that.gtime) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(indate, that.indate) &&
                Objects.equals(intime, that.intime) &&
                Objects.equals(price, that.price) &&
                Objects.equals(sts, that.sts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gdate, gtime, warhs, itmno, locat, lotno, indate, intime, qty, price, sts);
    }
}
