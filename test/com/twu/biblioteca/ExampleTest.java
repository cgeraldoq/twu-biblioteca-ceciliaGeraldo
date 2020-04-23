package com.twu.biblioteca;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void welcomeMessageShouldBeDisplayed() {
        assertEquals("Welcome to Biblioteca!", BibliotecaApp.showWelcomeMessage());
    }

  /*  @Test
    public List<Book> listOfBooksShouldBeDisplayedAfterWelcomeMessage() {
        Book bookOne =  new Book ("Pride and prejudice", "Jane Austin", "Novel", "1813");
    }*/
}

