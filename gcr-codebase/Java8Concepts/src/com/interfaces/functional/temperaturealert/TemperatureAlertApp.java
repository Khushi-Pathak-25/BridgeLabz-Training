package com.interfaces.functional.temperaturealert;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Alert System (using Predicate<Double>)");
        System.out.print("Enter current temperature (°C): ");
        double temp = input.nextDouble();

        TemperatureSensor sensor = new TemperatureSensor(temp);

        System.out.println("\nChoose alert condition:");
        System.out.println("1 - High temperature alert (> 35°C)");
        System.out.println("2 - Freezing alert (< 0°C)");
        System.out.println("3 - Custom threshold alert (> user value)");
        System.out.print("Select option (1-3): ");

        int choice = input.nextInt();
        Predicate<Double> alertCondition;

        switch (choice) {
            case 1:
                // high temperature alert
                alertCondition = t -> t > 35.0;
                break;

            case 2:
                // freezing alert
                alertCondition = t -> t < 0.0;
                break;

            case 3:
                System.out.print("Enter custom threshold value (°C): ");
                double threshold = input.nextDouble();
                alertCondition = t -> t > threshold;
                break;

            default:
                System.out.println("Invalid choice. Using default high temperature alert (> 35°C).");
                alertCondition = t -> t > 35.0;
                break;
        }

        System.out.println("\nChecking temperature...");
        sensor.checkAndAlert(alertCondition);

        // optional: change temperature and re-check
        System.out.print("\nDo you want to change temperature and re-check? (yes/no): ");
        input.nextLine(); // consume newline
        String response = input.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            System.out.print("Enter new temperature (°C): ");
            double newTemp = input.nextDouble();
            sensor.setTemperature(newTemp);
            System.out.println("Re-checking...");
            sensor.checkAndAlert(alertCondition);
        }

        System.out.println("\n" + sensor);

        input.close();
    }
}