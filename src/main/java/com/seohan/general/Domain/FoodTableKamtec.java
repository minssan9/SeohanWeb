package com.seohan.general.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data; 

@Data
@Entity 
@IdClass(FoodTableKamtec.class) 
@Table(name="FOODTABLE", schema="KITLIB")
public class FoodTableKamtec implements Serializable { 
	@Id
	String gdate;
	@Id
	String gubn;
	@Id
	long ser;
	String menu;
	String bigo;
	
}
