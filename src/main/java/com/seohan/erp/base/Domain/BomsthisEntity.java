package com.seohan.erp.base.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "BOMSTHIS", schema = "SMLIB", catalog = "")
public class BomsthisEntity {
    private String gubn;
    private String pitmno;
    private String citmno;
    private String rdate;
    private String rsabn;
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
    @Column(name = "PITMNO", nullable = false, length = 15)
    public String getPitmno() {
        return pitmno;
    }

    public void setPitmno(String pitmno) {
        this.pitmno = pitmno;
    }

    @Basic
    @Column(name = "CITMNO", nullable = false, length = 15)
    public String getCitmno() {
        return citmno;
    }

    public void setCitmno(String citmno) {
        this.citmno = citmno;
    }

    @Basic
    @Column(name = "RDATE", nullable = false, length = 14)
    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    @Basic
    @Column(name = "RSABN", nullable = false, length = 7)
    public String getRsabn() {
        return rsabn;
    }

    public void setRsabn(String rsabn) {
        this.rsabn = rsabn;
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
        BomsthisEntity that = (BomsthisEntity) o;
        return Objects.equals(gubn, that.gubn) &&
                Objects.equals(pitmno, that.pitmno) &&
                Objects.equals(citmno, that.citmno) &&
                Objects.equals(rdate, that.rdate) &&
                Objects.equals(rsabn, that.rsabn) &&
                Objects.equals(sts, that.sts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, pitmno, citmno, rdate, rsabn, sts);
    }
}
