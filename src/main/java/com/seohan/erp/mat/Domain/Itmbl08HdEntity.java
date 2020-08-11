package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ITMBL08_HD", schema = "SMLIB", catalog = "")
public class Itmbl08HdEntity {
    private String gdate;
    private String gtime;
    private String timeflag;
    private String type;
    private String typeds;
    private String fact;
    private String warhs;
    private String warhsNm;
    private double qty;
    private double mny;
    private String ref;
    private String fill;

    @Basic
    @Column(name = "GDATE", nullable = false, length = 8)
    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
    }

    @Basic
    @Column(name = "GTIME", nullable = false, length = 4)
    public String getGtime() {
        return gtime;
    }

    public void setGtime(String gtime) {
        this.gtime = gtime;
    }

    @Basic
    @Column(name = "TIMEFLAG", nullable = false, length = 5)
    public String getTimeflag() {
        return timeflag;
    }

    public void setTimeflag(String timeflag) {
        this.timeflag = timeflag;
    }

    @Basic
    @Column(name = "TYPE", nullable = false, length = 2)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "TYPEDS", nullable = false, length = 30)
    public String getTypeds() {
        return typeds;
    }

    public void setTypeds(String typeds) {
        this.typeds = typeds;
    }

    @Basic
    @Column(name = "FACT", nullable = false, length = 5)
    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
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
    @Column(name = "WARHS_NM", nullable = false, length = 60)
    public String getWarhsNm() {
        return warhsNm;
    }

    public void setWarhsNm(String warhsNm) {
        this.warhsNm = warhsNm;
    }

    @Basic
    @Column(name = "QTY", nullable = false, precision = 0)
    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "MNY", nullable = false, precision = 0)
    public double getMny() {
        return mny;
    }

    public void setMny(double mny) {
        this.mny = mny;
    }

    @Basic
    @Column(name = "REF", nullable = false, length = 100)
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 100)
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
        Itmbl08HdEntity that = (Itmbl08HdEntity) o;
        return Double.compare(that.qty, qty) == 0 &&
                Double.compare(that.mny, mny) == 0 &&
                Objects.equals(gdate, that.gdate) &&
                Objects.equals(gtime, that.gtime) &&
                Objects.equals(timeflag, that.timeflag) &&
                Objects.equals(type, that.type) &&
                Objects.equals(typeds, that.typeds) &&
                Objects.equals(fact, that.fact) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(warhsNm, that.warhsNm) &&
                Objects.equals(ref, that.ref) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gdate, gtime, timeflag, type, typeds, fact, warhs, warhsNm, qty, mny, ref, fill);
    }
}
