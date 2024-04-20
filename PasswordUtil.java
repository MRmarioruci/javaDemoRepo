package com.example.util;

public class PasswordUtil {
    public static boolean isValidPassword(String password) {
        // Check if the password meets certain criteria, such as length, complexity, etc.
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*");
    }
}