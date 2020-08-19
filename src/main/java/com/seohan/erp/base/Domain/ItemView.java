package com.seohan.erp.base.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
// @Immutable
@Table(name = "ITMSTPF_VW", schema = "SMLIB")
public class ItemView implements Serializable {
	@Id 
	private String itmno;
	private String dscrp;
	private String spcds;
	private String units;
	private Double untwg;
	private String pumgb;
	private Double pllut;
	private String chjgb;
	private String pmjgb;
	private String autmt;
	private String absgb;
	private Double baecc;
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
	private String fill	;
	private String pmsgb;
	private String mcgb	;
	private String etgb	;
	private Double wpie	;
	private Double wlen	;
	private String pummock				;
	private String chajong				;
	private String pumjong				;
	private String automnu				;
	private String absgubn				;
	private String sayang				;
	private String lhrhgub				;
	private String chadae				;
	private String hwapye				;
	private String cusna				;
	private String sopumjong			;
	private String maepum				;
}
