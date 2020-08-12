package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Table(name = "WRKCT_VW", schema = "SBLIB", catalog = "")
public class WrkctVwEntity {
    private String wrkct;
    private String wrkds;
    private String fact;
    private String actgb;
    private BigDecimal manto;
    private BigDecimal manpo;
    private BigDecimal cauph;
    private BigDecimal caupm;
    private BigDecimal tguph;
    private BigDecimal tgupm;
    private int tgrat;
    private String cust;
    private String cusna;
    private String sosk;
    private String nline;
    private String oldline;
    private String opgb;
    private String modi;

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
    @Column(name = "FACT", nullable = false, length = 4)
    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    @Basic
    @Column(name = "ACTGB", nullable = false, length = 1)
    public String getActgb() {
        return actgb;
    }

    public void setActgb(String actgb) {
        this.actgb = actgb;
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
    @Column(name = "CUSNA", nullable = false, length = 40)
    public String getCusna() {
        return cusna;
    }

    public void setCusna(String cusna) {
        this.cusna = cusna;
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
    @Column(name = "NLINE", nullable = false, length = 30)
    public String getNline() {
        return nline;
    }

    public void setNline(String nline) {
        this.nline = nline;
    }

    @Basic
    @Column(name = "OLDLINE", nullable = false, length = 4)
    public String getOldline() {
        return oldline;
    }

    public void setOldline(String oldline) {
        this.oldline = oldline;
    }

    @Basic
    @Column(name = "OPGB", nullable = false, length = 30)
    public String getOpgb() {
        return opgb;
    }

    public void setOpgb(String opgb) {
        this.opgb = opgb;
    }

    @Basic
    @Column(name = "MODI", nullable = false, length = 30)
    public String getModi() {
        return modi;
    }

    public void setModi(String modi) {
        this.modi = modi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrkctVwEntity that = (WrkctVwEntity) o;
        return tgrat == that.tgrat &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(wrkds, that.wrkds) &&
                Objects.equals(fact, that.fact) &&
                Objects.equals(actgb, that.actgb) &&
                Objects.equals(manto, that.manto) &&
                Objects.equals(manpo, that.manpo) &&
                Objects.equals(cauph, that.cauph) &&
                Objects.equals(caupm, that.caupm) &&
                Objects.equals(tguph, that.tguph) &&
                Objects.equals(tgupm, that.tgupm) &&
                Objects.equals(cust, that.cust) &&
                Objects.equals(cusna, that.cusna) &&
                Objects.equals(sosk, that.sosk) &&
                Objects.equals(nline, that.nline) &&
                Objects.equals(oldline, that.oldline) &&
                Objects.equals(opgb, that.opgb) &&
                Objects.equals(modi, that.modi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrkct, wrkds, fact, actgb, manto, manpo, cauph, caupm, tguph, tgupm, tgrat, cust, cusna, sosk, nline, oldline, opgb, modi);
    }
}
