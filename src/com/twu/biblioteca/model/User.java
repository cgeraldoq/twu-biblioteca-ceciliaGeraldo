package com.twu.biblioteca.model;

public class User {
    private String name;
    private String email;
    private int phoneNumber;

    public User(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        getUserTotalInfo();

    }

    public String getUserName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void getUserTotalInfo() {
       getUserName();
       getEmail();
       getPhoneNumber();
    }
    @Override
    public String toString() {

        return "Name: "+ name + " | Email: "+ email + " | Phone Number: "+ phoneNumber + "\n";
    }
}
