package com.seohan.fta.Domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity 
@IdClass(PoHeader.class)
@Table(name="PO_HEADER", schema="TPRLIB")
public class PoHeader implements Serializable {
	@Id
	private String	CO_GB;
	@Id
	private String	PO_NO;
	@Id
	private long	SUB_NO;
	private String	MR_NO;
	private String	PO_GB;
	private String	PO_TX;
	private String	ST_CUST_CD;
	private String	CUST_CD;
	private String	CUST_NM;
	private String	CUST_CHRG_NM;
	private String	CUST_CHRG_HP;
	private String	VIA_CUST_CD;
	private String	DIRECT_FL;
	private String	PO_CLASS;
	private String	PO_CHRG_YMD;
	private String	PO_DEPT_CD;
	private String	PO_DEPT_NM;
	private String	PO_CHRG_ID;
	private String	PO_CHRG_NM;
	private String	PO_YMD;
	private String	PO_APPR_ID;
	private String	PO_APPR_NM;
	private String	FC_FL;
	private String	CONTRCT_NO;
	private String	PO_FILE_NO;
	private String	PO_REMARK;
	private String	CUST_REMARK;
	private String	MR_DEPT_CD;
	private String	MR_DEPT_NM;
	private String	YSN_DEPT_CD;
	private String	YSN_DEPT_NM;
	private String	YSN_YEAR;
	private String	YSN_CD;
	private String	YSN_NM;
	private String	PO_ITMNO;
	private String	PO_ITM_NM;
	private double	NEGO_TOT_AMT;
	private double	PO_TOT_AMT;
	private String	RP_FIN_YMD;
	private String	RP_FIN_ID;
	private String	RP_FIN_NM;
	private String	UPDATE_YMD;
	private String	GLOBIZ_FL;
	private String	STATUS_CD;
	private String	IF_FLAG;

	@OneToMany(mappedBy = "poHeader")
	@JoinColumns({
			@JoinColumn(name="CO_GB"),
			@JoinColumn(name="PO_NO")
	})
	private List<PoDetail> poDetails;
}
