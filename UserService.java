package com.example;

/**
 * contains a static array of User objects and a single method for authenticating
 * users based on their username and password. The method iterates through the array
 * of Users and checks if the provided username and password match any of the stored
 * usernames and passwords, returning the matching User object or null if no match
 * is found.
 */
public class UserService {
    private static final User[] users = {
        new User("user1", "password1"),
        new User("user2", "password2"),
        new User("user3", "password3")
    };

    /**
     * verifies a given username and password in the `users` list and returns the
     * corresponding user object if found, or `null` otherwise.
     * 
     * @param username username of the user being authenticated.
     * 
     * @param password password to be authenticated by the `authenticate` function.
     * 
     * @returns a `User` object if the provided username and password match any saved in
     * the `users` list, otherwise it returns `null`.
     * 
     * 	- If a user is found that matches the provided username and password, the function
     * returns a `User` object representing that user.
     * 	- If no user is found that matches the provided credentials, the function returns
     * `null`.
     * 	- The function does not modify the input parameters or any other part of the
     * program's state.
     */
    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}