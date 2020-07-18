package com.seohan.erp.book.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seohan.erp.book.Domain.Book;

@Controller 
public class BookController {  
     
    @GetMapping("/bookList")
	String bookList(@RequestParam(name="queryType", required=false, defaultValue="all") String queryType, Book book, Model model) throws Exception {
//    	book = bookMapper.selectOne(); 
    	model.addAttribute("name", book.getName());
		return "book/hello";
	} 
}
