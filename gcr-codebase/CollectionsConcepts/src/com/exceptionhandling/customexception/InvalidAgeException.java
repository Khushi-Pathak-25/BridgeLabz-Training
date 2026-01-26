package com.exceptionhandling.customexception;

// Custom user-defined exception
public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}