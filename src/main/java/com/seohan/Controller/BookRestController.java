package com.seohan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seohan.Domain.Book; 

@RestController
class BookRestController {
//	private final BookRepository repository;
 
//	
////	public BookRestController(BookRepository repository) {
////		this.repository = repository;
////	}
//
//	public BookRestController(BookMapper bookMapper) {
//		this.bookMapper = bookMapper;
//	}
//	
//	  @GetMapping("/books")
//	  List<Book> all() {
//	    return repository.findAll();
//	  }
//
//
//	  @PostMapping("/books")
//	  Book newEmployee(@RequestBody Book newBook) {
//	    return repository.save(newBook);
//	  }

	  // Single item
	  @GetMapping("/books/{id}")
	  Book one(@PathVariable Long id) throws Exception {		  
//	    return bookMapper.selectOne();
	    Book book = new Book("test", "normal");
	    return  book;
	  }
	
}
