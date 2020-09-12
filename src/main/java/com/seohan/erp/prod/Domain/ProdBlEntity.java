package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "PROD_BL", schema = "SBLIB", catalog = "")
public class ProdBlEntity {
    private String bdate;
    private int serno;
    private String docuno;
    private String cstcd;
    private String cstnm;
    private String chjgb;
    private String warhs;
    private String itmno;
    private int shnqty;
    private int trsqty;
    private int asanqty;
    private int cstqty;
    private String remark;
    private String fill;
    private String stats;

    @Basic
    @Column(name = "BDATE", nullable = false, length = 8)
    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
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
    @Column(name = "CHJGB", nullable = false, length = 8)
    public String getChjgb() {
        return chjgb;
    }

    public void setChjgb(String chjgb) {
        this.chjgb = chjgb;
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
    @Column(name = "ITMNO", nullable = false, length = 15)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "SHNQTY", nullable = false, precision = 0)
    public int getShnqty() {
        return shnqty;
    }

    public void setShnqty(int shnqty) {
        this.shnqty = shnqty;
    }

    @Basic
    @Column(name = "TRSQTY", nullable = false, precision = 0)
    public int getTrsqty() {
        return trsqty;
    }

    public void setTrsqty(int trsqty) {
        this.trsqty = trsqty;
    }

    @Basic
    @Column(name = "ASANQTY", nullable = false, precision = 0)
    public int getAsanqty() {
        return asanqty;
    }

    public void setAsanqty(int asanqty) {
        this.asanqty = asanqty;
    }

    @Basic
    @Column(name = "CSTQTY", nullable = false, precision = 0)
    public int getCstqty() {
        return cstqty;
    }

    public void setCstqty(int cstqty) {
        this.cstqty = cstqty;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdBlEntity that = (ProdBlEntity) o;
        return serno == that.serno &&
                shnqty == that.shnqty &&
                trsqty == that.trsqty &&
                asanqty == that.asanqty &&
                cstqty == that.cstqty &&
                Objects.equals(bdate, that.bdate) &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(cstnm, that.cstnm) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(stats, that.stats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bdate, serno, docuno, cstcd, cstnm, chjgb, warhs, itmno, shnqty, trsqty, asanqty, cstqty, remark, fill, stats);
    }
}
