package com.seohan.erp.base.Domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ITM_VW", schema = "SMLIB", catalog = "")
public class ItmVwEntity {
    private String itmno;
    private String dscrp;
    private String spcds;
    private String units;
    private BigDecimal untwg;
    private String pumgb;
    private int pllut;
    private String chjgb;
    private String pmjgb;
    private String autmt;
    private String absgb;
    private int baecc;
    private String saygu;
    private String chagb;
    private String lrhgb;
    private String alccd;
    private String sangp;
    private String mater;
    private String dwgno;
    private String qcgub;
    private String lctno;
    private String mnygb;
    private String cstcd;
    private String actgb;
    private String fill;
    private String pmsgb;
    private String mcgb;
    private String etgb;
    private BigDecimal wpie;
    private BigDecimal wlen;
    private String assytype;
    private String cartype;
    private String itemtype2;
    private String missiontype;
    private String abstype;
    private String spectype;
    private String lhrhtype;
    private String parttype;
    private String curtype;
    private String cusna;
    private String itemtype3;
    private String actflag;
    private String saleitm;

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
    @Column(name = "UNITS", nullable = false, length = 2)
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Basic
    @Column(name = "UNTWG", nullable = false, precision = 4)
    public BigDecimal getUntwg() {
        return untwg;
    }

    public void setUntwg(BigDecimal untwg) {
        this.untwg = untwg;
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
    @Column(name = "PLLUT", nullable = false, precision = 0)
    public int getPllut() {
        return pllut;
    }

    public void setPllut(int pllut) {
        this.pllut = pllut;
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
    @Column(name = "PMJGB", nullable = false, length = 2)
    public String getPmjgb() {
        return pmjgb;
    }

    public void setPmjgb(String pmjgb) {
        this.pmjgb = pmjgb;
    }

    @Basic
    @Column(name = "AUTMT", nullable = false, length = 1)
    public String getAutmt() {
        return autmt;
    }

    public void setAutmt(String autmt) {
        this.autmt = autmt;
    }

    @Basic
    @Column(name = "ABSGB", nullable = false, length = 1)
    public String getAbsgb() {
        return absgb;
    }

    public void setAbsgb(String absgb) {
        this.absgb = absgb;
    }

    @Basic
    @Column(name = "BAECC", nullable = false, precision = 0)
    public int getBaecc() {
        return baecc;
    }

    public void setBaecc(int baecc) {
        this.baecc = baecc;
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
    @Column(name = "CHAGB", nullable = false, length = 1)
    public String getChagb() {
        return chagb;
    }

    public void setChagb(String chagb) {
        this.chagb = chagb;
    }

    @Basic
    @Column(name = "LRHGB", nullable = false, length = 1)
    public String getLrhgb() {
        return lrhgb;
    }

    public void setLrhgb(String lrhgb) {
        this.lrhgb = lrhgb;
    }

    @Basic
    @Column(name = "ALCCD", nullable = false, length = 15)
    public String getAlccd() {
        return alccd;
    }

    public void setAlccd(String alccd) {
        this.alccd = alccd;
    }

    @Basic
    @Column(name = "SANGP", nullable = false, length = 15)
    public String getSangp() {
        return sangp;
    }

    public void setSangp(String sangp) {
        this.sangp = sangp;
    }

    @Basic
    @Column(name = "MATER", nullable = false, length = 50)
    public String getMater() {
        return mater;
    }

    public void setMater(String mater) {
        this.mater = mater;
    }

    @Basic
    @Column(name = "DWGNO", nullable = false, length = 15)
    public String getDwgno() {
        return dwgno;
    }

    public void setDwgno(String dwgno) {
        this.dwgno = dwgno;
    }

    @Basic
    @Column(name = "QCGUB", nullable = false, length = 1)
    public String getQcgub() {
        return qcgub;
    }

    public void setQcgub(String qcgub) {
        this.qcgub = qcgub;
    }

    @Basic
    @Column(name = "LCTNO", nullable = false, length = 100)
    public String getLctno() {
        return lctno;
    }

    public void setLctno(String lctno) {
        this.lctno = lctno;
    }

    @Basic
    @Column(name = "MNYGB", nullable = false, length = 1)
    public String getMnygb() {
        return mnygb;
    }

    public void setMnygb(String mnygb) {
        this.mnygb = mnygb;
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
    @Column(name = "ACTGB", nullable = false, length = 1)
    public String getActgb() {
        return actgb;
    }

    public void setActgb(String actgb) {
        this.actgb = actgb;
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
    @Column(name = "PMSGB", nullable = true, length = 5)
    public String getPmsgb() {
        return pmsgb;
    }

    public void setPmsgb(String pmsgb) {
        this.pmsgb = pmsgb;
    }

    @Basic
    @Column(name = "MCGB", nullable = false, length = 5)
    public String getMcgb() {
        return mcgb;
    }

    public void setMcgb(String mcgb) {
        this.mcgb = mcgb;
    }

    @Basic
    @Column(name = "ETGB", nullable = false, length = 5)
    public String getEtgb() {
        return etgb;
    }

    public void setEtgb(String etgb) {
        this.etgb = etgb;
    }

    @Basic
    @Column(name = "WPIE", nullable = false, precision = 3)
    public BigDecimal getWpie() {
        return wpie;
    }

    public void setWpie(BigDecimal wpie) {
        this.wpie = wpie;
    }

    @Basic
    @Column(name = "WLEN", nullable = false, precision = 3)
    public BigDecimal getWlen() {
        return wlen;
    }

    public void setWlen(BigDecimal wlen) {
        this.wlen = wlen;
    }

    @Basic
    @Column(name = "ASSYTYPE", nullable = false, length = 50)
    public String getAssytype() {
        return assytype;
    }

    public void setAssytype(String assytype) {
        this.assytype = assytype;
    }

    @Basic
    @Column(name = "CARTYPE", nullable = false, length = 50)
    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    @Basic
    @Column(name = "ITEMTYPE2", nullable = false, length = 50)
    public String getItemtype2() {
        return itemtype2;
    }

    public void setItemtype2(String itemtype2) {
        this.itemtype2 = itemtype2;
    }

    @Basic
    @Column(name = "MISSIONTYPE", nullable = false, length = 50)
    public String getMissiontype() {
        return missiontype;
    }

    public void setMissiontype(String missiontype) {
        this.missiontype = missiontype;
    }

    @Basic
    @Column(name = "ABSTYPE", nullable = false, length = 50)
    public String getAbstype() {
        return abstype;
    }

    public void setAbstype(String abstype) {
        this.abstype = abstype;
    }

    @Basic
    @Column(name = "SPECTYPE", nullable = false, length = 50)
    public String getSpectype() {
        return spectype;
    }

    public void setSpectype(String spectype) {
        this.spectype = spectype;
    }

    @Basic
    @Column(name = "LHRHTYPE", nullable = false, length = 50)
    public String getLhrhtype() {
        return lhrhtype;
    }

    public void setLhrhtype(String lhrhtype) {
        this.lhrhtype = lhrhtype;
    }

    @Basic
    @Column(name = "PARTTYPE", nullable = false, length = 50)
    public String getParttype() {
        return parttype;
    }

    public void setParttype(String parttype) {
        this.parttype = parttype;
    }

    @Basic
    @Column(name = "CURTYPE", nullable = false, length = 50)
    public String getCurtype() {
        return curtype;
    }

    public void setCurtype(String curtype) {
        this.curtype = curtype;
    }

    @Basic
    @Column(name = "CUSNA", nullable = false, length = 40)
    public String getCusna() {
        return cusna;
    }

    public void setCusna(String cusna) {
        this.cusna = cusna;
    }

    @Basic
    @Column(name = "ITEMTYPE3", nullable = false, length = 50)
    public String getItemtype3() {
        return itemtype3;
    }

    public void setItemtype3(String itemtype3) {
        this.itemtype3 = itemtype3;
    }

    @Basic
    @Column(name = "ACTFLAG", nullable = false, length = 50)
    public String getActflag() {
        return actflag;
    }

    public void setActflag(String actflag) {
        this.actflag = actflag;
    }

    @Basic
    @Column(name = "SALEITM", nullable = false, length = 50)
    public String getSaleitm() {
        return saleitm;
    }

    public void setSaleitm(String saleitm) {
        this.saleitm = saleitm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItmVwEntity that = (ItmVwEntity) o;
        return pllut == that.pllut &&
                baecc == that.baecc &&
                Objects.equals(itmno, that.itmno) &&
                Objects.equals(dscrp, that.dscrp) &&
                Objects.equals(spcds, that.spcds) &&
                Objects.equals(units, that.units) &&
                Objects.equals(untwg, that.untwg) &&
                Objects.equals(pumgb, that.pumgb) &&
                Objects.equals(chjgb, that.chjgb) &&
                Objects.equals(pmjgb, that.pmjgb) &&
                Objects.equals(autmt, that.autmt) &&
                Objects.equals(absgb, that.absgb) &&
                Objects.equals(saygu, that.saygu) &&
                Objects.equals(chagb, that.chagb) &&
                Objects.equals(lrhgb, that.lrhgb) &&
                Objects.equals(alccd, that.alccd) &&
                Objects.equals(sangp, that.sangp) &&
                Objects.equals(mater, that.mater) &&
                Objects.equals(dwgno, that.dwgno) &&
                Objects.equals(qcgub, that.qcgub) &&
                Objects.equals(lctno, that.lctno) &&
                Objects.equals(mnygb, that.mnygb) &&
                Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(actgb, that.actgb) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(pmsgb, that.pmsgb) &&
                Objects.equals(mcgb, that.mcgb) &&
                Objects.equals(etgb, that.etgb) &&
                Objects.equals(wpie, that.wpie) &&
                Objects.equals(wlen, that.wlen) &&
                Objects.equals(assytype, that.assytype) &&
                Objects.equals(cartype, that.cartype) &&
                Objects.equals(itemtype2, that.itemtype2) &&
                Objects.equals(missiontype, that.missiontype) &&
                Objects.equals(abstype, that.abstype) &&
                Objects.equals(spectype, that.spectype) &&
                Objects.equals(lhrhtype, that.lhrhtype) &&
                Objects.equals(parttype, that.parttype) &&
                Objects.equals(curtype, that.curtype) &&
                Objects.equals(cusna, that.cusna) &&
                Objects.equals(itemtype3, that.itemtype3) &&
                Objects.equals(actflag, that.actflag) &&
                Objects.equals(saleitm, that.saleitm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itmno, dscrp, spcds, units, untwg, pumgb, pllut, chjgb, pmjgb, autmt, absgb, baecc, saygu, chagb, lrhgb, alccd, sangp, mater, dwgno, qcgub, lctno, mnygb, cstcd, actgb, fill, pmsgb, mcgb, etgb, wpie, wlen, assytype, cartype, itemtype2, missiontype, abstype, spectype, lhrhtype, parttype, curtype, cusna, itemtype3, actflag, saleitm);
    }
}
