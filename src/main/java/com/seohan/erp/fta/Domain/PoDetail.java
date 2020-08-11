package com.seohan.erp.fta.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity 
@IdClass(PoDetailId.class)
@Table(name="PO_DETAIL", schema="TPRLIB")
@ToString(exclude = {"poHeader"})
public class PoDetail implements Serializable {
	@Id
	@Column(name = "CO_GB")
	private String	cogb;

	@Id
	@Column(name = "PO_NO")
	private String	pono;

	@Id
	@GeneratedValue
	@Column(name = "PO_SEQ")
	private double	poseq;

	private String	st_itmno;
	private String	itmno;
	private String	itm_nm;
	private String	itm_spec;
	private double	po_qty;
	private double	rp_qty;
	private String	unit_cd;
	private double	unit_amt;
	private String	mny_cd;
	private double	exc_amt;
	private double	nego_amt;
	private double	po_amt;
	private String	pos_tx;
	private String	dlv_req_ymd;
	private String	dlv_locat;
	private String	cost_cd;
	private String	asset_gb;
	private String	asset_cd;
	private String	status_cd;

	@JsonManagedReference
	@ManyToOne(fetch=FetchType.LAZY, optional = true)
	@JoinColumns(value = {
					@JoinColumn(name = "CO_GB", insertable = false, updatable = false),
					@JoinColumn(name = "PO_NO", insertable = false, updatable = false)
			}, foreignKey = @ForeignKey(name="P_PO_HEADER"))
	private PoHeader poHeader;
}
