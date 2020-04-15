package com.twu.biblioteca.model;

import org.junit.Test;

public class BookTest {

    @Test public void getBookTitleShouldReturnBooksTitle() {
        assertEquals("Clean Code", book.getBookTitle());
    }
}
