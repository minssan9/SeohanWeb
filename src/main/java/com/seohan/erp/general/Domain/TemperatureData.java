package com.seohan.erp.general.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TemperatureData {
	private String CO_GB;
	private String WARHS;
	private String LINE;
	@Id
	private String DTIME;
	private Double TEMPER;
	private Double HUMIDITY;
}
