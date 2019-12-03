package com.seohan.general.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(Report.class)
@Table(name="PCMSTPF", schema="SGLIB")
public class Report implements Serializable {
	private String FGUB;
	
	@Id
	private String udate;
	@Id
	private String ser;
	
	private String utime;
	private String line;
	private String rut;
	private String sgub;
	private String usabn;
	private String udes;
	private String dsabn;
	private String sdate;
	private String stime;
	private String edate;
	private String etime;
	private String bpmtd;
	private String ftcod;
	private String ftdes;
	private String fourm;
	private String bsdes;
	private String gjdes;
	private String smschk1;
	private String smschk2;
	private String content;
	private String stat;
	private String fill;
}
