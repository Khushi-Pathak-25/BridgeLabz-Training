package com.junit.userregistration;

public class UserRegistration {
    public void registerUser(String username, String email, String password) {
        
	if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid username");
        }
        
	if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        
	if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid password");
        }
	
	System.out.println("User registered successfully!");
	System.out.printf("Username: %s, Email: %s, Password: %s%n", username, email, password);
    }
}