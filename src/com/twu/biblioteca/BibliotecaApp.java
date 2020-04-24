package com.twu.biblioteca;

import com.twu.biblioteca.model.BookList;
import com.twu.biblioteca.model.UserAccount;
import com.twu.biblioteca.view.Menu;

import java.util.Scanner;

public class BibliotecaApp {

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca!";
    }

    public static void main(String[] args) {

        String welcomeMessage = BibliotecaApp.showWelcomeMessage();
        System.out.println(welcomeMessage);

        Scanner input = new Scanner (System.in);

        String username;
        String password;

        while(true) {
        System.out.println("Welcome to the Biblioteca App");
        System.out.println("\nEnter your username and password to login into your account.");

        System.out.println("Username: ");
        username = input.nextLine();

        System.out.println("Password: ");
        password = input.nextLine();

        UserAccount login = new UserAccount(username, password);


            if (login.checkPassword()) {
                System.out.println("You are logged in! \n\n");
                Menu menu = new Menu();
                String menuOptions = menu.menuOptions();

                int inputNumber;
                do {
                    System.out.println(menuOptions);
                    Scanner scanner = new Scanner(System.in);
                    inputNumber = scanner.nextInt();
                    menu.catchUserMenuOptionInput(inputNumber);

                }
                while (inputNumber != 9);
            } else {
                System.out.println("The username and password you entered are incorrect.");
                System.out.println("Please try again :( \n\n");
            }
        }


    }
}
