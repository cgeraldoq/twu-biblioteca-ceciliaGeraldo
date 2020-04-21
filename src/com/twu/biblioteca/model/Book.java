package com.twu.biblioteca.model;

public class Book {
    private String title;
    private String authorNames;
    private int publishedYear;
    private boolean availableStatus;


    public Book(String title, String authorNames, int publishedYear, boolean availableStatus) {
        this.title = title;
        this.authorNames = authorNames;
        this.publishedYear = publishedYear;
        this.availableStatus = availableStatus;

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

    public boolean getBookAvailableStatus() {
        return availableStatus;
    }
    public void setBookAvailableStatus() {
        this.availableStatus = !availableStatus;
    }

    public void checkoutABook() {
        this.availableStatus = false;
    }

    public void returnABook() {
        this.availableStatus = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + authorNames + " | Released Year: " + publishedYear + " | Status: " + availableStatus;
    }
}
