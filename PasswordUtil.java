package com.example.util;

/**
 * is a Java class that provides a method to check if a given password meets certain
 * criteria, such as length and complexity. The method takes a String argument
 * representing the password and returns a boolean value indicating whether the
 * password is valid. The method checks the password length, presence of uppercase
 * letters, lowercase letters, and digits, among other criteria.
 */
public class PasswordUtil {
    /**
     * checks if a given password meets certain criteria, including length, complexity,
     * and character distribution. It returns `true` if the password is valid, otherwise
     * it returns `false`.
     * 
     * @param password password to be checked for validity, and the function checks if
     * it meets certain criteria related to length, complexity, and other factors.
     * 
     * @returns a boolean value indicating whether the given password meets the specified
     * criteria.
     * 
     * 	- `password.length() >= 8`: The password length must be greater than or equal to
     * 8 characters.
     * 	- `password.matches(".*[A-Z].*"`: The password must contain at least one uppercase
     * letter.
     * 	- `password.matches(".*[a-z].*"`: The password must contain at least one lowercase
     * letter.
     * 	- `password.matches(".*\\d.*")` : The password must contain at least one digit.
     */
    public static boolean isValidPassword(String password) {
        // Check if the password meets certain criteria, such as length, complexity, etc.
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*");
    }
}