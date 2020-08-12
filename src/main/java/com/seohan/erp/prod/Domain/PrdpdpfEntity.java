package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "PRDPDPF", schema = "SBLIB", catalog = "")
public class PrdpdpfEntity {
    private String pldte;
    private String wrkct;
    private String wrkjo;
    private int seqno;
    private String itmno;
    private int plqty;
    private int rhqty;
    private int reqty;
    private String remark;
    private String fill;
    private int prtqty;
    private String wrksts;
    private BigDecimal percnt;
    private int jtime;
    private BigDecimal jmh;
    private BigDecimal tguph;
    private BigDecimal tgupm;

    @Basic
    @Column(name = "PLDTE", nullable = false, length = 8)
    public String getPldte() {
        return pldte;
    }

    public void setPldte(String pldte) {
        this.pldte = pldte;
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
    @Column(name = "WRKJO", nullable = false, length = 1)
    public String getWrkjo() {
        return wrkjo;
    }

    public void setWrkjo(String wrkjo) {
        this.wrkjo = wrkjo;
    }

    @Basic
    @Column(name = "SEQNO", nullable = false, precision = 0)
    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "PLQTY", nullable = false, precision = 0)
    public int getPlqty() {
        return plqty;
    }

    public void setPlqty(int plqty) {
        this.plqty = plqty;
    }

    @Basic
    @Column(name = "RHQTY", nullable = false, precision = 0)
    public int getRhqty() {
        return rhqty;
    }

    public void setRhqty(int rhqty) {
        this.rhqty = rhqty;
    }

    @Basic
    @Column(name = "REQTY", nullable = false, precision = 0)
    public int getReqty() {
        return reqty;
    }

    public void setReqty(int reqty) {
        this.reqty = reqty;
    }

    @Basic
    @Column(name = "REMARK", nullable = false, length = 200)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 20)
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Basic
    @Column(name = "PRTQTY", nullable = false, precision = 0)
    public int getPrtqty() {
        return prtqty;
    }

    public void setPrtqty(int prtqty) {
        this.prtqty = prtqty;
    }

    @Basic
    @Column(name = "WRKSTS", nullable = false, length = 1)
    public String getWrksts() {
        return wrksts;
    }

    public void setWrksts(String wrksts) {
        this.wrksts = wrksts;
    }

    @Basic
    @Column(name = "PERCNT", nullable = false, precision = 2)
    public BigDecimal getPercnt() {
        return percnt;
    }

    public void setPercnt(BigDecimal percnt) {
        this.percnt = percnt;
    }

    @Basic
    @Column(name = "JTIME", nullable = false, precision = 0)
    public int getJtime() {
        return jtime;
    }

    public void setJtime(int jtime) {
        this.jtime = jtime;
    }

    @Basic
    @Column(name = "JMH", nullable = false, precision = 2)
    public BigDecimal getJmh() {
        return jmh;
    }

    public void setJmh(BigDecimal jmh) {
        this.jmh = jmh;
    }

    @Basic
    @Column(name = "TGUPH", nullable = false, precision = 2)
    public BigDecimal getTguph() {
        return tguph;
    }

    public void setTguph(BigDecimal tguph) {
        this.tguph = tguph;
    }

    @Basic
    @Column(name = "TGUPM", nullable = false, precision = 2)
    public BigDecimal getTgupm() {
        return tgupm;
    }

    public void setTgupm(BigDecimal tgupm) {
        this.tgupm = tgupm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrdpdpfEntity that = (PrdpdpfEntity) o;
        return seqno == that.seqno &&
                plqty == that.plqty &&
                rhqty == that.rhqty &&
                reqty == that.reqty &&
                prtqty == that.prtqty &&
                jtime == that.jtime &&
                Objects.equals(pldte, that.pldte) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(wrkjo, that.wrkjo) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(wrksts, that.wrksts) &&
                Objects.equals(percnt, that.percnt) &&
                Objects.equals(jmh, that.jmh) &&
                Objects.equals(tguph, that.tguph) &&
                Objects.equals(tgupm, that.tgupm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pldte, wrkct, wrkjo, seqno, itmno, plqty, rhqty, reqty, remark, fill, prtqty, wrksts, percnt, jtime, jmh, tguph, tgupm);
    }
}
