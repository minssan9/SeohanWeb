package com.seohan.erp.base.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ITM_DETAIL", schema = "SMLIB", catalog = "")
public class ItmDetailEntity {
    private String itmno;
    private String chjgb;
    private String cstcd;
    private long id;

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "CHJGB", nullable = false, length = 3)
    public String getChjgb() {
        return chjgb;
    }

    public void setChjgb(String chjgb) {
        this.chjgb = chjgb;
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
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmDetailEntity that = (ItmDetailEntity) o;
        return id == that.id &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(cstcd, that.cstcd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, chjgb, cstcd, id);
    }
}
