package com.Neueda.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public String title;

    public String artist;

    public String album;

    public int year;

    public String genre;

    public CD(){}

    public CD(String title, String artist, String album, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;
    }
}
