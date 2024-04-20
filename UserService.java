package com.example;

public class UserService {
    private static final User[] users = {
        new User("user1", "password1"),
        new User("user2", "password2"),
        new User("user3", "password3")
    };

    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}