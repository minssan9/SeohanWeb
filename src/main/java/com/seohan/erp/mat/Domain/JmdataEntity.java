package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "JMDATA", schema = "SMLIB", catalog = "")
public class JmdataEntity {
    private String gsgubn;
    private String gdate;
    private String wrkct;
    private String wrkNm;
    private int tagNo;
    private String itmno;
    private int qty;
    private String dan;
    private String samChk;
    private String per01;
    private String per02;
    private String per03;
    private String stat;
    private String bigo;
    private String intime;

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
    @Column(name = "WRKCT", nullable = false, length = 10)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "WRK_NM", nullable = false, length = 80)
    public String getWrkNm() {
        return wrkNm;
    }

    public void setWrkNm(String wrkNm) {
        this.wrkNm = wrkNm;
    }

    @Basic
    @Column(name = "TAG_NO", nullable = false, precision = 0)
    public int getTagNo() {
        return tagNo;
    }

    public void setTagNo(int tagNo) {
        this.tagNo = tagNo;
    }

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 50)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "QTY", nullable = false, precision = 0)
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "DAN", nullable = false, length = 4)
    public String getDan() {
        return dan;
    }

    public void setDan(String dan) {
        this.dan = dan;
    }

    @Basic
    @Column(name = "SAM_CHK", nullable = false, length = 1)
    public String getSamChk() {
        return samChk;
    }

    public void setSamChk(String samChk) {
        this.samChk = samChk;
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
    @Column(name = "INTIME", nullable = false, length = 14)
    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JmdataEntity that = (JmdataEntity) o;
        return tagNo == that.tagNo &&
                qty == that.qty &&
                Objects.equals(gsgubn, that.gsgubn) &&
                Objects.equals(gdate, that.gdate) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(wrkNm, that.wrkNm) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(dan, that.dan) &&
                Objects.equals(samChk, that.samChk) &&
                Objects.equals(per01, that.per01) &&
                Objects.equals(per02, that.per02) &&
                Objects.equals(per03, that.per03) &&
                Objects.equals(stat, that.stat) &&
                Objects.equals(bigo, that.bigo) &&
                Objects.equals(intime, that.intime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gsgubn, gdate, wrkct, wrkNm, tagNo, itmno, qty, dan, samChk, per01, per02, per03, stat, bigo, intime);
    }
}
