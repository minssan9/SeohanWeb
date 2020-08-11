package com.seohan.erp.mat.Domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ItmblpfhisEntityPK implements Serializable {
    private String gubn;
    private String itmno;
    private String warhs;
    private String locat;
    private String indate;

    @Column(name = "GUBN", nullable = false, length = 5)
    @Id
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Column(name = "ITMNO", nullable = false, length = 15)
    @Id
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Column(name = "WARHS", nullable = false, length = 5)
    @Id
    public String getWarhs() {
        return warhs;
    }

    public void setWarhs(String warhs) {
        this.warhs = warhs;
    }

    @Column(name = "LOCAT", nullable = false, length = 4)
    @Id
    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
    }

    @Column(name = "INDATE", nullable = false, length = 8)
    @Id
    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmblpfhisEntityPK that = (ItmblpfhisEntityPK) o;
        return Objects.equals(gubn, that.gubn) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(warhs, that.warhs) &&
                Objects.equals(locat, that.locat) &&
                Objects.equals(indate, that.indate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, itmno, warhs, locat, indate);
    }
}
