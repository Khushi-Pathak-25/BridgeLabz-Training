package com.lambdas.notification;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFilterApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// sample alerts
	List<Alert> alerts = new ArrayList<>();
	alerts.add(new Alert("P01", "Blood pressure dropped", "Critical", true));
	alerts.add(new Alert("P02", "Routine checkup reminder", "Low", false));
	alerts.add(new Alert("P03", "Fever detected 39.2°C", "High", true));
	alerts.add(new Alert("P04", "Medication time", "Medium", false));
	alerts.add(new Alert("P05", "Heart rate irregular", "Critical", true));

	System.out.println("Hospital Notification Filtering Demo");
	System.out.println("Available filter options:");
	System.out.println("1 - Show only critical alerts");
	System.out.println("2 - Show urgent alerts only");
	System.out.println("3 - Show high severity or above");
	System.out.println("4 - Show all alerts");
	System.out.print("Choose filter (1-4): ");

	int choice = input.nextInt();
	input.nextLine(); // consume newline

	// Define different filtering behaviors using Predicate + lambda
	Predicate<Alert> filter;

	switch (choice) {
	case 1:
	    // Only critical severity
	    filter = alert -> "critical".equalsIgnoreCase(alert.getSeverity());
	    break;

	case 2:
	    // Only urgent alerts
	    filter = Alert::isUrgent;
	    break;

	case 3:
	    // High or Critical
	    filter = alert -> {
		String sev = alert.getSeverity().toLowerCase();
		return sev.equals("high") || sev.equals("critical");
	    };
	    break;

	case 4:
	    // Show all (always true)
	    filter = _ -> true;
	    break;

	default:
	    System.out.println("Invalid choice. Showing all alerts.");
	    filter = _ -> true;
	    break;
	}

	// Filter alerts using the chosen Predicate (lambda)
	List<Alert> filteredAlerts = alerts.stream().filter(filter).collect(Collectors.toList());

	System.out.println("\nFiltered Notifications (" + filteredAlerts.size() + " shown):");
	if (filteredAlerts.isEmpty()) {
	    System.out.println("No alerts match the selected filter.");
	} else {
	    filteredAlerts.forEach(System.out::println);
	}

	input.close();
    }
}