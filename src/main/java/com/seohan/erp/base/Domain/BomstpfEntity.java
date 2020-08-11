package com.seohan.erp.base.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "BOMSTPF", schema = "SMLIB", catalog = "")
public class BomstpfEntity {
    private String gubn;
    private String pitmno;
    private String citmno;
    private String bdate;
    private BigDecimal qty;
    private String ref;
    private String sts;

    @Basic
    @Column(name = "GUBN", nullable = false, length = 1)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Basic
    @Column(name = "PITMNO", nullable = false, length = 30)
    public String getPitmno() {
        return pitmno;
    }

    public void setPitmno(String pitmno) {
        this.pitmno = pitmno;
    }

    @Basic
    @Column(name = "CITMNO", nullable = false, length = 30)
    public String getCitmno() {
        return citmno;
    }

    public void setCitmno(String citmno) {
        this.citmno = citmno;
    }

    @Basic
    @Column(name = "BDATE", nullable = false, length = 8)
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
    @Column(name = "REF", nullable = false, length = 50)
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
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
        BomstpfEntity that = (BomstpfEntity) o;
        return Objects.equals(gubn, that.gubn) &&
                Objects.equals(pitmno, that.pitmno) &&
                Objects.equals(citmno, that.citmno) &&
                Objects.equals(bdate, that.bdate) &&
                Objects.equals(qty, that.qty) &&
                Objects.equals(ref, that.ref) &&
                Objects.equals(sts, that.sts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, pitmno, citmno, bdate, qty, ref, sts);
    }
}
