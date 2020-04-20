package com.twu.biblioteca.view;

import com.twu.biblioteca.model.BookList;

public class Menu {

    public BookList bookList = new BookList();

    public static String menuOptions() {
        return ("1. List Of Books");
    }

    public void catchUserMenuOptionInput(int option) {

        if (option == 1) {
            System.out.println("Loading Books...");
            System.out.println(new BookList().getAllBooks());
        }else {
            System.out.println("Please enter a valid menu option");
        }

    }
}
