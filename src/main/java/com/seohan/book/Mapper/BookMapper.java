package com.seohan.book.Mapper;

import java.util.List;

import com.seohan.book.Domain.Book;
import com.seohan.general.Domain.Dto;

public interface BookMapper {

	public List<Book> selectList(Dto dto); 
	public Book selectOne();
}
