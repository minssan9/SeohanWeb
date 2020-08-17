//package com.seohan.auth.Domain;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Set;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Builder
//@ToString
//@IdClass(ExtAccount.class)
//@Table(name = "VUSERPF", schema = "SMLIB")
//public class ExtAccount implements Account, Serializable {
//    @Id
//    private String accountid;
//    @Column(name="PAWD")
//    private String password;
//
//    private String cstcd;
//    private String gubun;
//    private int serno;
//
//    private String name;
//    private String plast;
//    private String ulast;
//    private String stats;
//    private String chkqc;
//    private String laut;
//    private String stel;
//    private String htel;
//    private String kofcd;
//    private String won;
//    private String kum;
//    private String sipgo;
//    private String sang;
//    private String sms_nm;
//
//
//    @ElementCollection(fetch = FetchType.EAGER)
//    @Enumerated(EnumType.STRING)
//    private Set<AccountRoles> roles;
//
//    @Override
//    public String getAccountId() {
//        return accountid;
//    }
//}