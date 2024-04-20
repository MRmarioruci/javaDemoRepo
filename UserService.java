package com.example;

public class UserService {
    private static final User[] users = {
        new User("user1", "password1"),
        new User("user2", "password2"),
        new User("user3", "password3")
    };

    /**
     * authenticates a user by checking their username and password against those stored
     * in the `users` collection, returning the matched user or `null`.
     * 
     * @param username username of the user being authenticated.
     * 
     * @param password password of the user to be authenticated, which is compared to the
     * corresponding value stored in the `users` collection to determine if the user is
     * authenticated or not.
     * 
     * @returns a `User` object if the provided username and password match any user in
     * the list, otherwise it returns `null`.
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