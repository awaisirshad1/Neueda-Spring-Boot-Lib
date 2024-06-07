package com.Neueda.Library.config;

import com.Neueda.Library.model.Book;
import com.Neueda.Library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBInitializer_Book {
    @Bean
    CommandLineRunner initDatabase(BookRepository bookRepository){
        return args -> {
            var books = List.of(
                    new Book("harry potter and the prisoner of azkaban", "Fantasy", "J.K Rowling" )
            );
            bookRepository.saveAll(books);
        };
    }
}
