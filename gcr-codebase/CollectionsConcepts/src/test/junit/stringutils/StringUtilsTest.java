package test.junit.stringutils;

import org.junit.jupiter.api.Test;

import com.junit.stringutils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private final StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("radar"));
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }
}