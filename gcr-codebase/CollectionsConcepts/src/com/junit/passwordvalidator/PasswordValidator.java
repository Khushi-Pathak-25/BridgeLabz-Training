package com.junit.passwordvalidator;

public class PasswordValidator {
    
    public boolean isValid(String password) {
	if (password.length() < 8) {
	    return false;
	}

	boolean hasUpper = false;
	boolean hasDigit = false;

	for (char c : password.toCharArray()) {
	    if (Character.isUpperCase(c)) {
		hasUpper = true;
	    }
	    if (Character.isDigit(c)) {
		hasDigit = true;
	    }
	}
	
	return hasUpper && hasDigit;
    }
}