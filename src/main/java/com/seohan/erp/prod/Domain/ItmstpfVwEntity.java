package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "ITMSTPF_VW", schema = "SBLIB", catalog = "")
public class ItmstpfVwEntity {
    private String itmno;
    private String dscrp;
    private String spcds;
    private String pumgb;
    private String pumgbds;
    private String chjgb;
    private String chjgbds;
    private String pmjgb;
    private String pmjgbds;
    private String saygu;
    private String sayguds;
    private String chagb;
    private String chagbds;
    private String actgb;
    private String actgbds;

    @Basic
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "DSCRP", nullable = false, length = 50)
    public String getDscrp() {
        return dscrp;
    }

    public void setDscrp(String dscrp) {
        this.dscrp = dscrp;
    }

    @Basic
    @Column(name = "SPCDS", nullable = false, length = 100)
    public String getSpcds() {
        return spcds;
    }

    public void setSpcds(String spcds) {
        this.spcds = spcds;
    }

    @Basic
    @Column(name = "PUMGB", nullable = false, length = 1)
    public String getPumgb() {
        return pumgb;
    }

    public void setPumgb(String pumgb) {
        this.pumgb = pumgb;
    }

    @Basic
    @Column(name = "PUMGBDS", nullable = false, length = 50)
    public String getPumgbds() {
        return pumgbds;
    }

    public void setPumgbds(String pumgbds) {
        this.pumgbds = pumgbds;
    }

    @Basic
    @Column(name = "CHJGB", nullable = false, length = 3)
    public String getChjgb() {
        return chjgb;
    }

    public void setChjgb(String chjgb) {
        this.chjgb = chjgb;
    }

    @Basic
    @Column(name = "CHJGBDS", nullable = false, length = 50)
    public String getChjgbds() {
        return chjgbds;
    }

    public void setChjgbds(String chjgbds) {
        this.chjgbds = chjgbds;
    }

    @Basic
    @Column(name = "PMJGB", nullable = false, length = 2)
    public String getPmjgb() {
        return pmjgb;
    }

    public void setPmjgb(String pmjgb) {
        this.pmjgb = pmjgb;
    }

    @Basic
    @Column(name = "PMJGBDS", nullable = false, length = 50)
    public String getPmjgbds() {
        return pmjgbds;
    }

    public void setPmjgbds(String pmjgbds) {
        this.pmjgbds = pmjgbds;
    }

    @Basic
    @Column(name = "SAYGU", nullable = false, length = 1)
    public String getSaygu() {
        return saygu;
    }

    public void setSaygu(String saygu) {
        this.saygu = saygu;
    }

    @Basic
    @Column(name = "SAYGUDS", nullable = false, length = 50)
    public String getSayguds() {
        return sayguds;
    }

    public void setSayguds(String sayguds) {
        this.sayguds = sayguds;
    }

    @Basic
    @Column(name = "CHAGB", nullable = false, length = 1)
    public String getChagb() {
        return chagb;
    }

    public void setChagb(String chagb) {
        this.chagb = chagb;
    }

    @Basic
    @Column(name = "CHAGBDS", nullable = false, length = 50)
    public String getChagbds() {
        return chagbds;
    }

    public void setChagbds(String chagbds) {
        this.chagbds = chagbds;
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
    @Column(name = "ACTGBDS", nullable = false, length = 50)
    public String getActgbds() {
        return actgbds;
    }

    public void setActgbds(String actgbds) {
        this.actgbds = actgbds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmstpfVwEntity that = (ItmstpfVwEntity) o;
        return Objects.equals(itmno, that.itmno) &&
                Objects.equals(dscrp, that.dscrp) &&
                Objects.equals(spcds, that.spcds) &&
                Objects.equals(pumgb, that.pumgb) &&
                Objects.equals(pumgbds, that.pumgbds) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(chjgbds, that.chjgbds) &&
                Objects.equals(pmjgb, that.pmjgb) &&
                Objects.equals(pmjgbds, that.pmjgbds) &&
                Objects.equals(saygu, that.saygu) &&
                Objects.equals(sayguds, that.sayguds) &&
                Objects.equals(chagb, that.chagb) &&
                Objects.equals(chagbds, that.chagbds) &&
                Objects.equals(actgb, that.actgb) &&
                Objects.equals(actgbds, that.actgbds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, dscrp, spcds, pumgb, pumgbds, chjgb, chjgbds, pmjgb, pmjgbds, saygu, sayguds, chagb, chagbds, actgb, actgbds);
    }
}
