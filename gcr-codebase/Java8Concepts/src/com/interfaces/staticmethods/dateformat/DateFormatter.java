package com.interfaces.staticmethods.dateformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatter {

    // static method - formats date in DD-MM-YYYY (common in India)
    static String formatDDMMYYYY(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    // static method - formats date in YYYY-MM-DD (ISO standard, good for databases)
    static String formatYYYYMMDD(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    // static method - formats date in full month name style (25 July 2025)
    static String formatFullMonth(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    // static method - formats date in invoice-friendly long format (July 25, 2025)
    static String formatInvoiceStyle(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
    }

    // Helper: get current date formatted in a chosen style
    static String getCurrentDate(String style) {
        LocalDate today = LocalDate.now();
        switch (style.toLowerCase()) {
            case "ddmmyyyy":
                return formatDDMMYYYY(today);
            case "yyyymmdd":
                return formatYYYYMMDD(today);
            case "fullmonth":
                return formatFullMonth(today);
            case "invoicestyle":
                return formatInvoiceStyle(today);
            default:
                return formatDDMMYYYY(today);
        }
    }
}