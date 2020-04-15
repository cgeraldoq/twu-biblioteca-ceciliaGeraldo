package com.twu.biblioteca.model;

public class Book {
    private String title;
    private String authorNames;
    private int publishedYear;


    public Book(String title, String authorNames, int publishedYear) {
        this.title = title;
        this.authorNames = authorNames;
        this.publishedYear = publishedYear;
    }

    public String getBookTitle() {
        return title;
    }

    public String getBookAuthorNames() {
        return authorNames;
    }

    public int getBookPublishedYear() {
        return publishedYear;
    }

}
