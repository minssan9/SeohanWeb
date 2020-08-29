package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "ITMCT_ITM", schema = "SBLIB", catalog = "")
public class ItmctItmEntity {
    private String rdocnum;
    private String ddocnum;
    private String wrkct;
    private String itmno;
    private String types;
    private BigDecimal manto;
    private String rut;
    private String nowgb;

    @Basic
    @Column(name = "RDOCNUM", nullable = false, length = 20)
    public String getRdocnum() {
        return rdocnum;
    }

    public void setRdocnum(String rdocnum) {
        this.rdocnum = rdocnum;
    }

    @Basic
    @Column(name = "DDOCNUM", nullable = false, length = 20)
    public String getDdocnum() {
        return ddocnum;
    }

    public void setDdocnum(String ddocnum) {
        this.ddocnum = ddocnum;
    }

    @Basic
    @Column(name = "WRKCT", nullable = false, length = 4)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 20)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "TYPES", nullable = false, length = 20)
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Basic
    @Column(name = "MANTO", nullable = false, precision = 1)
    public BigDecimal getManto() {
        return manto;
    }

    public void setManto(BigDecimal manto) {
        this.manto = manto;
    }

    @Basic
    @Column(name = "RUT", nullable = false, length = 10)
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Basic
    @Column(name = "NOWGB", nullable = false, length = 5)
    public String getNowgb() {
        return nowgb;
    }

    public void setNowgb(String nowgb) {
        this.nowgb = nowgb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmctItmEntity that = (ItmctItmEntity) o;
        return Objects.equals(rdocnum, that.rdocnum) &&
                Objects.equals(ddocnum, that.ddocnum) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(types, that.types) &&
                Objects.equals(manto, that.manto) &&
                Objects.equals(rut, that.rut) &&
                Objects.equals(nowgb, that.nowgb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rdocnum, ddocnum, wrkct, itmno, types, manto, rut, nowgb);
    }
}
