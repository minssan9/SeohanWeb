package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "LOCA_ALM", schema = "SMLIB", catalog = "")
public class LocaAlmEntity {
    private String gubn;
    private String jdate;
    private int ser;
    private String gubnTxt;
    private String warhs;
    private String itmno;
    private String itmNm;
    private String lineCd;
    private String lineNm;
    private String cstCd;
    private String cstNm;
    private String locat;
    private int qty;
    private String lotno;
    private String bigo01;
    private String bigo02;
    private String bigo03;
    private String jsabn;
    private String jname;
    private String jymdhms;
    private String csabn;
    private String cname;
    private String cymdhms;
    private String sts;

    @Basic
    @Column(name = "GUBN", nullable = false, length = 2)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Basic
    @Column(name = "JDATE", nullable = false, length = 8)
    public String getJdate() {
        return jdate;
    }

    public void setJdate(String jdate) {
        this.jdate = jdate;
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
    @Column(name = "GUBN_TXT", nullable = false, length = 100)
    public String getGubnTxt() {
        return gubnTxt;
    }

    public void setGubnTxt(String gubnTxt) {
        this.gubnTxt = gubnTxt;
    }

    @Basic
    @Column(name = "WARHS", nullable = false, length = 5)
    public String getWarhs() {
        return warhs;
    }

    public void setWarhs(String warhs) {
        this.warhs = warhs;
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
    @Column(name = "ITM_NM", nullable = false, length = 100)
    public String getItmNm() {
        return itmNm;
    }

    public void setItmNm(String itmNm) {
        this.itmNm = itmNm;
    }

    @Basic
    @Column(name = "LINE_CD", nullable = false, length = 5)
    public String getLineCd() {
        return lineCd;
    }

    public void setLineCd(String lineCd) {
        this.lineCd = lineCd;
    }

    @Basic
    @Column(name = "LINE_NM", nullable = false, length = 50)
    public String getLineNm() {
        return lineNm;
    }

    public void setLineNm(String lineNm) {
        this.lineNm = lineNm;
    }

    @Basic
    @Column(name = "CST_CD", nullable = false, length = 5)
    public String getCstCd() {
        return cstCd;
    }

    public void setCstCd(String cstCd) {
        this.cstCd = cstCd;
    }

    @Basic
    @Column(name = "CST_NM", nullable = false, length = 50)
    public String getCstNm() {
        return cstNm;
    }

    public void setCstNm(String cstNm) {
        this.cstNm = cstNm;
    }

    @Basic
    @Column(name = "LOCAT", nullable = false, length = 10)
    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
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
    @Column(name = "LOTNO", nullable = false, length = 10)
    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno;
    }

    @Basic
    @Column(name = "BIGO01", nullable = false, length = 100)
    public String getBigo01() {
        return bigo01;
    }

    public void setBigo01(String bigo01) {
        this.bigo01 = bigo01;
    }

    @Basic
    @Column(name = "BIGO02", nullable = false, length = 100)
    public String getBigo02() {
        return bigo02;
    }

    public void setBigo02(String bigo02) {
        this.bigo02 = bigo02;
    }

    @Basic
    @Column(name = "BIGO03", nullable = false, length = 100)
    public String getBigo03() {
        return bigo03;
    }

    public void setBigo03(String bigo03) {
        this.bigo03 = bigo03;
    }

    @Basic
    @Column(name = "JSABN", nullable = false, length = 7)
    public String getJsabn() {
        return jsabn;
    }

    public void setJsabn(String jsabn) {
        this.jsabn = jsabn;
    }

    @Basic
    @Column(name = "JNAME", nullable = false, length = 20)
    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    @Basic
    @Column(name = "JYMDHMS", nullable = false, length = 14)
    public String getJymdhms() {
        return jymdhms;
    }

    public void setJymdhms(String jymdhms) {
        this.jymdhms = jymdhms;
    }

    @Basic
    @Column(name = "CSABN", nullable = false, length = 7)
    public String getCsabn() {
        return csabn;
    }

    public void setCsabn(String csabn) {
        this.csabn = csabn;
    }

    @Basic
    @Column(name = "CNAME", nullable = false, length = 20)
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Basic
    @Column(name = "CYMDHMS", nullable = false, length = 14)
    public String getCymdhms() {
        return cymdhms;
    }

    public void setCymdhms(String cymdhms) {
        this.cymdhms = cymdhms;
    }

    @Basic
    @Column(name = "STS", nullable = false, length = 1)
    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocaAlmEntity that = (LocaAlmEntity) o;
        return ser == that.ser &&
                qty == that.qty &&
                Objects.equals(gubn, that.gubn) &&
                Objects.equals(jdate, that.jdate) &&
                Objects.equals(gubnTxt, that.gubnTxt) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(itmNm, that.itmNm) &&
                Objects.equals(lineCd, that.lineCd) &&
                Objects.equals(lineNm, that.lineNm) &&
                Objects.equals(cstCd, that.cstCd) &&
                Objects.equals(cstNm, that.cstNm) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(bigo01, that.bigo01) &&
                Objects.equals(bigo02, that.bigo02) &&
                Objects.equals(bigo03, that.bigo03) &&
                Objects.equals(jsabn, that.jsabn) &&
                Objects.equals(jname, that.jname) &&
                Objects.equals(jymdhms, that.jymdhms) &&
                Objects.equals(csabn, that.csabn) &&
                Objects.equals(cname, that.cname) &&
                Objects.equals(cymdhms, that.cymdhms) &&
                Objects.equals(sts, that.sts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, jdate, ser, gubnTxt, warhs, itmno, itmNm, lineCd, lineNm, cstCd, cstNm, locat, qty, lotno, bigo01, bigo02, bigo03, jsabn, jname, jymdhms, csabn, cname, cymdhms, sts);
    }
}
