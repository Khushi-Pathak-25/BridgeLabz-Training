package com.interfaces.staticmethods.passwordstrength;

import java.util.Scanner;

public class PasswordStrengthValidatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insurance Portal - Password Strength Validator");
        System.out.println("Policy: Minimum 8 chars, 1 uppercase, 1 lowercase, 1 digit, 1 special char (@#$%^&+=!)");
        System.out.println("------------------------------------------------------------");

        while (true) {
            System.out.print("\nEnter password to validate (or 'exit' to quit): ");
            String password = input.nextLine().trim();

            if (password.equalsIgnoreCase("exit")) {
                System.out.println("Exiting validator...");
                break;
            }

            // Call static method from interface
            boolean isStrong = SecurityUtils.isStrongPassword(password);

            System.out.println("Password strength: " + (isStrong ? "STRONG" : "WEAK"));
            System.out.println("Message: " + SecurityUtils.getStrengthMessage(password));

            // Optional: show which rules are failing
            if (!isStrong) {
                System.out.println("-> Requirements not met:");
                if (password.length() < 8)
                    System.out.println("  - Less than 8 characters");
                if (!password.matches(".*[A-Z].*"))
                    System.out.println("  - No uppercase letter");
                if (!password.matches(".*[a-z].*"))
                    System.out.println("  - No lowercase letter");
                if (!password.matches(".*\\d.*"))
                    System.out.println("  - No digit");
                if (!password.matches(".*[@#$%^&+=!].*"))
                    System.out.println("  - No special character");
            }
        }

        input.close();
    }
}