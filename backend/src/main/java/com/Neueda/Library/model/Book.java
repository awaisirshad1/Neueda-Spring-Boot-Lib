package com.Neueda.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String genre;

    @Getter
    @Setter
    private String author;

    public Book(){}

    public Book(String title, String genre, String author, Long id){
        super();
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
    }


    public void setId(Object o) {
    }
}
