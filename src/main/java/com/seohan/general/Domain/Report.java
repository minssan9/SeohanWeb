package com.seohan.general.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
//@IdClass(Report.class)
@Table(name="SGLIB.PCMSTPF")
public class Report {
	private String FGUB;
	
	@Id
	private String UDATE; 
	private String SER;
	
	private String UTIME;
	private String LINE;
	private String RUT;
	private String SGUB;
	private String USABN;
	private String UDES;
	private String DSABN;
	private String SDATE;
	private String STIME;
	private String EDATE;
	private String ETIME;
	private String BPMTD;
	private String FTCOD;
	private String FTDES;
	private String FOURM;
	private String BSDES;
	private String GJDES;
	private String SMSCHK1;
	private String SMSCHK2;
	private String CONTENT;
	private String STAT;
	private String FILL;
}
