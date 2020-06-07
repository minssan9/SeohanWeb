package com.seohan.fta.Domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity 
@IdClass(PoDetail.class)
@Table(name="PO_DETAIL", schema="TPRLIB")
public class PoDetail implements Serializable {
	@Id
	private String	CO_GB;
	@Id
	private String	PO_NO;
	@Id
	private double	PO_SEQ;
	private String	ST_ITMNO;
	private String	ITMNO;
	private String	ITM_NM;
	private String	ITM_SPEC;
	private double	PO_QTY;
	private double	RP_QTY;
	private String	UNIT_CD;
	private double	UNIT_AMT;
	private String	MNY_CD;
	private double	EXC_AMT;
	private double	NEGO_AMT;
	private double	PO_AMT;
	private String	POS_TX;
	private String	DLV_REQ_YMD;
	private String	DLV_LOCAT;
	private String	COST_CD;
	private String	ASSET_GB;
	private String	ASSET_CD;
	private String	STATUS_CD;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name="CO_GB"),
			@JoinColumn(name="PO_NO")
	})
	private PoHeader poHeader;
}
