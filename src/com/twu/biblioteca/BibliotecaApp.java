package com.twu.biblioteca;

import com.twu.biblioteca.view.Menu;

import java.util.Scanner;

public class BibliotecaApp {

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca!";
    }

    public static void main(String[] args) {

        String welcomeMessage = BibliotecaApp.showWelcomeMessage();
        System.out.println(welcomeMessage);

        Menu menu = new Menu();
        String menuOptions = menu.menuOptions();
        System.out.println(menuOptions);

        int inputNumber;
        do {
            menu.menuOptions();
            Scanner scanner = new Scanner(System.in);
            inputNumber = scanner.nextInt();
            menu.catchUserMenuOptionInput(inputNumber);
        }
        while (inputNumber != 9);
    }
}
