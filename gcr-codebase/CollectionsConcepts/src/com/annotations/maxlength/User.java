package com.annotations.maxlength;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    // Constructor validates field length
    public User(String username) {
	validateLength(username);
	this.username = username;
    }

    // Method to validate username length
    private void validateLength(String value) {
	try {
	    Field field = this.getClass().getDeclaredField("username");

	    if (field.isAnnotationPresent(MaxLength.class)) {
		MaxLength maxLength = field.getAnnotation(MaxLength.class);

		if (value.length() > maxLength.value()) {
		    throw new IllegalArgumentException("Username exceeds max length: " + maxLength.value());
		}
	    }

	} catch (NoSuchFieldException e) {
	    System.out.println("Validation error.");
	}
    }

    public String getUsername() {
	return username;
    }
}