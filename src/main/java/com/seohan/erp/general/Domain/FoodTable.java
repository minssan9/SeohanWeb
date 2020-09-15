package com.seohan.erp.general.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(FoodTable.class)
@Table(name="FOODTABLE", schema="SITLIB")
public class FoodTable extends Food implements Serializable {
	@Id
	private String gdate;
	@Id
	private String gubn;
	@Id
	private long ser;
	private String menu;
	private String bigo;

}
