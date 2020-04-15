package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book testBook;

    @Before
    public void mockSetUp() {

        testBook = new Book("Clean Code");
    }

    @Test public void getBookTitleShouldReturnBooksTitle() {
        assertEquals("Clean Code", testBook.getBookTitle());
    }

    @Test public void getBookAuthorNameShouldReturnBooksAuthorNames() {
        assertEquals(" Robert C. Martin", testBook.getBookAuthorName());
    }
}
