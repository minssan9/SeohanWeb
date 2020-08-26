package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "EXP_COST", schema = "SBLIB", catalog = "")
public class ExpCostEntity {
    private int id;
    private String docuno;
    private String yymm;
    private String wrkct;
    private String custcd;
    private String custtype;
    private String pricetype;
    private double unitprice;
    private int prdqty;
    private double prdmny;
    private int workpo;
    private double manager;
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
    @Column(name = "WRKCT", nullable = false, length = 10)
    public String getWrkct() {
        return wrkct;
    }

    public void setWrkct(String wrkct) {
        this.wrkct = wrkct;
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
    @Column(name = "CUSTTYPE", nullable = false, length = 5)
    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    @Basic
    @Column(name = "PRICETYPE", nullable = false, length = 10)
    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype;
    }

    @Basic
    @Column(name = "UNITPRICE", nullable = false, precision = 0)
    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    @Basic
    @Column(name = "PRDQTY", nullable = false)
    public int getPrdqty() {
        return prdqty;
    }

    public void setPrdqty(int prdqty) {
        this.prdqty = prdqty;
    }

    @Basic
    @Column(name = "PRDMNY", nullable = false, precision = 0)
    public double getPrdmny() {
        return prdmny;
    }

    public void setPrdmny(double prdmny) {
        this.prdmny = prdmny;
    }

    @Basic
    @Column(name = "WORKPO", nullable = false)
    public int getWorkpo() {
        return workpo;
    }

    public void setWorkpo(int workpo) {
        this.workpo = workpo;
    }

    @Basic
    @Column(name = "MANAGER", nullable = false, precision = 0)
    public double getManager() {
        return manager;
    }

    public void setManager(double manager) {
        this.manager = manager;
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
        ExpCostEntity that = (ExpCostEntity) o;
        return id == that.id &&
                Double.compare(that.unitprice, unitprice) == 0 &&
                prdqty == that.prdqty &&
                Double.compare(that.prdmny, prdmny) == 0 &&
                workpo == that.workpo &&
                Double.compare(that.manager, manager) == 0 &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(yymm, that.yymm) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(custcd, that.custcd) &&
                Objects.equals(custtype, that.custtype) &&
                Objects.equals(pricetype, that.pricetype) &&
                Objects.equals(appno, that.appno) &&
                Objects.equals(filetx, that.filetx) &&
                Objects.equals(notetx, that.notetx) &&
                Objects.equals(stat, that.stat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docuno, yymm, wrkct, custcd, custtype, pricetype, unitprice, prdqty, prdmny, workpo, manager, appno, filetx, notetx, stat);
    }
}
