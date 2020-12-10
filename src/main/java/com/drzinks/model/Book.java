package com.drzinks.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Created by mihaś on 11.12.2020.
 */

@EqualsAndHashCode
@Getter
public class Book {
    private static long currentId = 0;

    private final String title;
    private final int year;
    private final String author;
    private final long id;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.id = currentId + 1;
    }


}
