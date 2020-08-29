package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "PROD_PLN", schema = "SBLIB", catalog = "")
public class ProdPlnEntity {
    private String docuno;
    private String cstcd;
    private String cstnm;
    private String warhs;
    private String chjgb;
    private String pdate;
    private String shift;
    private String wrkct;
    private String itmno;
    private int plqty;
    private String remark;
    private String fill;
    private String stats;
    private String rdate;
    private int serno;
    private int revno;
    private String rtime;
    private String sabun;

    @Basic
    @Column(name = "DOCUNO", nullable = false, length = 15)
    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno;
    }

    @Basic
    @Column(name = "CSTCD", nullable = false, length = 8)
    public String getCstcd() {
        return cstcd;
    }

    public void setCstcd(String cstcd) {
        this.cstcd = cstcd;
    }

    @Basic
    @Column(name = "CSTNM", nullable = false, length = 50)
    public String getCstnm() {
        return cstnm;
    }

    public void setCstnm(String cstnm) {
        this.cstnm = cstnm;
    }

    @Basic
    @Column(name = "WARHS", nullable = false, length = 10)
    public String getWarhs() {
        return warhs;
    }

    public void setWarhs(String warhs) {
        this.warhs = warhs;
    }

    @Basic
    @Column(name = "CHJGB", nullable = false, length = 8)
    public String getChjgb() {
        return chjgb;
    }

    public void setChjgb(String chjgb) {
        this.chjgb = chjgb;
    }

    @Basic
    @Column(name = "PDATE", nullable = false, length = 8)
    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    @Basic
    @Column(name = "SHIFT", nullable = false, length = 5)
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
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
    @Column(name = "ITMNO", nullable = false, length = 15)
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
    @Column(name = "REMARK", nullable = false, length = 200)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 30)
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Basic
    @Column(name = "STATS", nullable = false, length = 2)
    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Basic
    @Column(name = "RDATE", nullable = false, length = 8)
    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    @Basic
    @Column(name = "SERNO", nullable = false, precision = 0)
    public int getSerno() {
        return serno;
    }

    public void setSerno(int serno) {
        this.serno = serno;
    }

    @Basic
    @Column(name = "REVNO", nullable = false, precision = 0)
    public int getRevno() {
        return revno;
    }

    public void setRevno(int revno) {
        this.revno = revno;
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
    @Column(name = "SABUN", nullable = false, length = 7)
    public String getSabun() {
        return sabun;
    }

    public void setSabun(String sabun) {
        this.sabun = sabun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdPlnEntity that = (ProdPlnEntity) o;
        return plqty == that.plqty &&
                serno == that.serno &&
                revno == that.revno &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(cstnm, that.cstnm) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(pdate, that.pdate) &&
                Objects.equals(shift, that.shift) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(rdate, that.rdate) &&
                Objects.equals(rtime, that.rtime) &&
                Objects.equals(sabun, that.sabun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docuno, cstcd, cstnm, warhs, chjgb, pdate, shift, wrkct, itmno, plqty, remark, fill, stats, rdate, serno, revno, rtime, sabun);
    }
}
