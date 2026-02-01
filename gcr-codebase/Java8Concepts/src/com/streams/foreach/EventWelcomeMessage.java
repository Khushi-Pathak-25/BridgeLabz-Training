package com.streams.foreach;

import java.util.*;

public class EventWelcomeMessage {
    public static void main(String[] args) {

        // List of event attendees
        List<String> attendees = Arrays.asList(
            "Alice", "David", "Charlie", "Bob", "Edward"
        );

        // Print welcome message for each attendee
        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
