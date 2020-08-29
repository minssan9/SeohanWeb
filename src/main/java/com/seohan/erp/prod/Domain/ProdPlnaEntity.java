package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "PROD_PLNA", schema = "SBLIB", catalog = "")
public class ProdPlnaEntity {
    private String docuno;
    private String cstcd;
    private String cstnm;
    private String warhs;
    private String file;
    private String ref01;
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
    @Column(name = "FILE", nullable = false, length = 200)
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Basic
    @Column(name = "REF01", nullable = false, length = 30)
    public String getRef01() {
        return ref01;
    }

    public void setRef01(String ref01) {
        this.ref01 = ref01;
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
        ProdPlnaEntity that = (ProdPlnaEntity) o;
        return serno == that.serno &&
                revno == that.revno &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(cstnm, that.cstnm) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(file, that.file) &&
                Objects.equals(ref01, that.ref01) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(rdate, that.rdate) &&
                Objects.equals(rtime, that.rtime) &&
                Objects.equals(sabun, that.sabun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docuno, cstcd, cstnm, warhs, file, ref01, stats, rdate, serno, revno, rtime, sabun);
    }
}
