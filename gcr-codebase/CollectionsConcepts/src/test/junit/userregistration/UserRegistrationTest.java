package test.junit.userregistration;

import org.junit.jupiter.api.Test;

import com.junit.userregistration.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("abhi", "abhi@example.com", "pass123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "abhi@example.com", "pass123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("abhi", "invalid-email", "pass123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("abhi", "abhi@example.com", ""));
    }
}