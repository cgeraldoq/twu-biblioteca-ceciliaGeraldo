package com.twu.biblioteca.view;

import com.twu.biblioteca.model.BookList;
import com.twu.biblioteca.model.MovieList;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.model.UserAccount;

import java.util.Scanner;
public class Menu {

    public BookList bookList = new BookList();
    public MovieList movieList = new MovieList();
    public UserAccount user = new UserAccount("123-4567", "1234");
    public User userInfo = new User("John Doe", "johndoe@gmail.com", 123456789);
    Scanner input = new Scanner(System.in);

    public static String menuOptions() {
        return ("1. List Of Books \n2. Checkout a Book \n3. Return a Book\n4. List of movies\n5. Checkout a Movie\n6. Return a movie\n7. Show checkout history\n8. See personal info\n9. Quit Biblioteca \n");
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
            case 4:
                System.out.println("\n ... Loading Available Movies ...");
                System.out.println(movieList.getAllAvailableMovies());
                break;
            case 5:
                System.out.println("Please insert movie title to checkout: \n");
                String inputMovieTitle = input.nextLine();
                movieList.getMovieByTitleToCheckout(inputMovieTitle);
                break;
            case 7:
                System.out.println("\n HISTORY OF CHECKED OUT MOVIES: \n");
                System.out.println(movieList.getHistoryOfCheckoutMovies());
                break;
            case 8:
                System.out.println(" YOUR PERSONAL INFO\n");
                System.out.println(userInfo.toString());
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
