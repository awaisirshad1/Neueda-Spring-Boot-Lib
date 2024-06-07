package com.Neueda.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Periodical {
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

    @Getter
    @Setter
    private Boolean isBorrowable;

    public Periodical(){}

    public Periodical(String title, String genre, String author, Long id, Boolean isBorrowable){
        super();
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.isBorrowable = isBorrowable;
    }


    public void setId(Object o) {
    }
}


