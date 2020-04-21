package com.twu.biblioteca.model;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {

    ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public BookList() {
        generateBooks();
    }

    public void generateBooks(){

    Book book1 = new Book("Clean Code","Robert C. Martin",2008, true);
    Book book2 = new Book("The Object-Oriented Thought Process","Matt A. Weisfeld",2000, true);
    Book book3 = new Book("Clean Agile","Robert C. Martin",2019, true);


        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);


    }

    public String getAllAvailableBooks() {

        StringBuilder bookList = new StringBuilder();

        for (Book book: this.listOfBooks) {
            if (book.getBookAvailableStatus() == true) {
                bookList.append(book.toString()).append("\n");
            }
        }
        int sizeOfList = bookList.length();

        if (sizeOfList==0) {
            return ("\nWe don't have available books at the moment :( \n");
        }else{
            return bookList.toString();
        }


    }

    public void getBookByTitleToCheckout(String titleInput) {
        System.out.println("...Looking for a match...");
        for (Book book: this.listOfBooks) {

            if (book.getBookTitle().equals(titleInput) && book.getBookAvailableStatus()==true) {

                book.setBookAvailableStatus();
                System.out.println("We found the book!! And it's available to checkout :) \n ");
                System.out.println("Successfull checkout: Enjoy your book! :) \n\n");
                break;
            } else {
                System.out.println("..This is not the book..");
            }

        }
    }

    public void getBookByTitleToReturn(String titleInput) {
        System.out.println("...Looking the book place in the library...");

        for (Book book: this.listOfBooks) {

            if (book.getBookTitle().equals(titleInput) && book.getBookAvailableStatus()==false) {
                book.setBookAvailableStatus();
                System.out.println("We found the book's place!! Thanks for coming back :) \n ");
                System.out.println("Successfull return: Keep reading! :) \n\n");
                break;
            } else {
                System.out.println("..This is not the place, keep looking..");
            }

        }
    }


}
