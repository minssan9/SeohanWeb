package com.seohan.general.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data; 

@Data
@Entity 
@IdClass(FoodTable.class) 
public class FoodTable implements Serializable { 
	@Id
	String gdate;
	@Id
	String gubn;
	@Id
	long ser;
	String menu;
	String bigo;
	
}
