package com.seohan.erp.mat.Domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class VuserpfEntityPK implements Serializable {
    private String cstcd;
    private String gubun;
    private BigInteger serno;

    @Column(name = "CSTCD", nullable = false, length = 5)
    @Id
    public String getCstcd() {
        return cstcd;
    }

    public void setCstcd(String cstcd) {
        this.cstcd = cstcd;
    }

    @Column(name = "GUBUN", nullable = false, length = 1)
    @Id
    public String getGubun() {
        return gubun;
    }

    public void setGubun(String gubun) {
        this.gubun = gubun;
    }

    @Column(name = "SERNO", nullable = false, precision = 0)
    @Id
    public BigInteger getSerno() {
        return serno;
    }

    public void setSerno(BigInteger serno) {
        this.serno = serno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VuserpfEntityPK that = (VuserpfEntityPK) o;
        return Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(gubun, that.gubun) &&
                Objects.equals(serno, that.serno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cstcd, gubun, serno);
    }
}
