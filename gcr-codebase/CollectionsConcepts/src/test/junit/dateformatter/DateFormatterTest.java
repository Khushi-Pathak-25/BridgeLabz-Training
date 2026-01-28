package test.junit.dateformatter;

import org.junit.jupiter.api.Test;

import com.junit.dateformatter.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
    private final DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("01-01-2023", formatter.formatDate("2023-01-01"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("2023-13-01"));
    }
}
