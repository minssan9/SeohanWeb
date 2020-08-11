package com.seohan.erp.mat.Domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ITMBLPFHIS", schema = "SMLIB", catalog = "")
@IdClass(ItmblpfhisEntityPK.class)
public class ItmblpfhisEntity {
    private String gubn;
    private String cstcd;
    private String chjgb;
    private String alccd;
    private String itmno;
    private String warhs;
    private String locat;
    private String indate;
    private String intime;
    private int qty;
    private String reason;
    private String fill;
    private String sts;

    @Id
    @Column(name = "GUBN", nullable = false, length = 5)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Basic
    @Column(name = "CSTCD", nullable = false, length = 5)
    public String getCstcd() {
        return cstcd;
    }

    public void setCstcd(String cstcd) {
        this.cstcd = cstcd;
    }

    @Basic
    @Column(name = "CHJGB", nullable = false, length = 20)
    public String getChjgb() {
        return chjgb;
    }

    public void setChjgb(String chjgb) {
        this.chjgb = chjgb;
    }

    @Basic
    @Column(name = "ALCCD", nullable = false, length = 10)
    public String getAlccd() {
        return alccd;
    }

    public void setAlccd(String alccd) {
        this.alccd = alccd;
    }

    @Id
    @Column(name = "ITMNO", nullable = false, length = 15)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Id
    @Column(name = "WARHS", nullable = false, length = 5)
    public String getWarhs() {
        return warhs;
    }

    public void setWarhs(String warhs) {
        this.warhs = warhs;
    }

    @Id
    @Column(name = "LOCAT", nullable = false, length = 4)
    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
    }

    @Id
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
    @Column(name = "REASON", nullable = false, length = 50)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 50)
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Basic
    @Column(name = "STS", nullable = false, length = 1)
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
        ItmblpfhisEntity that = (ItmblpfhisEntity) o;
        return qty == that.qty &&
                Objects.equals(gubn, that.gubn) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(alccd, that.alccd) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(indate, that.indate) &&
                Objects.equals(intime, that.intime) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(sts, that.sts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, cstcd, chjgb, alccd, itmno, warhs, locat, indate, intime, qty, reason, fill, sts);
    }
}
