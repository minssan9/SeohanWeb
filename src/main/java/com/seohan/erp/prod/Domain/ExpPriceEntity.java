package com.seohan.erp.prod.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "EXP_PRICE", schema = "SBLIB", catalog = "")
public class ExpPriceEntity {
    private int id;
    private String docuno;
    private String yymm;
    private String wrkct;
    private String custcd;
    private String custtype;
    private String pricetype;
    private int prdqty;
    private double ct;
    private double opratio;
    private String workshift;
    private double dayto;
    private double ngtto;
    private int workpo;
    private double manager;
    private double unitprice;
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
    @Column(name = "PRDQTY", nullable = false)
    public int getPrdqty() {
        return prdqty;
    }

    public void setPrdqty(int prdqty) {
        this.prdqty = prdqty;
    }

    @Basic
    @Column(name = "CT", nullable = false, precision = 0)
    public double getCt() {
        return ct;
    }

    public void setCt(double ct) {
        this.ct = ct;
    }

    @Basic
    @Column(name = "OPRATIO", nullable = false, precision = 0)
    public double getOpratio() {
        return opratio;
    }

    public void setOpratio(double opratio) {
        this.opratio = opratio;
    }

    @Basic
    @Column(name = "WORKSHIFT", nullable = false, length = 5)
    public String getWorkshift() {
        return workshift;
    }

    public void setWorkshift(String workshift) {
        this.workshift = workshift;
    }

    @Basic
    @Column(name = "DAYTO", nullable = false, precision = 0)
    public double getDayto() {
        return dayto;
    }

    public void setDayto(double dayto) {
        this.dayto = dayto;
    }

    @Basic
    @Column(name = "NGTTO", nullable = false, precision = 0)
    public double getNgtto() {
        return ngtto;
    }

    public void setNgtto(double ngtto) {
        this.ngtto = ngtto;
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
    @Column(name = "UNITPRICE", nullable = false, precision = 0)
    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
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
        ExpPriceEntity that = (ExpPriceEntity) o;
        return id == that.id &&
                prdqty == that.prdqty &&
                Double.compare(that.ct, ct) == 0 &&
                Double.compare(that.opratio, opratio) == 0 &&
                Double.compare(that.dayto, dayto) == 0 &&
                Double.compare(that.ngtto, ngtto) == 0 &&
                workpo == that.workpo &&
                Double.compare(that.manager, manager) == 0 &&
                Double.compare(that.unitprice, unitprice) == 0 &&
                Objects.equals(docuno, that.docuno) &&
                Objects.equals(yymm, that.yymm) &&
                Objects.equals(wrkct, that.wrkct) &&
                Objects.equals(custcd, that.custcd) &&
                Objects.equals(custtype, that.custtype) &&
                Objects.equals(pricetype, that.pricetype) &&
                Objects.equals(workshift, that.workshift) &&
                Objects.equals(filetx, that.filetx) &&
                Objects.equals(notetx, that.notetx) &&
                Objects.equals(stat, that.stat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docuno, yymm, wrkct, custcd, custtype, pricetype, prdqty, ct, opratio, workshift, dayto, ngtto, workpo, manager, unitprice, filetx, notetx, stat);
    }
}
