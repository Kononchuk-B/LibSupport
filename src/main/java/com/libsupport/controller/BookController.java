package com.libsupport.controller;

import com.libsupport.entity.Book;
import com.libsupport.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello guys";
    }

    @RequestMapping("showBook")
    public Book getBook() {
        Book book = new Book();
        book.setId(2);
        book.setName("My Test Book");
        return book;
    }

    @RequestMapping(value = "showBooks", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return bookService.findAll();
    }

    @RequestMapping(value = "addBook", method = RequestMethod.POST)
    public void addBook() {
        Book book = new Book();
        bookService.add(book);
    }
}
