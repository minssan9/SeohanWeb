package com.seohan.erp.base.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ITM_HIS", schema = "SMLIB", catalog = "")
public class ItmHisEntity {
    private String itmno;
    private String hdate;
    private int ser;
    private String gubn;
    private String action;
    private String yymm;
    private String sabun;
    private String fill;

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 20)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "HDATE", nullable = false, length = 8)
    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    @Basic
    @Column(name = "SER", nullable = false, precision = 0)
    public int getSer() {
        return ser;
    }

    public void setSer(int ser) {
        this.ser = ser;
    }

    @Basic
    @Column(name = "GUBN", nullable = false, length = 30)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Basic
    @Column(name = "ACTION", nullable = false, length = 1000)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "YYMM", nullable = false, length = 14)
    public String getYymm() {
        return yymm;
    }

    public void setYymm(String yymm) {
        this.yymm = yymm;
    }

    @Basic
    @Column(name = "SABUN", nullable = false, length = 7)
    public String getSabun() {
        return sabun;
    }

    public void setSabun(String sabun) {
        this.sabun = sabun;
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
        ItmHisEntity that = (ItmHisEntity) o;
        return ser == that.ser &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(hdate, that.hdate) &&
                Objects.equals(gubn, that.gubn) &&
                Objects.equals(action, that.action) &&
                Objects.equals(yymm, that.yymm) &&
                Objects.equals(sabun, that.sabun) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, hdate, ser, gubn, action, yymm, sabun, fill);
    }
}
