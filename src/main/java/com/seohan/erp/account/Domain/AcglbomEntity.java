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
@Table(name = "ACGLBOM", schema = "SCLIB", catalog = "")
public class AcglbomEntity {
    private long id;
    private String docuno;
    private String class1;
    private String yymm;
    private String itmno;
    private String pitmno;
    private String citmno;
    private String citmNm;
    private BigDecimal usg;
    private BigDecimal count;

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
    @Column(name = "CLASS1", nullable = true, length = 5)
    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
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
    @Column(name = "ITMNO", nullable = true, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "PITMNO", nullable = true, length = 30)
    public String getPitmno() {
        return pitmno;
    }

    public void setPitmno(String pitmno) {
        this.pitmno = pitmno;
    }

    @Basic
    @Column(name = "CITMNO", nullable = true, length = 30)
    public String getCitmno() {
        return citmno;
    }

    public void setCitmno(String citmno) {
        this.citmno = citmno;
    }

    @Basic
    @Column(name = "CITM_NM", nullable = true, length = 100)
    public String getCitmNm() {
        return citmNm;
    }

    public void setCitmNm(String citmNm) {
        this.citmNm = citmNm;
    }

    @Basic
    @Column(name = "USG", nullable = true, precision = 3)
    public BigDecimal getUsg() {
        return usg;
    }

    public void setUsg(BigDecimal usg) {
        this.usg = usg;
    }

    @Basic
    @Column(name = "COUNT", nullable = true, precision = 3)
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcglbomEntity that = (AcglbomEntity) o;
        return id == that.id &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(class1, that.class1) &&
                Objects.equals(yymm, that.yymm) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(pitmno, that.pitmno) &&
                Objects.equals(citmno, that.citmno) &&
                Objects.equals(citmNm, that.citmNm) &&
                Objects.equals(usg, that.usg) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docuno, class1, yymm, itmno, pitmno, citmno, citmNm, usg, count);
    }
}
