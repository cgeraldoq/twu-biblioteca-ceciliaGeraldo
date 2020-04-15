package com.twu.biblioteca.model;

public class Book {
    private String title;
    private String authorNames;

    public Book(String title, String authorNames) {
        this.title = title;
        this.authorNames = authorNames;
    }

    public String getBookTitle() {
        return title;
    }

    public String getBookAuthorNames() {
        return authorNames;
    }

}
