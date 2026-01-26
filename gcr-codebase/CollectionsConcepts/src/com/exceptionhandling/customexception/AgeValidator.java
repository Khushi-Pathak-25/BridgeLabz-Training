package com.exceptionhandling.customexception;

public class AgeValidator {
	// Validates age and throws custom exception
	public static void validateAge(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
	}
}