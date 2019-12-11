package com.seohan.general.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(Line.class)
@Table(name = "WRKCTPF", schema = "SBLIB")
public class Line implements Serializable {
	@Id
	private String WRKCT;
	@Id
	private String WRKDS;
	private Double MANTO;
	private Double MANPO;
	private Double CAUPH;
	private Double CAUPM;
	private Double TGUPH;
	private Double TGUPM;
	private Double TGRAT;
	private String FACT;
	private String CUST;
	private String SOSK;
	private String NLINE;
	private String ACTGB;
	private String OLDLINE;
	private String OPGB;
	private String MODI;
}