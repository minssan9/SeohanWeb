package com.seohan.erp.base.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(Bom.class)
@Table(name = "BOMSTPF", schema = "SBLIB")
public class Bom implements Serializable {
	@Id
	private String	pitem;
	@Id
	private String	citem;
	private String	stdate;
	private long	asyno;
	private long	asyqt;
	private String	stats;
	private String	fill;
}
