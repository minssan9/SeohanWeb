package com.seohan.erp.qc.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "DAMAGPF", schema = "SMLIB", catalog = "")
public class DamagpfEntity {
    private String jdate;
    private int serno;
    private String itmno;
    private int qunty;
    private String dcode;
    private String line;
    private String vend;
    private String jitem;
    private String acode;
    private String adate;
    private String asabn;
    private String bsosk;
    private String bcode;
    private String bdes;
    private String cdate;
    private String csabn;
    private String cdes;
    private String stats;
    private String fill;
    private String dsum;
    private String ddes;
    private String pfchk;
    private String lotno;
    private String aTagno;
    private String bTagno;
    private String bigo;
    private String aql;
    private String ritmno;

    @Basic
    @Column(name = "JDATE", nullable = false, length = 8)
    public String getJdate() {
        return jdate;
    }

    public void setJdate(String jdate) {
        this.jdate = jdate;
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
    @Column(name = "ITMNO", nullable = false, length = 30)
    public String getItmno() {
        return itmno;
    }

    public void setItmno(String itmno) {
        this.itmno = itmno;
    }

    @Basic
    @Column(name = "QUNTY", nullable = false, precision = 0)
    public int getQunty() {
        return qunty;
    }

    public void setQunty(int qunty) {
        this.qunty = qunty;
    }

    @Basic
    @Column(name = "DCODE", nullable = false, length = 5)
    public String getDcode() {
        return dcode;
    }

    public void setDcode(String dcode) {
        this.dcode = dcode;
    }

    @Basic
    @Column(name = "LINE", nullable = false, length = 5)
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Basic
    @Column(name = "VEND", nullable = false, length = 5)
    public String getVend() {
        return vend;
    }

    public void setVend(String vend) {
        this.vend = vend;
    }

    @Basic
    @Column(name = "JITEM", nullable = false, length = 15)
    public String getJitem() {
        return jitem;
    }

    public void setJitem(String jitem) {
        this.jitem = jitem;
    }

    @Basic
    @Column(name = "ACODE", nullable = false, length = 4)
    public String getAcode() {
        return acode;
    }

    public void setAcode(String acode) {
        this.acode = acode;
    }

    @Basic
    @Column(name = "ADATE", nullable = false, length = 14)
    public String getAdate() {
        return adate;
    }

    public void setAdate(String adate) {
        this.adate = adate;
    }

    @Basic
    @Column(name = "ASABN", nullable = false, length = 7)
    public String getAsabn() {
        return asabn;
    }

    public void setAsabn(String asabn) {
        this.asabn = asabn;
    }

    @Basic
    @Column(name = "BSOSK", nullable = false, length = 6)
    public String getBsosk() {
        return bsosk;
    }

    public void setBsosk(String bsosk) {
        this.bsosk = bsosk;
    }

    @Basic
    @Column(name = "BCODE", nullable = false, length = 6)
    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    @Basic
    @Column(name = "BDES", nullable = false, length = 200)
    public String getBdes() {
        return bdes;
    }

    public void setBdes(String bdes) {
        this.bdes = bdes;
    }

    @Basic
    @Column(name = "CDATE", nullable = false, length = 8)
    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    @Basic
    @Column(name = "CSABN", nullable = false, length = 7)
    public String getCsabn() {
        return csabn;
    }

    public void setCsabn(String csabn) {
        this.csabn = csabn;
    }

    @Basic
    @Column(name = "CDES", nullable = false, length = 200)
    public String getCdes() {
        return cdes;
    }

    public void setCdes(String cdes) {
        this.cdes = cdes;
    }

    @Basic
    @Column(name = "STATS", nullable = false, length = 1)
    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Basic
    @Column(name = "FILL", nullable = true, length = 20)
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Basic
    @Column(name = "DSUM", nullable = false, length = 1)
    public String getDsum() {
        return dsum;
    }

    public void setDsum(String dsum) {
        this.dsum = dsum;
    }

    @Basic
    @Column(name = "DDES", nullable = false, length = 200)
    public String getDdes() {
        return ddes;
    }

    public void setDdes(String ddes) {
        this.ddes = ddes;
    }

    @Basic
    @Column(name = "PFCHK", nullable = false, length = 1)
    public String getPfchk() {
        return pfchk;
    }

    public void setPfchk(String pfchk) {
        this.pfchk = pfchk;
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
    @Column(name = "A_TAGNO", nullable = false, length = 100)
    public String getaTagno() {
        return aTagno;
    }

    public void setaTagno(String aTagno) {
        this.aTagno = aTagno;
    }

    @Basic
    @Column(name = "B_TAGNO", nullable = false, length = 100)
    public String getbTagno() {
        return bTagno;
    }

    public void setbTagno(String bTagno) {
        this.bTagno = bTagno;
    }

    @Basic
    @Column(name = "BIGO", nullable = false, length = 100)
    public String getBigo() {
        return bigo;
    }

    public void setBigo(String bigo) {
        this.bigo = bigo;
    }

    @Basic
    @Column(name = "AQL", nullable = true, length = 1)
    public String getAql() {
        return aql;
    }

    public void setAql(String aql) {
        this.aql = aql;
    }

    @Basic
    @Column(name = "RITMNO", nullable = true, length = 20)
    public String getRitmno() {
        return ritmno;
    }

    public void setRitmno(String ritmno) {
        this.ritmno = ritmno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DamagpfEntity that = (DamagpfEntity) o;
        return serno == that.serno &&
                qunty == that.qunty &&
                Objects.equals(jdate, that.jdate) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(dcode, that.dcode) &&
                Objects.equals(line, that.line) &&
                Objects.equals(vend, that.vend) &&
                Objects.equals(jitem, that.jitem) &&
                Objects.equals(acode, that.acode) &&
                Objects.equals(adate, that.adate) &&
                Objects.equals(asabn, that.asabn) &&
                Objects.equals(bsosk, that.bsosk) &&
                Objects.equals(bcode, that.bcode) &&
                Objects.equals(bdes, that.bdes) &&
                Objects.equals(cdate, that.cdate) &&
                Objects.equals(csabn, that.csabn) &&
                Objects.equals(cdes, that.cdes) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(dsum, that.dsum) &&
                Objects.equals(ddes, that.ddes) &&
                Objects.equals(pfchk, that.pfchk) &&
                Objects.equals(lotno, that.lotno) &&
                Objects.equals(aTagno, that.aTagno) &&
                Objects.equals(bTagno, that.bTagno) &&
                Objects.equals(bigo, that.bigo) &&
                Objects.equals(aql, that.aql) &&
                Objects.equals(ritmno, that.ritmno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jdate, serno, itmno, qunty, dcode, line, vend, jitem, acode, adate, asabn, bsosk, bcode, bdes, cdate, csabn, cdes, stats, fill, dsum, ddes, pfchk, lotno, aTagno, bTagno, bigo, aql, ritmno);
    }
}
