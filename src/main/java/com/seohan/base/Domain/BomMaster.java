package com.seohan.base.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(BomMaster.class)
@Table(name = "BOMSTPF", schema = "SBLIB")
public class BomMaster implements Serializable {
	@Id
	private String	PITEM;
	@Id
	private String	CITEM;
	private String	STDATE;
	private long	ASYNO;
	private long	ASYQT;
	private String	STATS;
	private String	FILL;
}
