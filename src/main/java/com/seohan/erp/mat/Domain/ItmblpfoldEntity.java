package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ITMBLPFOLD", schema = "SMLIB", catalog = "")
public class ItmblpfoldEntity {
    private String itmno;
    private String warhs;
    private String locat;
    private int onhnd;
    private int safmx;
    private int safmn;
    private String avrgb;
    private int avrqt;
    private int leadt;
    private int purut;
    private int purtm;
    private String purgb;
    private String fill;

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 15)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
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
    @Column(name = "LOCAT", nullable = false, length = 4)
    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
    }

    @Basic
    @Column(name = "ONHND", nullable = false, precision = 0)
    public int getOnhnd() {
        return onhnd;
    }

    public void setOnhnd(int onhnd) {
        this.onhnd = onhnd;
    }

    @Basic
    @Column(name = "SAFMX", nullable = false, precision = 0)
    public int getSafmx() {
        return safmx;
    }

    public void setSafmx(int safmx) {
        this.safmx = safmx;
    }

    @Basic
    @Column(name = "SAFMN", nullable = false, precision = 0)
    public int getSafmn() {
        return safmn;
    }

    public void setSafmn(int safmn) {
        this.safmn = safmn;
    }

    @Basic
    @Column(name = "AVRGB", nullable = false, length = 1)
    public String getAvrgb() {
        return avrgb;
    }

    public void setAvrgb(String avrgb) {
        this.avrgb = avrgb;
    }

    @Basic
    @Column(name = "AVRQT", nullable = false, precision = 0)
    public int getAvrqt() {
        return avrqt;
    }

    public void setAvrqt(int avrqt) {
        this.avrqt = avrqt;
    }

    @Basic
    @Column(name = "LEADT", nullable = false, precision = 0)
    public int getLeadt() {
        return leadt;
    }

    public void setLeadt(int leadt) {
        this.leadt = leadt;
    }

    @Basic
    @Column(name = "PURUT", nullable = false, precision = 0)
    public int getPurut() {
        return purut;
    }

    public void setPurut(int purut) {
        this.purut = purut;
    }

    @Basic
    @Column(name = "PURTM", nullable = false, precision = 0)
    public int getPurtm() {
        return purtm;
    }

    public void setPurtm(int purtm) {
        this.purtm = purtm;
    }

    @Basic
    @Column(name = "PURGB", nullable = false, length = 1)
    public String getPurgb() {
        return purgb;
    }

    public void setPurgb(String purgb) {
        this.purgb = purgb;
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
        ItmblpfoldEntity that = (ItmblpfoldEntity) o;
        return onhnd == that.onhnd &&
                safmx == that.safmx &&
                safmn == that.safmn &&
                avrqt == that.avrqt &&
                leadt == that.leadt &&
                purut == that.purut &&
                purtm == that.purtm &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(avrgb, that.avrgb) &&
                Objects.equals(purgb, that.purgb) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, warhs, locat, onhnd, safmx, safmn, avrgb, avrqt, leadt, purut, purtm, purgb, fill);
    }
}
