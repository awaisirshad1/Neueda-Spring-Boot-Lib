package com.Neueda.Library.controller;

import com.Neueda.Library.model.Book;
import com.Neueda.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "true")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
