package com.junit.dateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("15-08-2025",
                formatter.formatDate("2025-08-15"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(DateTimeParseException.class,
                () -> formatter.formatDate("15-08-2025"));
    }
}
