package com.streams.streamsapi;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class GymMember {
    String name;
    LocalDate expiryDate;

    // Create Constructor
    GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}

public class GymExpiringMemberships {
    public static void main(String[] args) {

        // Today's date
        LocalDate today = LocalDate.now();

        // List of gym members
        List<GymMember> members = Arrays.asList(
            new GymMember("Alice", today.plusDays(10)),
            new GymMember("Bob", today.plusDays(40)),
            new GymMember("Charlie", today.plusDays(25)),
            new GymMember("David", today.plusDays(5)),
            new GymMember("Edward", today.plusDays(60))
        );

        // Filter members whose membership expires in next 30 days
        members.stream()

               // Check expiry date is before or equal to next 30 days
               .filter(member ->
                   member.getExpiryDate().isBefore(today.plusDays(30))
               )

               // Print expiring members
               .forEach(member ->
                   System.out.println(
                       member.getName() + " expires on " + member.getExpiryDate()
                   )
               );
    }
}
