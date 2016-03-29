package com.libsupport.service;

import com.libsupport.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    Book add(Book book);

    List<Book> findAll();
}
