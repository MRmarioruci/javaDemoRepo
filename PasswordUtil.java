package com.example.util;

public class PasswordUtil {
    /**
     * verifies if a given password meets certain criteria, including length, complexity,
     * and character distribution, by checking the password's length, presence of capital
     * letters, presence of lowercase letters, and presence of digits.
     * 
     * @param password String to be evaluated for validity by the `isValidPassword()` function.
     * 
     * @returns a boolean value indicating whether the provided password meets the specified
     * criteria.
     */
    public static boolean isValidPassword(String password) {
        // Check if the password meets certain criteria, such as length, complexity, etc.
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*");
    }
}