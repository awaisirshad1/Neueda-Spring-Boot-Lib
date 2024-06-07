package com.Neueda.Library.repository;

import com.Neueda.Library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
