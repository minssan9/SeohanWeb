package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

@Table(name = "ROUTGPF", schema = "SBLIB", catalog = "")
public class RoutgpfEntity {
    private String itmno;
    private String wrkct;
    private BigInteger level1;
    private int level2;
    private int pallet;
    private String fill;
    private BigDecimal cauph;
    private BigDecimal caupm;
    private BigDecimal manto;
    private String actgb;
    private String ipwh;

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
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
    @Column(name = "LEVEL1", nullable = false, precision = 0)
    public BigInteger getLevel1() {
        return level1;
    }

    public void setLevel1(BigInteger level1) {
        this.level1 = level1;
    }

    @Basic
    @Column(name = "LEVEL2", nullable = false, precision = 0)
    public int getLevel2() {
        return level2;
    }

    public void setLevel2(int level2) {
        this.level2 = level2;
    }

    @Basic
    @Column(name = "PALLET", nullable = false, precision = 0)
    public int getPallet() {
        return pallet;
    }

    public void setPallet(int pallet) {
        this.pallet = pallet;
    }

    @Basic
    @Column(name = "FILL", nullable = true, length = 20)
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
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
    @Column(name = "MANTO", nullable = false, precision = 2)
    public BigDecimal getManto() {
        return manto;
    }

    public void setManto(BigDecimal manto) {
        this.manto = manto;
    }

    @Basic
    @Column(name = "ACTGB", nullable = false, length = 20)
    public String getActgb() {
        return actgb;
    }

    public void setActgb(String actgb) {
        this.actgb = actgb;
    }

    @Basic
    @Column(name = "IPWH", nullable = false, length = 20)
    public String getIpwh() {
        return ipwh;
    }

    public void setIpwh(String ipwh) {
        this.ipwh = ipwh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoutgpfEntity that = (RoutgpfEntity) o;
        return level2 == that.level2 &&
                pallet == that.pallet &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(level1, that.level1) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(cauph, that.cauph) &&
                Objects.equals(caupm, that.caupm) &&
                Objects.equals(manto, that.manto) &&
                Objects.equals(actgb, that.actgb) &&
                Objects.equals(ipwh, that.ipwh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, wrkct, level1, level2, pallet, fill, cauph, caupm, manto, actgb, ipwh);
    }
}
