package com.seohan.erp.mat.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "JUNPYAP", schema = "SMLIB", catalog = "")
public class JunpyapEntity {
    private String gubn;
    private String rdate;
    private int serno;
    private String status;
    private String cstcd;
    private String tofact;
    private String msabn;
    private String mdate;
    private String mtim;
    private String usabn;
    private String udate;
    private String utime;
    private String fill;

    @Basic
    @Column(name = "GUBN", nullable = false, length = 1)
    public String getGubn() {
        return gubn;
    }

    public void setGubn(String gubn) {
        this.gubn = gubn;
    }

    @Basic
    @Column(name = "RDATE", nullable = false, length = 8)
    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
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
    @Column(name = "STATUS", nullable = false, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "TOFACT", nullable = false, length = 50)
    public String getTofact() {
        return tofact;
    }

    public void setTofact(String tofact) {
        this.tofact = tofact;
    }

    @Basic
    @Column(name = "MSABN", nullable = false, length = 7)
    public String getMsabn() {
        return msabn;
    }

    public void setMsabn(String msabn) {
        this.msabn = msabn;
    }

    @Basic
    @Column(name = "MDATE", nullable = false, length = 8)
    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    @Basic
    @Column(name = "MTIM", nullable = false, length = 4)
    public String getMtim() {
        return mtim;
    }

    public void setMtim(String mtim) {
        this.mtim = mtim;
    }

    @Basic
    @Column(name = "USABN", nullable = false, length = 7)
    public String getUsabn() {
        return usabn;
    }

    public void setUsabn(String usabn) {
        this.usabn = usabn;
    }

    @Basic
    @Column(name = "UDATE", nullable = false, length = 8)
    public String getUdate() {
        return udate;
    }

    public void setUdate(String udate) {
        this.udate = udate;
    }

    @Basic
    @Column(name = "UTIME", nullable = false, length = 4)
    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }

    @Basic
    @Column(name = "FILL", nullable = false, length = 50)
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
        JunpyapEntity that = (JunpyapEntity) o;
        return serno == that.serno &&
                Objects.equals(gubn, that.gubn) &&
                Objects.equals(rdate, that.rdate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(tofact, that.tofact) &&
                Objects.equals(msabn, that.msabn) &&
                Objects.equals(mdate, that.mdate) &&
                Objects.equals(mtim, that.mtim) &&
                Objects.equals(usabn, that.usabn) &&
                Objects.equals(udate, that.udate) &&
                Objects.equals(utime, that.utime) &&
                Objects.equals(fill, that.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gubn, rdate, serno, status, cstcd, tofact, msabn, mdate, mtim, usabn, udate, utime, fill);
    }
}
