package com.seohan.erp.machine.Domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
@Table(name = "OEE_ERRHIS", schema = "SMLIB", catalog = "")
public class OeeErrhisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
