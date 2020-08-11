package com.seohan.erp.base.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity 
@IdClass(Code.class) 
@Table(name="ACODERP", schema="SALIB")
public class Code implements Serializable {
	@Id
	private String adgub;
	@Id
	private String asgub;
	private String asdes;
	private String aref1;
	private String aref2;
	private String afill;
}
