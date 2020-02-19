package com.seohan.base.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
@Table(name = "ITMSTPF_VW", schema = "SMLIB")
public class ItemView implements Serializable {
	@Id 
	private String ITMNO;				
	private String DSCRP;				
	private String SPCDS;				
	private String UNITS;				
	private Double UNTWG;
	private String PUMGB;
	private Double PLLUT;
	private String CHJGB;
	private String PMJGB;
	private String AUTMT;
	private String ABSGB;
	private Double BAECC;
	private String SAYGU; 
	private String CHAGB; 
	private String LRHGB; 
	private String ALCCD; 
	private String SANGP; 
	private String MATER; 
	private String DWGNO; 
	private String QCGUB; 
	private String LCTNO; 
	private String MNYGB; 
	private String CSTCD; 
	private String ACTGB; 
	private String FILL	;			 
	private String PMSGB; 
	private String MCGB	;			 
	private String ETGB	;			 
	private Double WPIE	;			
	private Double WLEN	;			
	private String PUMMOCK				;
	private String CHAJONG				;
	private String PUMJONG				;
	private String AUTOMNU				;
	private String ABSGUBN				;
	private String SAYANG				;
	private String LHRHGUB				;
	private String CHADAE				;
	private String HWAPYE				;
	private String CUSNA				;
	private String SOPUMJONG			;
	private String MAEPUM				; 
}
