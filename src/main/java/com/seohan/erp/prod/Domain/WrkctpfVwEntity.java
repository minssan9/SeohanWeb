package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "WRKCTPF_VW", schema = "SBLIB", catalog = "")
public class WrkctpfVwEntity {
    private String fact;
    private String factnm;
    private String sosk;
    private String sosknm;
    private String wrkct;
    private String wrkds;
    private String rut;
    private String ruth;
    private String mch;
    private String mce;
    private BigDecimal manto;
    private BigDecimal manpo;
    private BigDecimal cauph;
    private BigDecimal caupm;
    private BigDecimal tguph;
    private BigDecimal tgupm;
    private int tgrat;
    private String cust;
    private String custNm;
    private String actgb;

    @Basic
    @Column(name = "FACT", nullable = false, length = 1)
    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    @Basic
    @Column(name = "FACTNM", nullable = true, length = 50)
    public String getFactnm() {
        return factnm;
    }

    public void setFactnm(String factnm) {
        this.factnm = factnm;
    }

    @Basic
    @Column(name = "SOSK", nullable = false, length = 3)
    public String getSosk() {
        return sosk;
    }

    public void setSosk(String sosk) {
        this.sosk = sosk;
    }

    @Basic
    @Column(name = "SOSKNM", nullable = true, length = 50)
    public String getSosknm() {
        return sosknm;
    }

    public void setSosknm(String sosknm) {
        this.sosknm = sosknm;
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
    @Column(name = "WRKDS", nullable = false, length = 50)
    public String getWrkds() {
        return wrkds;
    }

    public void setWrkds(String wrkds) {
        this.wrkds = wrkds;
    }

    @Basic
    @Column(name = "RUT", nullable = false, length = 4)
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Basic
    @Column(name = "RUTH", nullable = false, length = 30)
    public String getRuth() {
        return ruth;
    }

    public void setRuth(String ruth) {
        this.ruth = ruth;
    }

    @Basic
    @Column(name = "MCH", nullable = false, length = 30)
    public String getMch() {
        return mch;
    }

    public void setMch(String mch) {
        this.mch = mch;
    }

    @Basic
    @Column(name = "MCE", nullable = false, length = 30)
    public String getMce() {
        return mce;
    }

    public void setMce(String mce) {
        this.mce = mce;
    }

    @Basic
    @Column(name = "MANTO", nullable = false, precision = 2)
    public BigDecimal getManto() {
        return manto;
    }

    public void setManto(BigDecimal manto) {
        this.manto = manto;
    }

    @Basic
    @Column(name = "MANPO", nullable = false, precision = 2)
    public BigDecimal getManpo() {
        return manpo;
    }

    public void setManpo(BigDecimal manpo) {
        this.manpo = manpo;
    }

    @Basic
    @Column(name = "CAUPH", nullable = false, precision = 1)
    public BigDecimal getCauph() {
        return cauph;
    }

    public void setCauph(BigDecimal cauph) {
        this.cauph = cauph;
    }

    @Basic
    @Column(name = "CAUPM", nullable = false, precision = 1)
    public BigDecimal getCaupm() {
        return caupm;
    }

    public void setCaupm(BigDecimal caupm) {
        this.caupm = caupm;
    }

    @Basic
    @Column(name = "TGUPH", nullable = false, precision = 1)
    public BigDecimal getTguph() {
        return tguph;
    }

    public void setTguph(BigDecimal tguph) {
        this.tguph = tguph;
    }

    @Basic
    @Column(name = "TGUPM", nullable = false, precision = 1)
    public BigDecimal getTgupm() {
        return tgupm;
    }

    public void setTgupm(BigDecimal tgupm) {
        this.tgupm = tgupm;
    }

    @Basic
    @Column(name = "TGRAT", nullable = false, precision = 0)
    public int getTgrat() {
        return tgrat;
    }

    public void setTgrat(int tgrat) {
        this.tgrat = tgrat;
    }

    @Basic
    @Column(name = "CUST", nullable = false, length = 5)
    public String getCust() {
        return cust;
    }

    public void setCust(String cust) {
        this.cust = cust;
    }

    @Basic
    @Column(name = "CUST_NM", nullable = true, length = 40)
    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    @Basic
    @Column(name = "ACTGB", nullable = false, length = 1)
    public String getActgb() {
        return actgb;
    }

    public void setActgb(String actgb) {
        this.actgb = actgb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrkctpfVwEntity that = (WrkctpfVwEntity) o;
        return tgrat == that.tgrat &&
                Objects.equals(fact, that.fact) &&
                Objects.equals(factnm, that.factnm) &&
                Objects.equals(sosk, that.sosk) &&
                Objects.equals(sosknm, that.sosknm) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(wrkds, that.wrkds) &&
                Objects.equals(rut, that.rut) &&
                Objects.equals(ruth, that.ruth) &&
                Objects.equals(mch, that.mch) &&
                Objects.equals(mce, that.mce) &&
                Objects.equals(manto, that.manto) &&
                Objects.equals(manpo, that.manpo) &&
                Objects.equals(cauph, that.cauph) &&
                Objects.equals(caupm, that.caupm) &&
                Objects.equals(tguph, that.tguph) &&
                Objects.equals(tgupm, that.tgupm) &&
                Objects.equals(cust, that.cust) &&
                Objects.equals(custNm, that.custNm) &&
                Objects.equals(actgb, that.actgb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fact, factnm, sosk, sosknm, wrkct, wrkds, rut, ruth, mch, mce, manto, manpo, cauph, caupm, tguph, tgupm, tgrat, cust, custNm, actgb);
    }
}
