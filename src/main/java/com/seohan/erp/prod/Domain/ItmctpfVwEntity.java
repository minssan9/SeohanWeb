package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "ITMCTPF_VW", schema = "SBLIB", catalog = "")
public class ItmctpfVwEntity {
    private String wrkct;
    private String rut;
    private String itmno;
    private String types;
    private BigDecimal manto;
    private String nowgb;
    private BigDecimal ctime;
    private String neck;
    private String svendor;

    @Basic
    @Column(name = "WRKCT", nullable = false, length = 4)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
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
    @Column(name = "NOWGB", nullable = false, length = 5)
    public String getNowgb() {
        return nowgb;
    }

    public void setNowgb(String nowgb) {
        this.nowgb = nowgb;
    }

    @Basic
    @Column(name = "CTIME", nullable = false, precision = 1)
    public BigDecimal getCtime() {
        return ctime;
    }

    public void setCtime(BigDecimal ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "NECK", nullable = false, length = 1)
    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    @Basic
    @Column(name = "SVENDOR", nullable = false, length = 30)
    public String getSvendor() {
        return svendor;
    }

    public void setSvendor(String svendor) {
        this.svendor = svendor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmctpfVwEntity that = (ItmctpfVwEntity) o;
        return Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(rut, that.rut) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(types, that.types) &&
                Objects.equals(manto, that.manto) &&
                Objects.equals(nowgb, that.nowgb) &&
                Objects.equals(ctime, that.ctime) &&
                Objects.equals(neck, that.neck) &&
                Objects.equals(svendor, that.svendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrkct, rut, itmno, types, manto, nowgb, ctime, neck, svendor);
    }
}
