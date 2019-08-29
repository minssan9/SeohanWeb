package com.sh.Domain;

import lombok.Data;

@Data
public class Dto {
	private double count;
	private double sum;
	
	private String a_group;
	private String b_group;
	private String c_group;
	private String field1; 
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	
	private String year;
	private String month;
	private String day;
	
	private String queryDate="";
	private String queryType=""; 
}
