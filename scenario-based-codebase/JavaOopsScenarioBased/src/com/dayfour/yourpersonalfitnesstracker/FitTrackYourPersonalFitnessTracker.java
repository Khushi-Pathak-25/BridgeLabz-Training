/*11. "FitTrack – Your Personal Fitness Tracker"
Story: You’ve been hired to develop FitTrack, a fitness tracking app that monitors users'
workouts, calories, and daily progress.
Requirements:
● UserProfile class with fields like name, age, weight, goal.
● Workout class to track type, duration, caloriesBurned.
● Constructors to allow user creation with default or custom goals.
● ITrackable interface with startWorkout() and stopWorkout() methods.
● Use encapsulation to protect private health data (e.g., weight).
● Operators to compute calorie targets and progress (dailyTarget -
caloriesBurned).
● Inheritance: CardioWorkout, StrengthWorkout extend Workout.
● Polymorphism: calculateCalories() differs by workout type.
● Access modifiers to restrict internal workout logs from being exposed directly.*/

package com.dayfour.yourpersonalfitnesstracker;

import java.util.Scanner;

public class FitTrackYourPersonalFitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // -------- USER PROFILE INPUT --------
        System.out.println("Enter User Name:");
        String name = input.nextLine();

        System.out.println("Enter Age:");
        int age = input.nextInt();

        System.out.println("Enter Weight (kg):");
        double weight = input.nextDouble();

        System.out.print("Do you want to set custom daily calorie target? (yes/no): ");
        input.nextLine(); // consume newline
        String choice = input.nextLine();

        UserProfile user;

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Daily Calorie Target: ");
            double target = input.nextDouble();
            user = new UserProfile(name, age, weight, target);
        } else {
            user = new UserProfile(name, age, weight); // default 2500
        }

        System.out.println("\nUser Profile Created Successfully!");
        System.out.println("--------------------------------");

        // -------- WORKOUT SELECTION --------
        System.out.println("\nChoose Workout Type:");
        System.out.println("1. Cardio Workout");
        System.out.println("2. Strength Workout");
        int workoutChoice = input.nextInt();

        System.out.println("Enter Workout Duration (minutes):");
        int duration = input.nextInt();

        Workout workout;

        if (workoutChoice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        // -------- START WORKOUT --------
        workout.startWorkout();
        double caloriesBurned = workout.calculateCalories();
        workout.stopWorkout();

        // -------- DAILY PROGRESS --------
        double progress = user.computeProgress(caloriesBurned);

        System.out.println("\nWorkout Summary");
        System.out.println("--------------------");
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("Remaining Calories to Target: " + progress);

        input.close();
    }
}
