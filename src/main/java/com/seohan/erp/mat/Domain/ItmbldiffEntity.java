package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ITMBLDIFF", schema = "SMLIB", catalog = "")
public class ItmbldiffEntity {
    private String gdate;
    private String warhs;
    private String itmno;
    private int qty;
    private String rsabn;
    private String rtime;
    private String bigo;

    @Basic
    @Column(name = "GDATE", nullable = false, length = 8)
    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
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
    @Column(name = "ITMNO", nullable = false, length = 15)
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
    @Column(name = "RSABN", nullable = false, length = 10)
    public String getRsabn() {
        return rsabn;
    }

    public void setRsabn(String rsabn) {
        this.rsabn = rsabn;
    }

    @Basic
    @Column(name = "RTIME", nullable = false, length = 14)
    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    @Basic
    @Column(name = "BIGO", nullable = false, length = 100)
    public String getBigo() {
        return bigo;
    }

    public void setBigo(String bigo) {
        this.bigo = bigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmbldiffEntity that = (ItmbldiffEntity) o;
        return qty == that.qty &&
                Objects.equals(gdate, that.gdate) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(rsabn, that.rsabn) &&
                Objects.equals(rtime, that.rtime) &&
                Objects.equals(bigo, that.bigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gdate, warhs, itmno, qty, rsabn, rtime, bigo);
    }
}
