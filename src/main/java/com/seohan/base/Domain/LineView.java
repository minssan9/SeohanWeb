package com.seohan.base.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(LineView.class)
@Table(name = "WRKCT_VW", schema = "SBLIB")
public class LineView implements Serializable {
	@Id
	private String wrkct;
	@Id
	private String wrkds;
	private Double manto;
	private Double manpo;
	private Double cauph;
	private Double caupm;
	private Double tguph;
	private Double tgupm;
	private Double tgrat;
	private String fact;
	private String cust;
	private String sosk;
	private String nline;
	private String actgb;
	private String oldline;
	private String opgb;
	private String modi;
	private String cusna;
}