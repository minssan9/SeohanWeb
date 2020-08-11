package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "SAGBMST", schema = "SMLIB", catalog = "")
public class SagbmstEntity {
    private String gubn;
    private String sitem;
    private String svend;
    private String gitem;
    private String gvend;
    private String fill;
    private String unitGae;
    private String unitDs;
    private String ritem;
    private String stat;
    private int id;

    @Basic
    @Column(name = "GUBN", nullable = false, length = 1)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Basic
    @Column(name = "SITEM", nullable = false, length = 20)
    public String getSitem() {
        return sitem;
    }

    public void setSitem(String sitem) {
        this.sitem = sitem;
    }

    @Basic
    @Column(name = "SVEND", nullable = false, length = 5)
    public String getSvend() {
        return svend;
    }

    public void setSvend(String svend) {
        this.svend = svend;
    }

    @Basic
    @Column(name = "GITEM", nullable = false, length = 20)
    public String getGitem() {
        return gitem;
    }

    public void setGitem(String gitem) {
        this.gitem = gitem;
    }

    @Basic
    @Column(name = "GVEND", nullable = false, length = 5)
    public String getGvend() {
        return gvend;
    }

    public void setGvend(String gvend) {
        this.gvend = gvend;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 20)
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Basic
    @Column(name = "UNIT_GAE", nullable = false, length = 20)
    public String getUnitGae() {
        return unitGae;
    }

    public void setUnitGae(String unitGae) {
        this.unitGae = unitGae;
    }

    @Basic
    @Column(name = "UNIT_DS", nullable = false, length = 40)
    public String getUnitDs() {
        return unitDs;
    }

    public void setUnitDs(String unitDs) {
        this.unitDs = unitDs;
    }

    @Basic
    @Column(name = "RITEM", nullable = false, length = 30)
    public String getRitem() {
        return ritem;
    }

    public void setRitem(String ritem) {
        this.ritem = ritem;
    }

    @Basic
    @Column(name = "STAT", nullable = false, length = 5)
    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Basic
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SagbmstEntity that = (SagbmstEntity) o;
        return id == that.id &&
                Objects.equals(gubn, that.gubn) &&
                Objects.equals(sitem, that.sitem) &&
                Objects.equals(svend, that.svend) &&
                Objects.equals(gitem, that.gitem) &&
                Objects.equals(gvend, that.gvend) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(unitGae, that.unitGae) &&
                Objects.equals(unitDs, that.unitDs) &&
                Objects.equals(ritem, that.ritem) &&
                Objects.equals(stat, that.stat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, sitem, svend, gitem, gvend, fill, unitGae, unitDs, ritem, stat, id);
    }
}
