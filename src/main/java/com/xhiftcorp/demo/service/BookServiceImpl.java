package com.xhiftcorp.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.xhiftcorp.demo.domain.Book;
import com.xhiftcorp.demo.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService
{
	private final BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Optional<Book> findById(Long id) {
		return repository.findById(id);
	}
}
