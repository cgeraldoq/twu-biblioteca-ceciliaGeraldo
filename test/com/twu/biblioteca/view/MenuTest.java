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
    public void shouldSeeListOfMoviesOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("4. List of movies"));
    }
    @Test
    public void shouldSeeCheckoutAMovieOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("5. Checkout a Movie"));
    }
    @Test
    public void shouldSeeReturnAMovieOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("6. Return a movie"));
    }
    @Test
    public void shouldSeeQuitBibliotecaOptionAtMenu() {
        assertThat(Menu.menuOptions(), containsString("9. Quit Biblioteca"));
    }


    @Test
    public void shouldSeeAllMenuOptions() {
        assertEquals("1. List Of Books \n2. Checkout a Book \n3. Return a Book\n4. List of movies\n5. Checkout a Movie\n6. Return a movie\n7. Show checkout history\n8. See personal info\n9. Quit Biblioteca \n" , Menu.menuOptions());
    }



}
