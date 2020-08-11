package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "LOTIN", schema = "SMLIB", catalog = "")
public class LotinEntity {
    private String line;
    private String itmno;
    private String inTime;
    private String tagno;
    private String lotno;
    private int inQty;
    private int jQty;
    private String bigo;

    @Basic
    @Column(name = "LINE", nullable = false, length = 5)
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "IN_TIME", nullable = false, length = 14)
    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    @Basic
    @Column(name = "TAGNO", nullable = false, length = 70)
    public String getTagno() {
        return tagno;
    }

    public void setTagno(String tagno) {
        this.tagno = tagno;
    }

    @Basic
    @Column(name = "LOTNO", nullable = false, length = 10)
    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno;
    }

    @Basic
    @Column(name = "IN_QTY", nullable = false, precision = 0)
    public int getInQty() {
        return inQty;
    }

    public void setInQty(int inQty) {
        this.inQty = inQty;
    }

    @Basic
    @Column(name = "J_QTY", nullable = false, precision = 0)
    public int getjQty() {
        return jQty;
    }

    public void setjQty(int jQty) {
        this.jQty = jQty;
    }

    @Basic
    @Column(name = "BIGO", nullable = false, length = 50)
    public String getBigo() {
        return bigo;
    }

    public void setBigo(String bigo) {
        this.bigo = bigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LotinEntity that = (LotinEntity) o;
        return inQty == that.inQty &&
                jQty == that.jQty &&
                Objects.equals(line, that.line) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(tagno, that.tagno) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(bigo, that.bigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, itmno, inTime, tagno, lotno, inQty, jQty, bigo);
    }
}
