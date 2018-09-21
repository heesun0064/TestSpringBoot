package com.xhiftcorp.demo.service;

import java.util.Optional;

import com.xhiftcorp.demo.domain.Book;

public interface BookService {
	Optional<Book> findById(Long id);
}
