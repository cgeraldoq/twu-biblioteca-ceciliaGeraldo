package com.twu.biblioteca.model;

public class Movie {

    private String title;
    private String directorName;
    private int premiereYear;
    private int movieRating;
    private boolean availableStatus;


    public Movie(String title, String directorName, int premiereYear, int movieRating, boolean availableStatus) {
        this.title = title;
        this.directorName = directorName;
        this.premiereYear = premiereYear;
        this.movieRating = movieRating;
        this.availableStatus = availableStatus;

    }

    public String getMovieTitle() {
        return title;
    }

    public String getMovieDirectorName() {
        return directorName;
    }

    public int getMoviePublishedYear() {
        return premiereYear;
    }

    public boolean getMovieAvailableStatus() {
        return availableStatus;
    }
    public void setMovieAvailableStatus() {
        this.availableStatus = !availableStatus;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + directorName + " | Released Year: " + premiereYear + " | Rating: " + movieRating;
    }

}
