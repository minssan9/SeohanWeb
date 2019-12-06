package com.seohan.general.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(SGateCar.class)
@Table(name = "SGATECAR", schema = "SITLIB")
public class SGateCar implements Serializable {
	@Id
	String jdate;
	@Id
	Long   serno;
	String jsabun;
	String dsabun;
	String jgubn;
	String carno;
	String bsdate;
	String bstim;
	String bedate;
	String betim;
	String hang;
	String pure;
	String tjsabun;
	String tjgdate;
	String cmsabun;
	String cmdate;
	String cmtim;
	String ygubn;
	String yuru;
	String outdate;
	String outtim;
	String indate;
	String intim;
	String sts;
	String fill;
	String spoint;
	String distance;
	String jname;
	String dname;
	String dteam_nm;
	String cogb;
}
