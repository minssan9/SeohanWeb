package com.seohan.erp.general.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
public class Food {
	String gdate;
	String gubn;
	long ser;
	String menu;
	String bigo;
}
