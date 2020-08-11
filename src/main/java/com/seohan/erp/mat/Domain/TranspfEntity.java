package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "TRANSPF", schema = "SMLIB", catalog = "")
public class TranspfEntity {
    private String itmno;
    private String warhs;
    private String trscd;
    private String trsdt;
    private int serno;
    private int qunty;
    private BigDecimal weigt;
    private BigDecimal money;
    private String trgae;
    private String locat;
    private String lotno;
    private String cstcd;
    private String ref01;
    private String ref02;
    private String stats;
    private String fill;

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
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
    @Column(name = "TRSCD", nullable = false, length = 2)
    public String getTrscd() {
        return trscd;
    }

    public void setTrscd(String trscd) {
        this.trscd = trscd;
    }

    @Basic
    @Column(name = "TRSDT", nullable = false, length = 8)
    public String getTrsdt() {
        return trsdt;
    }

    public void setTrsdt(String trsdt) {
        this.trsdt = trsdt;
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
    @Column(name = "QUNTY", nullable = false, precision = 0)
    public int getQunty() {
        return qunty;
    }

    public void setQunty(int qunty) {
        this.qunty = qunty;
    }

    @Basic
    @Column(name = "WEIGT", nullable = false, precision = 3)
    public BigDecimal getWeigt() {
        return weigt;
    }

    public void setWeigt(BigDecimal weigt) {
        this.weigt = weigt;
    }

    @Basic
    @Column(name = "MONEY", nullable = false, precision = 1)
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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
    @Column(name = "LOTNO", nullable = false, length = 12)
    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno;
    }

    @Basic
    @Column(name = "CSTCD", nullable = false, length = 5)
    public String getCstcd() {
        return cstcd;
    }

    public void setCstcd(String cstcd) {
        this.cstcd = cstcd;
    }

    @Basic
    @Column(name = "REF01", nullable = false, length = 100)
    public String getRef01() {
        return ref01;
    }

    public void setRef01(String ref01) {
        this.ref01 = ref01;
    }

    @Basic
    @Column(name = "REF02", nullable = false, length = 100)
    public String getRef02() {
        return ref02;
    }

    public void setRef02(String ref02) {
        this.ref02 = ref02;
    }

    @Basic
    @Column(name = "STATS", nullable = false, length = 1)
    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
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
        TranspfEntity that = (TranspfEntity) o;
        return serno == that.serno &&
                qunty == that.qunty &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(trscd, that.trscd) &&
                Objects.equals(trsdt, that.trsdt) &&
                Objects.equals(weigt, that.weigt) &&
                Objects.equals(money, that.money) &&
                Objects.equals(trgae, that.trgae) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(ref01, that.ref01) &&
                Objects.equals(ref02, that.ref02) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, warhs, trscd, trsdt, serno, qunty, weigt, money, trgae, locat, lotno, cstcd, ref01, ref02, stats, fill);
    }
}
