package com.interfaces.marker.serialization;

import java.util.Scanner;

public class DataSerializationBackupApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sample objects eligible for backup
        Employee emp = new Employee("E111", "Ringo", 90000.0, "Engineering");
        CustomerOrder order = new CustomerOrder("ORD-2026-001", "leena", 19999.50, "Delivered");

        System.out.println("Data Serialization & Backup Demo (using Serializable marker)");
        System.out.println("1 - Backup Employee object");
        System.out.println("2 - Backup Customer Order object");
        System.out.println("3 - Restore last backup and display");
        System.out.print("Choose option (1-3): ");

        int choice = input.nextInt();
        input.nextLine(); // consume newline

        String backupFile = "backup_data.ser";

        if (choice == 1) {
            System.out.println("\nOriginal: " + emp);
            BackupProcessor.createBackup(emp, backupFile);
        } else if (choice == 2) {
            System.out.println("\nOriginal: " + order);
            BackupProcessor.createBackup(order, backupFile);
        } else if (choice == 3) {
            Object restored = BackupProcessor.restoreBackup(backupFile);
            if (restored != null) {
                System.out.println("Restored object: " + restored);
            }
        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}