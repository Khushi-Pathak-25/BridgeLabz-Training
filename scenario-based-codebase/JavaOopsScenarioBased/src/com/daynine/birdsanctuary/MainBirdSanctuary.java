package com.daynine.birdsanctuary;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBirdSanctuary {

    static ArrayList<Bird> birds = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- EcoWing Bird Sanctuary ---");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Delete Bird by ID");
            System.out.println("6. Sanctuary Report");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bird Type (Eagle/Duck/Penguin/Kiwi/Seagull): ");
                    String type = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    addBird(type, name, id);
                    break;

                case 2:
                    displayAll();
                    break;

                case 3:
                    displayFlying();
                    break;

                case 4:
                    displaySwimming();
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    deleteBird(sc.nextLine());
                    break;

                case 6:
                    report();
                    break;
            }

        } while (choice != 7);

        sc.close();
    }

    // Helper Methods

    static void addBird(String type, String name, String id) {

        if (type.equalsIgnoreCase("Eagle"))
            birds.add(new Eagle(name, id));

        else if (type.equalsIgnoreCase("Duck"))
            birds.add(new Duck(name, id));

        else if (type.equalsIgnoreCase("Penguin"))
            birds.add(new Penguin(name, id));

        else if (type.equalsIgnoreCase("Kiwi"))
            birds.add(new Kiwi(name, id));

        else if (type.equalsIgnoreCase("Seagull"))
            birds.add(new Seagull(name, id));

        else
            System.out.println("Invalid bird type!");
    }

    static void displayAll() {
        for (Bird b : birds) {
            System.out.println(b.getInfo());
            b.eat();

            if (b instanceof Flyable)
                ((Flyable) b).fly();

            if (b instanceof Swimmable)
                ((Swimmable) b).swim();
        }
    }

    static void displayFlying() {
        for (Bird b : birds)
            if (b instanceof Flyable)
                System.out.println(b.getInfo());
    }

    static void displaySwimming() {
        for (Bird b : birds)
            if (b instanceof Swimmable)
                System.out.println(b.getInfo());
    }

    static void deleteBird(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }

    static void report() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("Fly only: " + fly);
        System.out.println("Swim only: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}

