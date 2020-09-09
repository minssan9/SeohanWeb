package com.seohan.erp.account.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@Table(name = "ACGAINLOSS", schema = "SCLIB", catalog = "")
public class AcgainlossEntity {
    private String docuno;
    private String sellarea;
    private String class1;
    private String class2;
    private String yymm;
    private String custCd;
    private String itmno;
    private String itmNm;
    private String chjgb;
    private String pumgb;
    private String pmjgb;
    private BigDecimal qty;
    private BigDecimal unitAmt;
    private BigDecimal supplyAmt;
    private String ref1;
    private String ref2;
    private String docukey;

    @Basic
    @Column(name = "DOCUNO", nullable = false, length = 30)
    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno;
    }

    @Basic
    @Column(name = "SELLAREA", nullable = true, length = 10)
    public String getSellarea() {
        return sellarea;
    }

    public void setSellarea(String sellarea) {
        this.sellarea = sellarea;
    }

    @Basic
    @Column(name = "CLASS1", nullable = true, length = 5)
    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @Basic
    @Column(name = "CLASS2", nullable = true, length = 5)
    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }

    @Basic
    @Column(name = "YYMM", nullable = false, length = 6)
    public String getYymm() {
        return yymm;
    }

    public void setYymm(String yymm) {
        this.yymm = yymm;
    }

    @Basic
    @Column(name = "CUST_CD", nullable = false, length = 30)
    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd;
    }

    @Basic
    @Column(name = "ITMNO", nullable = true, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "ITM_NM", nullable = true, length = 100)
    public String getItmNm() {
        return itmNm;
    }

    public void setItmNm(String itmNm) {
        this.itmNm = itmNm;
    }

    @Basic
    @Column(name = "CHJGB", nullable = true, length = 100)
    public String getChjgb() {
        return chjgb;
    }

    public void setChjgb(String chjgb) {
        this.chjgb = chjgb;
    }

    @Basic
    @Column(name = "PUMGB", nullable = true, length = 100)
    public String getPumgb() {
        return pumgb;
    }

    public void setPumgb(String pumgb) {
        this.pumgb = pumgb;
    }

    @Basic
    @Column(name = "PMJGB", nullable = true, length = 100)
    public String getPmjgb() {
        return pmjgb;
    }

    public void setPmjgb(String pmjgb) {
        this.pmjgb = pmjgb;
    }

    @Basic
    @Column(name = "QTY", nullable = true, precision = 3)
    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "UNIT_AMT", nullable = true, precision = 3)
    public BigDecimal getUnitAmt() {
        return unitAmt;
    }

    public void setUnitAmt(BigDecimal unitAmt) {
        this.unitAmt = unitAmt;
    }

    @Basic
    @Column(name = "SUPPLY_AMT", nullable = true, precision = 3)
    public BigDecimal getSupplyAmt() {
        return supplyAmt;
    }

    public void setSupplyAmt(BigDecimal supplyAmt) {
        this.supplyAmt = supplyAmt;
    }

    @Basic
    @Column(name = "REF1", nullable = true, length = 300)
    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    @Basic
    @Column(name = "REF2", nullable = true, length = 300)
    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    @Basic
    @Column(name = "DOCUKEY", nullable = false, length = 80)
    public String getDocukey() {
        return docukey;
    }

    public void setDocukey(String docukey) {
        this.docukey = docukey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcgainlossEntity that = (AcgainlossEntity) o;
        return Objects.equals(docuno, that.docuno) &&
                Objects.equals(sellarea, that.sellarea) &&
                Objects.equals(class1, that.class1) &&
                Objects.equals(class2, that.class2) &&
                Objects.equals(yymm, that.yymm) &&
                Objects.equals(custCd, that.custCd) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(itmNm, that.itmNm) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(pumgb, that.pumgb) &&
                Objects.equals(pmjgb, that.pmjgb) &&
                Objects.equals(qty, that.qty) &&
                Objects.equals(unitAmt, that.unitAmt) &&
                Objects.equals(supplyAmt, that.supplyAmt) &&
                Objects.equals(ref1, that.ref1) &&
                Objects.equals(ref2, that.ref2) &&
                Objects.equals(docukey, that.docukey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docuno, sellarea, class1, class2, yymm, custCd, itmno, itmNm, chjgb, pumgb, pmjgb, qty, unitAmt, supplyAmt, ref1, ref2, docukey);
    }
}
