package com.twu.biblioteca.view;

import com.twu.biblioteca.model.BookList;

public class Menu {

    public BookList bookList = new BookList();

    public static String menuOptions() {
        return ("1. List Of Books");
    }

    public void catchUserMenuOptionInput(int option) {
        switch (option) {
            case 1:
                System.out.println("Loading Books...");
                System.out.println(new BookList().getAllBooks());
                break;
            case 9:
                System.out.println("...BibliotecaApp is closing...");
                System.exit(0);
            default:
                System.out.println("Please enter a valid menu option");
                menuOptions();
        }


    }
}
