package com.seohan.erp.machine.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "OEE_ERRHIS", schema = "SMLIB", catalog = "")
public class OeeErrhisEntity {
    private long id;
    private String line;
    private String itmno;
    private String kdate;
    private String ktime;
    private int cnt;
    private int gap;
    private Timestamp logTime;
    private String class1;
    private String class2;
    private String class3;
    private String ref1;
    private String ref2;
    private String ref3;
    private String stat;

    @Basic
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LINE", nullable = false, length = 10)
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
    @Column(name = "KDATE", nullable = false, length = 8)
    public String getKdate() {
        return kdate;
    }

    public void setKdate(String kdate) {
        this.kdate = kdate;
    }

    @Basic
    @Column(name = "KTIME", nullable = false, length = 6)
    public String getKtime() {
        return ktime;
    }

    public void setKtime(String ktime) {
        this.ktime = ktime;
    }

    @Basic
    @Column(name = "CNT", nullable = false, precision = 0)
    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Basic
    @Column(name = "GAP", nullable = false, precision = 0)
    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }

    @Basic
    @Column(name = "LOG_TIME", nullable = false)
    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }

    @Basic
    @Column(name = "CLASS1", nullable = false, length = 100)
    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @Basic
    @Column(name = "CLASS2", nullable = false, length = 100)
    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }

    @Basic
    @Column(name = "CLASS3", nullable = false, length = 100)
    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3;
    }

    @Basic
    @Column(name = "REF1", nullable = false, length = 100)
    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    @Basic
    @Column(name = "REF2", nullable = false, length = 100)
    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    @Basic
    @Column(name = "REF3", nullable = false, length = 100)
    public String getRef3() {
        return ref3;
    }

    public void setRef3(String ref3) {
        this.ref3 = ref3;
    }

    @Basic
    @Column(name = "STAT", nullable = false, length = 6)
    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OeeErrhisEntity that = (OeeErrhisEntity) o;
        return id == that.id &&
                cnt == that.cnt &&
                gap == that.gap &&
                Objects.equals(line, that.line) &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(kdate, that.kdate) &&
                Objects.equals(ktime, that.ktime) &&
                Objects.equals(logTime, that.logTime) &&
                Objects.equals(class1, that.class1) &&
                Objects.equals(class2, that.class2) &&
                Objects.equals(class3, that.class3) &&
                Objects.equals(ref1, that.ref1) &&
                Objects.equals(ref2, that.ref2) &&
                Objects.equals(ref3, that.ref3) &&
                Objects.equals(stat, that.stat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, line, itmno, kdate, ktime, cnt, gap, logTime, class1, class2, class3, ref1, ref2, ref3, stat);
    }
}
