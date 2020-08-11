package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "JMSET", schema = "SMLIB", catalog = "")
public class JmsetEntity {
    private String gsgubn;
    private String gdate;
    private int ser;
    private String lpchk;
    private String wrkct;
    private String per01;
    private String per02;
    private String per03;
    private String stat;
    private String bigo;
    private String wrkNm;

    @Basic
    @Column(name = "GSGUBN", nullable = false, length = 10)
    public String getGsgubn() {
        return gsgubn;
    }

    public void setGsgubn(String gsgubn) {
        this.gsgubn = gsgubn;
    }

    @Basic
    @Column(name = "GDATE", nullable = false, length = 8)
    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
    }

    @Basic
    @Column(name = "SER", nullable = false, precision = 0)
    public int getSer() {
        return ser;
    }

    public void setSer(int ser) {
        this.ser = ser;
    }

    @Basic
    @Column(name = "LPCHK", nullable = false, length = 1)
    public String getLpchk() {
        return lpchk;
    }

    public void setLpchk(String lpchk) {
        this.lpchk = lpchk;
    }

    @Basic
    @Column(name = "WRKCT", nullable = false, length = 10)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "PER01", nullable = false, length = 20)
    public String getPer01() {
        return per01;
    }

    public void setPer01(String per01) {
        this.per01 = per01;
    }

    @Basic
    @Column(name = "PER02", nullable = false, length = 20)
    public String getPer02() {
        return per02;
    }

    public void setPer02(String per02) {
        this.per02 = per02;
    }

    @Basic
    @Column(name = "PER03", nullable = false, length = 20)
    public String getPer03() {
        return per03;
    }

    public void setPer03(String per03) {
        this.per03 = per03;
    }

    @Basic
    @Column(name = "STAT", nullable = false, length = 1)
    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Basic
    @Column(name = "BIGO", nullable = false, length = 50)
    public String getBigo() {
        return bigo;
    }

    public void setBigo(String bigo) {
        this.bigo = bigo;
    }

    @Basic
    @Column(name = "WRK_NM", nullable = false, length = 50)
    public String getWrkNm() {
        return wrkNm;
    }

    public void setWrkNm(String wrkNm) {
        this.wrkNm = wrkNm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JmsetEntity that = (JmsetEntity) o;
        return ser == that.ser &&
                Objects.equals(gsgubn, that.gsgubn) &&
                Objects.equals(gdate, that.gdate) &&
                Objects.equals(lpchk, that.lpchk) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(per01, that.per01) &&
                Objects.equals(per02, that.per02) &&
                Objects.equals(per03, that.per03) &&
                Objects.equals(stat, that.stat) &&
                Objects.equals(bigo, that.bigo) &&
                Objects.equals(wrkNm, that.wrkNm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gsgubn, gdate, ser, lpchk, wrkct, per01, per02, per03, stat, bigo, wrkNm);
    }
}
