package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "PRDPDPF_VW", schema = "SBLIB", catalog = "")
public class PrdpdpfVwEntity {
    private String fact;
    private String docuno;
    private String itmno;
    private String wrkct;
    private String pldte;
    private int plqty;
    private int rhqty;
    private int reqty;
    private String wrksts;
    private String fill;

    @Basic
    @Column(name = "FACT", nullable = false, length = 1)
    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    @Basic
    @Column(name = "DOCUNO", nullable = false, length = 21)
    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno;
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
    @Column(name = "WRKCT", nullable = false, length = 4)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "PLDTE", nullable = false, length = 8)
    public String getPldte() {
        return pldte;
    }

    public void setPldte(String pldte) {
        this.pldte = pldte;
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
    @Column(name = "WRKSTS", nullable = false, length = 1)
    public String getWrksts() {
        return wrksts;
    }

    public void setWrksts(String wrksts) {
        this.wrksts = wrksts;
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
        PrdpdpfVwEntity that = (PrdpdpfVwEntity) o;
        return plqty == that.plqty &&
                rhqty == that.rhqty &&
                reqty == that.reqty &&
                Objects.equals(fact, that.fact) &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(pldte, that.pldte) &&
                Objects.equals(wrksts, that.wrksts) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fact, docuno, itmno, wrkct, pldte, plqty, rhqty, reqty, wrksts, fill);
    }
}
