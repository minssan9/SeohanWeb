package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "PROD_PLNB", schema = "SBLIB", catalog = "")
public class ProdPlnbEntity {
    private String docuno;
    private String chjgb;
    private String pdate;
    private String shift;
    private String wrkct;
    private String itmno;
    private int plqty;
    private String remark;
    private String fill;
    private String stats;

    @Basic
    @Column(name = "DOCUNO", nullable = false, length = 15)
    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdPlnbEntity that = (ProdPlnbEntity) o;
        return plqty == that.plqty &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(pdate, that.pdate) &&
                Objects.equals(shift, that.shift) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(stats, that.stats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docuno, chjgb, pdate, shift, wrkct, itmno, plqty, remark, fill, stats);
    }
}
