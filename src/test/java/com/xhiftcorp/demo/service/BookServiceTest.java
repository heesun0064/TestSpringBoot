package com.xhiftcorp.demo.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.xhiftcorp.demo.domain.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest
{
	@Autowired
	BookService bookService;
	
	@Before
	public void setUp() {
		BookRepository bookRepository = new StubBookRepository();
		bookService = new BookServiceImpl(bookRepository);
	}
	
	@Test(expected=RuntimeException.class)
	public void testFindById() {
		long id = 1L;
		bookService.findById(id).orElseThrow(() -> new RuntimeException());
	}
}
