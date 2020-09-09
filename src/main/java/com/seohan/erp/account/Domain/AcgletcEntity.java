package com.seohan.erp.account.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;
@Data
@Builder
@AllArgsConstructor
@Table(name = "ACGLETC", schema = "SCLIB", catalog = "")
public class AcgletcEntity {
    private String yymm;
    private String wrkct;
    private String mnytype;
    private String mnyname;
    private BigDecimal price;
    private String ref1;

    @Basic
    @Column(name = "YYMM", nullable = false, length = 6)
    public String getYymm() {
        return yymm;
    }

    public void setYymm(String yymm) {
        this.yymm = yymm;
    }

    @Basic
    @Column(name = "WRKCT", nullable = true, length = 30)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
    }

    @Basic
    @Column(name = "MNYTYPE", nullable = true, length = 10)
    public String getMnytype() {
        return mnytype;
    }

    public void setMnytype(String mnytype) {
        this.mnytype = mnytype;
    }

    @Basic
    @Column(name = "MNYNAME", nullable = true, length = 100)
    public String getMnyname() {
        return mnyname;
    }

    public void setMnyname(String mnyname) {
        this.mnyname = mnyname;
    }

    @Basic
    @Column(name = "PRICE", nullable = true, precision = 1)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "REF1", nullable = true, length = 300)
    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcgletcEntity that = (AcgletcEntity) o;
        return Objects.equals(yymm, that.yymm) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(mnytype, that.mnytype) &&
                Objects.equals(mnyname, that.mnyname) &&
                Objects.equals(price, that.price) &&
                Objects.equals(ref1, that.ref1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yymm, wrkct, mnytype, mnyname, price, ref1);
    }
}
