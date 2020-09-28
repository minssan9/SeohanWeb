package com.seohan.erp.general.Domain;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(MngFood.class)
@Table(name="FOOD_VW", schema="AALIB")
public class MngFood implements Serializable {
	@Id
	String companycode;
	@Id
	String gdate;
	@Id
	String gubn;
	@Id
	long ser;
	String menu;
	String bigo;
}
