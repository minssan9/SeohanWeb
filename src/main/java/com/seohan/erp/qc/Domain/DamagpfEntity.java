package com.seohan.erp.qc.Domain;

import com.seohan.erp.fta.Domain.PoDetailId;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@IdClass(DamagpfEntity.class)
@Table(name = "DAMAGPF", schema = "SMLIB", catalog = "")
public class DamagpfEntity implements Serializable {
    @Id
    private String jdate;
    @Id
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
