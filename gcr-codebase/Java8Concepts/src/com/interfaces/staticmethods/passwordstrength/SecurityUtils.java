package com.interfaces.staticmethods.passwordstrength;

public interface SecurityUtils {

    // static method to check password strength (central policy)
    static boolean isStrongPassword(String password) {
        // Policy rules (can be updated):
        // - At least 8 characters
        // - At least 1 uppercase letter
        // - At least 1 lowercase letter
        // - At least 1 digit
        // - At least 1 special character (@#$%^&+=!)
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                hasUpper = true;
            else if (Character.isLowerCase(c))
                hasLower = true;
            else if (Character.isDigit(c))
                hasDigit = true;
            else if ("@#$%^&+=!".indexOf(c) >= 0)
                hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    // Method checks if password is strong
    static String getStrengthMessage(String password) {
        if (isStrongPassword(password)) {
            return "Strong password";
        }
        return "Weak password - does not meet policy requirements";
    }
}