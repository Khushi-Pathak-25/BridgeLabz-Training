/* Problem 2: Maya’s BMI Fitness Tracker
Maya is a fitness coach who wants to calculate BMI for her clients.
Write a Java program that takes height and weight as input,
calculates BMI using the formula BMI = weight / (height * height), 
and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. 
Use meaningful variable names and proper comments to maintain clean code.*/

import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         //Get user inputs in double
        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();
		
        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();
		
        //Calculate bmi 
        double bmi = weight / (height * height);

        //determine the weight status of the person
        if (bmi <= 18.4) {
            System.out.println("BMI is " + bmi + " and status is Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI is " + bmi + " and status is Normal");
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("BMI is " + bmi + " and status is Overweight");
        }
        else {
            System.out.println("BMI is " + bmi + " and status is Obese");
        }
        input.close();
    }
}