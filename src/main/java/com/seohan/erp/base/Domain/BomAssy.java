package com.seohan.erp.base.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(BomAssy.class)
@Table(name = "BOM_JORIP", schema = "SMLIB")
public class BomAssy implements Serializable {
	@Id
	private String	LINE;
	@Id
	private String	ITMNO;
	@Id
	private String	CITEM;
	private String	LEVEL;
	private String	BDATE;
	private long	QTY;
	private String	BUNIT;
}
