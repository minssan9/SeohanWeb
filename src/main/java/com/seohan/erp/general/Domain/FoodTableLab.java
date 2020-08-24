package com.seohan.erp.general.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data; 

@Data
@Entity 
@IdClass(FoodTableLab.class) 
@Table(name="SFOODTABLE", schema="SITLIB")
public class FoodTableLab implements Serializable { 
	@Id
	String gdate;
	@Id
	String gubn;
	@Id
	long ser;
	String menu;
	String bigo;
	
}
