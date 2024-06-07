package com.Neueda.Library.controller;

import com.Neueda.Library.model.Book;
import com.Neueda.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "true")
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello!";
    }

    @GetMapping("/books/{id}")
    public Book retrieveBook(@PathVariable long id) {
        //return todoService.findById(id);
        return bookRepository.findById(id).get();
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> borrowBook(@PathVariable long id) {
        bookRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/books")
    public Book returnBook(@RequestBody Book book) {
        book.setId(null);
        return bookRepository.save(book);
    }
}
