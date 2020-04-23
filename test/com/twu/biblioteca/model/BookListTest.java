package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookListTest {
    private BookList bookListTest;
    ArrayList<Book> listOfBooksTest = new ArrayList<Book>();


    @Before
    public void mockSetUp() {

        Book book1 = new Book("Clean Code","Robert C. Martin",2008, true);
        Book book2 = new Book("The Object-Oriented Thought Process","Matt A. Weisfeld",2000, true);
        Book book3 = new Book("Clean Agile","Robert C. Martin",2019, false);


        listOfBooksTest.add(book1);
        listOfBooksTest.add(book2);
        listOfBooksTest.add(book3);
    }


    @Test
    public void generateBooksShouldGenerateThreeBooks() {
        assertEquals(3, listOfBooksTest.size());
    }

//    @Test
   // public void getAllAvailableBooksShouldReturnTwoBooks() {
   //     assertThat(bookListTest.getAllAvailableBooks(), containsString(" Clean Code Robert C. Martin ,2008,true","The Object-Oriented Thought Process","Matt A. Weisfeld",2000, true ) );
 //   }
}
