package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "EXP_APPR", schema = "SBLIB", catalog = "")
public class ExpApprEntity {
    private int id;
    private String docuno;
    private String yymm;
    private String custcd;
    private String appno;
    private String filetx;
    private String notetx;
    private String stat;

    @Basic
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DOCUNO", nullable = false, length = 20)
    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno;
    }

    @Basic
    @Column(name = "YYMM", nullable = false, length = 6)
    public String getYymm() {
        return yymm;
    }

    public void setYymm(String yymm) {
        this.yymm = yymm;
    }

    @Basic
    @Column(name = "CUSTCD", nullable = false, length = 5)
    public String getCustcd() {
        return custcd;
    }

    public void setCustcd(String custcd) {
        this.custcd = custcd;
    }

    @Basic
    @Column(name = "APPNO", nullable = true, length = 200)
    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    @Basic
    @Column(name = "FILETX", nullable = true, length = 200)
    public String getFiletx() {
        return filetx;
    }

    public void setFiletx(String filetx) {
        this.filetx = filetx;
    }

    @Basic
    @Column(name = "NOTETX", nullable = true, length = 200)
    public String getNotetx() {
        return notetx;
    }

    public void setNotetx(String notetx) {
        this.notetx = notetx;
    }

    @Basic
    @Column(name = "STAT", nullable = false, length = 5)
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
        ExpApprEntity that = (ExpApprEntity) o;
        return id == that.id &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(yymm, that.yymm) &&
                Objects.equals(custcd, that.custcd) &&
                Objects.equals(appno, that.appno) &&
                Objects.equals(filetx, that.filetx) &&
                Objects.equals(notetx, that.notetx) &&
                Objects.equals(stat, that.stat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docuno, yymm, custcd, appno, filetx, notetx, stat);
    }
}
