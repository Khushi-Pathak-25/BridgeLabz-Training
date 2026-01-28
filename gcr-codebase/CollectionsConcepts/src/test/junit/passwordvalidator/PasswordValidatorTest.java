package test.junit.passwordvalidator;

import org.junit.jupiter.api.Test;

import com.junit.passwordvalidator.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
    }

    @Test
    void testInvalidShortPassword() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testInvalidNoUpper() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testInvalidNoDigit() {
        assertFalse(validator.isValid("Password"));
    }
}