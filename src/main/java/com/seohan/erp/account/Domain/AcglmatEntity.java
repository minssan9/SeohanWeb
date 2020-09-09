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
@Table(name = "ACGLMAT", schema = "SCLIB", catalog = "")
public class AcglmatEntity {
    private long id;
    private String docuno;
    private String yymm;
    private String planresult;
    private String typepc;
    private String itmno;
    private String itmNm;
    private String typemny;
    private String unitGae;
    private BigDecimal unitAmt;
    private String flagsum;
    private String wrkct;
    private String ref1;
    private String ref2;
    private String docukey;

    @Basic
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DOCUNO", nullable = false, length = 30)
    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno;
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
    @Column(name = "PLANRESULT", nullable = true, length = 5)
    public String getPlanresult() {
        return planresult;
    }

    public void setPlanresult(String planresult) {
        this.planresult = planresult;
    }

    @Basic
    @Column(name = "TYPEPC", nullable = true, length = 5)
    public String getTypepc() {
        return typepc;
    }

    public void setTypepc(String typepc) {
        this.typepc = typepc;
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
    @Column(name = "TYPEMNY", nullable = true, length = 5)
    public String getTypemny() {
        return typemny;
    }

    public void setTypemny(String typemny) {
        this.typemny = typemny;
    }

    @Basic
    @Column(name = "UNIT_GAE", nullable = true, length = 15)
    public String getUnitGae() {
        return unitGae;
    }

    public void setUnitGae(String unitGae) {
        this.unitGae = unitGae;
    }

    @Basic
    @Column(name = "UNIT_AMT", nullable = true, precision = 1)
    public BigDecimal getUnitAmt() {
        return unitAmt;
    }

    public void setUnitAmt(BigDecimal unitAmt) {
        this.unitAmt = unitAmt;
    }

    @Basic
    @Column(name = "FLAGSUM", nullable = true, length = 5)
    public String getFlagsum() {
        return flagsum;
    }

    public void setFlagsum(String flagsum) {
        this.flagsum = flagsum;
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
        AcglmatEntity that = (AcglmatEntity) o;
        return id == that.id &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(yymm, that.yymm) &&
                Objects.equals(planresult, that.planresult) &&
                Objects.equals(typepc, that.typepc) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(itmNm, that.itmNm) &&
                Objects.equals(typemny, that.typemny) &&
                Objects.equals(unitGae, that.unitGae) &&
                Objects.equals(unitAmt, that.unitAmt) &&
                Objects.equals(flagsum, that.flagsum) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(ref1, that.ref1) &&
                Objects.equals(ref2, that.ref2) &&
                Objects.equals(docukey, that.docukey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docuno, yymm, planresult, typepc, itmno, itmNm, typemny, unitGae, unitAmt, flagsum, wrkct, ref1, ref2, docukey);
    }
}
