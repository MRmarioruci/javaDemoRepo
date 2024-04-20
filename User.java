package com.example;

/**
 * in the provided Java file defines a simple user entity with private username and
 * password fields, and public getters for accessing these fields.
 */
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * retrieves the value of a `username` field and returns it as a string.
     * 
     * @returns a string representing the user's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * retrieves the stored password value.
     * 
     * @returns a string representation of the password.
     */
    public String getPassword() {
        return password;
    }
}