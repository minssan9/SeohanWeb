package com.seohan.erp.mat.Domain;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "VUSERPF", schema = "SMLIB", catalog = "")
@IdClass(VuserpfEntityPK.class)
public class VuserpfEntity {
    private String cstcd;
    private String gubun;
    private BigInteger serno;
    private String pswd;
    private String name;
    private String plast;
    private String ulast;
    private String stats;
    private String chkqc;
    private String laut;
    private String stel;
    private String htel;
    private String kofcd;
    private String won;
    private String kum;
    private String sipgo;
    private String sang;
    private String smsNm;

    @Id
    @Column(name = "CSTCD", nullable = false, length = 5)
    public String getCstcd() {
        return cstcd;
    }

    public void setCstcd(String cstcd) {
        this.cstcd = cstcd;
    }

    @Id
    @Column(name = "GUBUN", nullable = false, length = 1)
    public String getGubun() {
        return gubun;
    }

    public void setGubun(String gubun) {
        this.gubun = gubun;
    }

    @Id
    @Column(name = "SERNO", nullable = false, precision = 0)
    public BigInteger getSerno() {
        return serno;
    }

    public void setSerno(BigInteger serno) {
        this.serno = serno;
    }

    @Basic
    @Column(name = "PSWD", nullable = true, length = 8)
    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PLAST", nullable = true, length = 8)
    public String getPlast() {
        return plast;
    }

    public void setPlast(String plast) {
        this.plast = plast;
    }

    @Basic
    @Column(name = "ULAST", nullable = true, length = 8)
    public String getUlast() {
        return ulast;
    }

    public void setUlast(String ulast) {
        this.ulast = ulast;
    }

    @Basic
    @Column(name = "STATS", nullable = true, length = 1)
    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Basic
    @Column(name = "CHKQC", nullable = true, length = 1)
    public String getChkqc() {
        return chkqc;
    }

    public void setChkqc(String chkqc) {
        this.chkqc = chkqc;
    }

    @Basic
    @Column(name = "LAUT", nullable = false, length = 100)
    public String getLaut() {
        return laut;
    }

    public void setLaut(String laut) {
        this.laut = laut;
    }

    @Basic
    @Column(name = "STEL", nullable = false, length = 10)
    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    @Basic
    @Column(name = "HTEL", nullable = false, length = 15)
    public String getHtel() {
        return htel;
    }

    public void setHtel(String htel) {
        this.htel = htel;
    }

    @Basic
    @Column(name = "KOFCD", nullable = false, length = 4)
    public String getKofcd() {
        return kofcd;
    }

    public void setKofcd(String kofcd) {
        this.kofcd = kofcd;
    }

    @Basic
    @Column(name = "WON", nullable = true, length = 1)
    public String getWon() {
        return won;
    }

    public void setWon(String won) {
        this.won = won;
    }

    @Basic
    @Column(name = "KUM", nullable = true, length = 1)
    public String getKum() {
        return kum;
    }

    public void setKum(String kum) {
        this.kum = kum;
    }

    @Basic
    @Column(name = "SIPGO", nullable = true, length = 1)
    public String getSipgo() {
        return sipgo;
    }

    public void setSipgo(String sipgo) {
        this.sipgo = sipgo;
    }

    @Basic
    @Column(name = "SANG", nullable = true, length = 1)
    public String getSang() {
        return sang;
    }

    public void setSang(String sang) {
        this.sang = sang;
    }

    @Basic
    @Column(name = "SMS_NM", nullable = false, length = 30)
    public String getSmsNm() {
        return smsNm;
    }

    public void setSmsNm(String smsNm) {
        this.smsNm = smsNm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VuserpfEntity that = (VuserpfEntity) o;
        return Objects.equals(cstcd, that.cstcd) &&
                Objects.equals(gubun, that.gubun) &&
                Objects.equals(serno, that.serno) &&
                Objects.equals(pswd, that.pswd) &&
                Objects.equals(name, that.name) &&
                Objects.equals(plast, that.plast) &&
                Objects.equals(ulast, that.ulast) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(chkqc, that.chkqc) &&
                Objects.equals(laut, that.laut) &&
                Objects.equals(stel, that.stel) &&
                Objects.equals(htel, that.htel) &&
                Objects.equals(kofcd, that.kofcd) &&
                Objects.equals(won, that.won) &&
                Objects.equals(kum, that.kum) &&
                Objects.equals(sipgo, that.sipgo) &&
                Objects.equals(sang, that.sang) &&
                Objects.equals(smsNm, that.smsNm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cstcd, gubun, serno, pswd, name, plast, ulast, stats, chkqc, laut, stel, htel, kofcd, won, kum, sipgo, sang, smsNm);
    }
}
