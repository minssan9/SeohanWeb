package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "LOTIN_CHUL", schema = "SMLIB", catalog = "")
public class LotinChulEntity {
    private String line;
    private String gubn;
    private String itmno;
    private String lotno;
    private int jqty;
    private String fill;

    @Basic
    @Column(name = "LINE", nullable = false, length = 10)
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Basic
    @Column(name = "GUBN", nullable = false, length = 1)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 50)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
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
    @Column(name = "JQTY", nullable = false, precision = 0)
    public int getJqty() {
        return jqty;
    }

    public void setJqty(int jqty) {
        this.jqty = jqty;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 30)
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
        LotinChulEntity that = (LotinChulEntity) o;
        return jqty == that.jqty &&
                Objects.equals(line, that.line) &&
                Objects.equals(gubn, that.gubn) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, gubn, itmno, lotno, jqty, fill);
    }
}
