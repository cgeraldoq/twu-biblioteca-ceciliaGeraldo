package com.twu.biblioteca.view;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void shouldSeeListBookOptionsAtMenu() {
        assertEquals("1. List Of Books", Menu.menuOptions());
    }
}
