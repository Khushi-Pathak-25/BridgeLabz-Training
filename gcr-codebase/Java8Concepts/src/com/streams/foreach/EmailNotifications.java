package com.streams.foreach;

import java.util.*;

public class EmailNotifications {

    // Create Method to send an email
    static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }

    public static void main(String[] args) {

        // List of user email addresses
        List<String> emails = Arrays.asList(
            "alice@gmail.com",
            "charlie@gmail.com",
            "bob@gmail.com",
            "david@gmail.com"
        );

        // Send notification email to each user
        emails.forEach(email ->
            sendEmailNotification(email)
        );
    }
}
