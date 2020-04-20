package com.twu.biblioteca.model;

import com.twu.biblioteca.model.Book;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {

    public List <Book> listOfBooks = new ArrayList<Book>(Arrays.asList(
            new Book("Clean Code","Robert C. Martin",2008),
            new Book("The Object-Oriented Thought Process","Matt A. Weisfeld",2000),
            new Book("Clean Agile","Robert C. Martin",2019)

    ));


    public String getAllBooks() {

        StringBuilder bookList = new StringBuilder();

        for (Book book: listOfBooks) {
            bookList.append(book.toString()).append("\n");
        }

        return bookList.toString();
    }



}
