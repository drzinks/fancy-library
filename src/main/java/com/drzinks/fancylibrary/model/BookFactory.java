package com.drzinks.fancylibrary.model;

/**
 * Created by mihaś on 11.12.2020.
 */
public class BookFactory {

    public static Book createBook(String title, int year, String author) {
        //TODO: exceptions - validate tititle, authors etc
        return new Book(title, year, author);
    }

}
