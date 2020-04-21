package com.twu.biblioteca.view;

import com.twu.biblioteca.model.BookList;
import java.util.Scanner;
public class Menu {

    public BookList bookList = new BookList();
    Scanner input = new Scanner(System.in);

    public static String menuOptions() {
        return ("1. List Of Books \n2. Checkout a Book \n3. Return a Book\n9. Quit Biblioteca \n");
    }

    public void catchUserMenuOptionInput(int option) {

        switch (option) {
            case 1:
                System.out.println("Loading Books...");
                System.out.println(bookList.getAllAvailableBooks());
                break;
            case 2:
                System.out.println("Please insert book's title:");
                String inputTitle = input.nextLine();
                bookList.getBookByTitleToCheckout(inputTitle);
                break;
            case 3:
                System.out.println("\n ... RETURNING A BOOK BY TITLE ... \n");
                System.out.println("Please insert the book's title:");
                String inputTitleReturn = input.nextLine();
                bookList.getBookByTitleToReturn(inputTitleReturn);
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
