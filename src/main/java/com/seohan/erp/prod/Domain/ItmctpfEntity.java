package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "ITMCTPF", schema = "SBLIB", catalog = "")
public class ItmctpfEntity {
    private String wrkct;
    private String rut;
    private String svendor;
    private String jdate;
    private String types;
    private BigDecimal manto;
    private BigDecimal ctime;
    private String neck;
    private String dtext;
    private String rdocnum;
    private String ddocnum;
    private String stext;
    private String file0;
    private String file1;
    private String file2;
    private String file3;
    private String file4;
    private String file5;
    private String file6;
    private String file7;
    private String file8;
    private String file9;
    private String stat;
    private String nowgb;

    @Basic
    @Column(name = "WRKCT", nullable = false, length = 4)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "RUT", nullable = false, length = 5)
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Basic
    @Column(name = "SVENDOR", nullable = false, length = 30)
    public String getSvendor() {
        return svendor;
    }

    public void setSvendor(String svendor) {
        this.svendor = svendor;
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
    @Column(name = "TYPES", nullable = false, length = 20)
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Basic
    @Column(name = "MANTO", nullable = false, precision = 1)
    public BigDecimal getManto() {
        return manto;
    }

    public void setManto(BigDecimal manto) {
        this.manto = manto;
    }

    @Basic
    @Column(name = "CTIME", nullable = false, precision = 1)
    public BigDecimal getCtime() {
        return ctime;
    }

    public void setCtime(BigDecimal ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "NECK", nullable = false, length = 1)
    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    @Basic
    @Column(name = "DTEXT", nullable = false, length = 500)
    public String getDtext() {
        return dtext;
    }

    public void setDtext(String dtext) {
        this.dtext = dtext;
    }

    @Basic
    @Column(name = "RDOCNUM", nullable = false, length = 15)
    public String getRdocnum() {
        return rdocnum;
    }

    public void setRdocnum(String rdocnum) {
        this.rdocnum = rdocnum;
    }

    @Basic
    @Column(name = "DDOCNUM", nullable = false, length = 15)
    public String getDdocnum() {
        return ddocnum;
    }

    public void setDdocnum(String ddocnum) {
        this.ddocnum = ddocnum;
    }

    @Basic
    @Column(name = "STEXT", nullable = false, length = 500)
    public String getStext() {
        return stext;
    }

    public void setStext(String stext) {
        this.stext = stext;
    }

    @Basic
    @Column(name = "FILE0", nullable = false, length = 800)
    public String getFile0() {
        return file0;
    }

    public void setFile0(String file0) {
        this.file0 = file0;
    }

    @Basic
    @Column(name = "FILE1", nullable = false, length = 800)
    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    @Basic
    @Column(name = "FILE2", nullable = false, length = 800)
    public String getFile2() {
        return file2;
    }

    public void setFile2(String file2) {
        this.file2 = file2;
    }

    @Basic
    @Column(name = "FILE3", nullable = false, length = 800)
    public String getFile3() {
        return file3;
    }

    public void setFile3(String file3) {
        this.file3 = file3;
    }

    @Basic
    @Column(name = "FILE4", nullable = false, length = 800)
    public String getFile4() {
        return file4;
    }

    public void setFile4(String file4) {
        this.file4 = file4;
    }

    @Basic
    @Column(name = "FILE5", nullable = false, length = 800)
    public String getFile5() {
        return file5;
    }

    public void setFile5(String file5) {
        this.file5 = file5;
    }

    @Basic
    @Column(name = "FILE6", nullable = false, length = 800)
    public String getFile6() {
        return file6;
    }

    public void setFile6(String file6) {
        this.file6 = file6;
    }

    @Basic
    @Column(name = "FILE7", nullable = false, length = 800)
    public String getFile7() {
        return file7;
    }

    public void setFile7(String file7) {
        this.file7 = file7;
    }

    @Basic
    @Column(name = "FILE8", nullable = false, length = 800)
    public String getFile8() {
        return file8;
    }

    public void setFile8(String file8) {
        this.file8 = file8;
    }

    @Basic
    @Column(name = "FILE9", nullable = false, length = 800)
    public String getFile9() {
        return file9;
    }

    public void setFile9(String file9) {
        this.file9 = file9;
    }

    @Basic
    @Column(name = "STAT", nullable = false, length = 6)
    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Basic
    @Column(name = "NOWGB", nullable = false, length = 1)
    public String getNowgb() {
        return nowgb;
    }

    public void setNowgb(String nowgb) {
        this.nowgb = nowgb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmctpfEntity that = (ItmctpfEntity) o;
        return Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(rut, that.rut) &&
                Objects.equals(svendor, that.svendor) &&
                Objects.equals(jdate, that.jdate) &&
                Objects.equals(types, that.types) &&
                Objects.equals(manto, that.manto) &&
                Objects.equals(ctime, that.ctime) &&
                Objects.equals(neck, that.neck) &&
                Objects.equals(dtext, that.dtext) &&
                Objects.equals(rdocnum, that.rdocnum) &&
                Objects.equals(ddocnum, that.ddocnum) &&
                Objects.equals(stext, that.stext) &&
                Objects.equals(file0, that.file0) &&
                Objects.equals(file1, that.file1) &&
                Objects.equals(file2, that.file2) &&
                Objects.equals(file3, that.file3) &&
                Objects.equals(file4, that.file4) &&
                Objects.equals(file5, that.file5) &&
                Objects.equals(file6, that.file6) &&
                Objects.equals(file7, that.file7) &&
                Objects.equals(file8, that.file8) &&
                Objects.equals(file9, that.file9) &&
                Objects.equals(stat, that.stat) &&
                Objects.equals(nowgb, that.nowgb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrkct, rut, svendor, jdate, types, manto, ctime, neck, dtext, rdocnum, ddocnum, stext, file0, file1, file2, file3, file4, file5, file6, file7, file8, file9, stat, nowgb);
    }
}
