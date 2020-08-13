package com.seohan.erp.base.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity 
@IdClass(CodeGroup.class) 
@Table(name="ACODERP", schema="COMLIB")
public class CodeGroup implements Serializable {
	@Id
	private String adgub  ;
	@Id            
	private String asgub  ; 
	private String asdes  ;
	private String fdept  ;
	private String tdept  ;
	private String act1   ;
	private String act2   ;
	private String fill   ;
	private String pgubn  ;
}