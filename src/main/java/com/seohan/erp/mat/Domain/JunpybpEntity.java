package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "JUNPYBP", schema = "SMLIB", catalog = "")
public class JunpybpEntity {
    private String gubn;
    private String rdate;
    private int serno;
    private int subno;
    private String fwarhs;
    private String twarhs;
    private String itmno;
    private int qunty;
    private int weigt;
    private int danga;
    private String trgae;
    private String locat;
    private String lotno;
    private String remark;
    private String ref01;
    private String ref02;
    private String fill;

    @Basic
    @Column(name = "GUBN", nullable = false, length = 1)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
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
    @Column(name = "SUBNO", nullable = false, precision = 0)
    public int getSubno() {
        return subno;
    }

    public void setSubno(int subno) {
        this.subno = subno;
    }

    @Basic
    @Column(name = "FWARHS", nullable = false, length = 5)
    public String getFwarhs() {
        return fwarhs;
    }

    public void setFwarhs(String fwarhs) {
        this.fwarhs = fwarhs;
    }

    @Basic
    @Column(name = "TWARHS", nullable = false, length = 5)
    public String getTwarhs() {
        return twarhs;
    }

    public void setTwarhs(String twarhs) {
        this.twarhs = twarhs;
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
    @Column(name = "QUNTY", nullable = false, precision = 0)
    public int getQunty() {
        return qunty;
    }

    public void setQunty(int qunty) {
        this.qunty = qunty;
    }

    @Basic
    @Column(name = "WEIGT", nullable = false, precision = 0)
    public int getWeigt() {
        return weigt;
    }

    public void setWeigt(int weigt) {
        this.weigt = weigt;
    }

    @Basic
    @Column(name = "DANGA", nullable = false, precision = 0)
    public int getDanga() {
        return danga;
    }

    public void setDanga(int danga) {
        this.danga = danga;
    }

    @Basic
    @Column(name = "TRGAE", nullable = false, length = 2)
    public String getTrgae() {
        return trgae;
    }

    public void setTrgae(String trgae) {
        this.trgae = trgae;
    }

    @Basic
    @Column(name = "LOCAT", nullable = false, length = 4)
    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
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
    @Column(name = "REMARK", nullable = false, length = 100)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "REF01", nullable = false, length = 50)
    public String getRef01() {
        return ref01;
    }

    public void setRef01(String ref01) {
        this.ref01 = ref01;
    }

    @Basic
    @Column(name = "REF02", nullable = false, length = 200)
    public String getRef02() {
        return ref02;
    }

    public void setRef02(String ref02) {
        this.ref02 = ref02;
    }

    @Basic
    @Column(name = "FILL", nullable = true, length = 20)
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
        JunpybpEntity that = (JunpybpEntity) o;
        return serno == that.serno &&
                subno == that.subno &&
                qunty == that.qunty &&
                weigt == that.weigt &&
                danga == that.danga &&
                Objects.equals(gubn, that.gubn) &&
                Objects.equals(rdate, that.rdate) &&
                Objects.equals(fwarhs, that.fwarhs) &&
                Objects.equals(twarhs, that.twarhs) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(trgae, that.trgae) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(ref01, that.ref01) &&
                Objects.equals(ref02, that.ref02) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, rdate, serno, subno, fwarhs, twarhs, itmno, qunty, weigt, danga, trgae, locat, lotno, remark, ref01, ref02, fill);
    }
}
