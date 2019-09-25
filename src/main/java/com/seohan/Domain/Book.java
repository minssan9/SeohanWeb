package com.seohan.Domain;
 

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book {  
	private String name;
	private String author;
	private String publish;
	private double price;
	
	public Book(String name, String author){
		this.name = name;
		this.author = author;
	} 
}
