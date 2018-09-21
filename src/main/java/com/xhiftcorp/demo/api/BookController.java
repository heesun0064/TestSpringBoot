package com.xhiftcorp.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xhiftcorp.demo.domain.Book;
import com.xhiftcorp.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController
{
	@Autowired
	BookService bookService;
	
	@GetMapping("/{bookId}")
	public ResponseEntity<Book> findById(Long bookId) {
		//Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException("Not found: " + bookId));
	
		Book book = new Book();
		book.setName("boot-spring-boot");
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		return ResponseEntity.ok(book);
	}
}
