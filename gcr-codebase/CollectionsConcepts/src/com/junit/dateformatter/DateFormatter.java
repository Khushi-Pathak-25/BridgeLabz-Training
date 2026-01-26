package com.junit.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    public String formatDate(String inputDate) {
        try {
            DateTimeFormatter inputFmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(inputDate, inputFmt);
            
            DateTimeFormatter outputFmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return date.format(outputFmt);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format: Use yyyy-MM-dd");
        }
    }
}