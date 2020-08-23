package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "ITMCT_HIS", schema = "SBLIB", catalog = "")
public class ItmctHisEntity {
    private String wrkct;
    private String rut;
    private String types;
    private BigDecimal manto;
    private BigDecimal ctime;
    private String itmno;
    private String neck;
    private String rdocnum;
    private String ddocnum;
    private String stext;
    private String process;
    private String yymm;

    @Basic
    @Column(name = "WRKCT", nullable = false, length = 4)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "RUT", nullable = false, length = 5)
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
    @Column(name = "CTIME", nullable = false, precision = 1)
    public BigDecimal getCtime() {
        return ctime;
    }

    public void setCtime(BigDecimal ctime) {
        this.ctime = ctime;
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
    @Column(name = "NECK", nullable = false, length = 1)
    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    @Basic
    @Column(name = "RDOCNUM", nullable = false, length = 15)
    public String getRdocnum() {
        return rdocnum;
    }

    public void setRdocnum(String rdocnum) {
        this.rdocnum = rdocnum;
    }

    @Basic
    @Column(name = "DDOCNUM", nullable = false, length = 15)
    public String getDdocnum() {
        return ddocnum;
    }

    public void setDdocnum(String ddocnum) {
        this.ddocnum = ddocnum;
    }

    @Basic
    @Column(name = "STEXT", nullable = false, length = 500)
    public String getStext() {
        return stext;
    }

    public void setStext(String stext) {
        this.stext = stext;
    }

    @Basic
    @Column(name = "PROCESS", nullable = false, length = 20)
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @Basic
    @Column(name = "YYMM", nullable = false, length = 8)
    public String getYymm() {
        return yymm;
    }

    public void setYymm(String yymm) {
        this.yymm = yymm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmctHisEntity that = (ItmctHisEntity) o;
        return Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(rut, that.rut) &&
                Objects.equals(types, that.types) &&
                Objects.equals(manto, that.manto) &&
                Objects.equals(ctime, that.ctime) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(neck, that.neck) &&
                Objects.equals(rdocnum, that.rdocnum) &&
                Objects.equals(ddocnum, that.ddocnum) &&
                Objects.equals(stext, that.stext) &&
                Objects.equals(process, that.process) &&
                Objects.equals(yymm, that.yymm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrkct, rut, types, manto, ctime, itmno, neck, rdocnum, ddocnum, stext, process, yymm);
    }
}
