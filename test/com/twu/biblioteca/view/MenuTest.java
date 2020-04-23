package com.twu.biblioteca.view;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MenuTest {

    @Test
    public void shouldSeeListBookOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("1. List Of Books"));
    }

    @Test
    public void shouldSeeCheckoutBookOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("2. Checkout a Book"));
    }
    @Test
    public void shouldSeeQReturnABookOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("3. Return a Book"));
    }
    @Test
    public void shouldSeeQuitBibliotecaOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("9. Quit Biblioteca"));
    }

    @Test
    public void shouldSeeAllMenuOptions() {
        assertEquals("1. List Of Books \n2. Checkout a Book \n3. Return a Book\n9. Quit Biblioteca \n", Menu.menuOptions());
    }



}
