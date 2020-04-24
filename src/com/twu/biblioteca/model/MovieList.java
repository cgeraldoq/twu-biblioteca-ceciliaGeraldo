package com.twu.biblioteca.model;

import java.util.ArrayList;

public class MovieList {

        ArrayList<Movie> listOfMovies = new ArrayList<Movie>();

        public MovieList() {
            generateMovies();
        }

        public void generateMovies(){

            Movie movie1 = new Movie("Avatar","James Cameron",2009, 3 ,true);
            Movie movie2 = new Movie("Star Wars: The Clone Wars","George Lucas",2009, 4, true);
            Movie movie3 = new Movie("Rogue One: A Star Wars Story","George Lucas",2016, 8,true);
            Movie movie4 = new Movie("Solo: A Star Wars Story","George Lucas",2018, 8,true);
            Movie movie5 = new Movie("Star Wars: The Rise of Skywalker","George Lucas",2019, 9, true);
            Movie movie6 = new Movie("Star Wars: The Force Awakens","George Lucas",2015, 7,true);


            listOfMovies.add(movie1);
            listOfMovies.add(movie2);
            listOfMovies.add(movie3);
            listOfMovies.add(movie4);
            listOfMovies.add(movie5);
            listOfMovies.add(movie6);

        }

        public String getAllAvailableMovies() {

            StringBuilder movieList = new StringBuilder();

            for (Movie movie: this.listOfMovies) {
                if (movie.getMovieAvailableStatus() == true) {
                    movieList.append(movie.toString()).append("\n");
                }
            }
            int sizeOfList = movieList.length();

            if (sizeOfList==0) {
                return ("\nWe don't have available books at the moment :( \n");
            }else{
                return movieList.toString();
            }


        }

        public void getMovieByTitleToCheckout(String titleInput) {

            System.out.println("...Looking for a match...");
            for (Movie movie: this.listOfMovies) {

                if (movie.getMovieTitle().equals(titleInput) && movie.getMovieAvailableStatus()==true) {
                    movie.setMovieAvailableStatus();
                    System.out.println("We found the book!! And it's available to checkout :) \n ");
                    System.out.println("Successfull checkout: Enjoy your book! :) \n\n");
                    break;
                } else {
                    System.out.println("..This is not the book..");
                }

            }
        }

        public String getHistoryOfCheckoutMovies() {
            StringBuilder movieCheckoutList = new StringBuilder();

            for (Movie movie: this.listOfMovies) {

                if (movie.getMovieAvailableStatus()==false) {
                    movieCheckoutList.append((movie.toString())+ "\n");
                }

            }

            return movieCheckoutList.toString();
        }

        public void getMovieByTitleToReturn(String titleInput) {
            System.out.println("...Looking the book place in the library...");

            for (Movie movie: this.listOfMovies) {

                if (movie.getMovieTitle().equals(titleInput) && movie.getMovieAvailableStatus()==false) {
                    movie.setMovieAvailableStatus();
                    System.out.println("We found the book's place!! Thanks for coming back :) \n ");
                    System.out.println("Successfull return: Keep reading! :) \n\n");
                    break;
                } else {
                    System.out.println("..This is not the place, keep looking..");
                }

            }
        }


    }


