package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "PROD_ORD", schema = "SBLIB", catalog = "")
public class ProdOrdEntity {
    private String docuno;
    private String odate;
    private String cstcd;
    private String cstnm;
    private String warhs;
    private String chjgb;
    private String wrkct;
    private String itmno;
    private int ordqty;
    private String remark;
    private String fill;
    private String stats;
    private String rdate;
    private int serno;
    private int revno;

    @Basic
    @Column(name = "DOCUNO", nullable = false, length = 15)
    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno;
    }

    @Basic
    @Column(name = "ODATE", nullable = false, length = 8)
    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
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
    @Column(name = "ORDQTY", nullable = false, precision = 0)
    public int getOrdqty() {
        return ordqty;
    }

    public void setOrdqty(int ordqty) {
        this.ordqty = ordqty;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdOrdEntity that = (ProdOrdEntity) o;
        return ordqty == that.ordqty &&
                serno == that.serno &&
                revno == that.revno &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(odate, that.odate) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(cstnm, that.cstnm) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(rdate, that.rdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docuno, odate, cstcd, cstnm, warhs, chjgb, wrkct, itmno, ordqty, remark, fill, stats, rdate, serno, revno);
    }
}
