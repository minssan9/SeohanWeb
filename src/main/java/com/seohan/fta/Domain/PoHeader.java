package com.seohan.fta.Domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@IdClass(PoId.class)
@Table(name = "PO_HEADER", schema = "TPRLIB")
public class PoHeader implements Serializable {
    @Id
    @EmbeddedId
    private PoId poId;

//    @Id
//    @Column(name = "CO_GB")
//    private String cogb;
//
//    @Id
//    @Column(name = "PO_NO")
//    private String pono;

    private long   sub_no;
    private String mr_no;
    private String po_gb;
    private String po_tx;
    private String st_cust_cd;
    private String cust_cd;
    private String cust_nm;
    private String cust_chrg_nm;
    private String cust_chrg_hp;
    private String via_cust_cd;
    private String direct_fl;
    private String po_class;
    private String po_chrg_ymd;
    private String po_dept_cd;
    private String po_dept_nm;
    private String po_chrg_id;
    private String po_chrg_nm;
    @Column(name = "PO_YMD")
    private String poYmd;
    private String po_appr_id;
    private String po_appr_nm;
    private String fc_fl;
    private String contrct_no;
    private String po_file_no;
    private String po_remark;
    private String cust_remark;
    private String mr_dept_cd;
    private String mr_dept_nm;
    private String ysn_dept_cd;
    private String ysn_dept_nm;
    private String ysn_year;
    private String ysn_cd;
    private String ysn_nm;
    private String po_itmno;
    private String po_itm_nm;
    private double nego_tot_amt;
    private double po_tot_amt;
    private String rp_fin_ymd;
    private String rp_fin_id;
    private String rp_fin_nm;
    private String update_ymd;
    private String globiz_fl;
    private String status_cd;
    private String if_flag;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @org.hibernate.annotations.ForeignKey(name = "none")
//    @JoinTable(schema = "TPRLIB", name = "PO_DETAIL",
//            joinColumns = {
//                    @JoinColumn(name = "CO_GB", insertable = false, updatable = false),
//                    @JoinColumn(name = "PO_NO", insertable = false, updatable = false)
//            })
    private List<PoDetail> poDetails = new ArrayList<>();
}
