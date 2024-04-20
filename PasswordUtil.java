package com.example.util;

/**
 * is a Java class that provides a method for checking if a password meets certain
 * criteria. The method takes a password as input and returns a boolean value indicating
 * whether the password is valid. The method checks the length of the password, its
 * complexity (containing at least one uppercase letter, one lowercase letter, and
 * one digit), and matches against regular expressions for these requirements.
 */
public class PasswordUtil {
    /**
     * checks if a given password meets certain criteria, including length, complexity,
     * and pattern matching.
     * 
     * @param password password to be checked for validity.
     * 
     * @returns a boolean value indicating whether the provided password meets the specified
     * criteria.
     */
    public static boolean isValidPassword(String password) {
        // Check if the password meets certain criteria, such as length, complexity, etc.
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*");
    }
}