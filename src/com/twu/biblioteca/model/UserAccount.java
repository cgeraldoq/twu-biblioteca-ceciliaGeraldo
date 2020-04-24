package com.twu.biblioteca.model;

public class UserAccount {
    private String username;
    private String password;
    private String[][] accounts = {{"123-4567", "1234"},{"123-55555", "1234"}};

    public UserAccount(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public boolean checkPassword()
    {

        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
            return true;
        else
            return false;
    }
}
