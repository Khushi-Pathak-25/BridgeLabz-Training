package com.interfaces.staticmethods.unitconversion;

import java.util.Scanner;

public class UnitConversionApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Logistics Unit Conversion Tool");
        System.out.println("Available conversions:");
        System.out.println("1 - Kilometers to Miles");
        System.out.println("2 - Miles to Kilometers");
        System.out.println("3 - Kilograms to Pounds");
        System.out.println("4 - Pounds to Kilograms");
        System.out.println("5 - Exit");
        System.out.println("------------------------------------------------");

        while (true) {
            System.out.print("\nChoose conversion (1-5): ");
            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Exiting conversion tool...");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please select 1-5.");
                continue;
            }

            System.out.print("Enter value to convert: ");
            double value = input.nextDouble();

            double result;
            String fromUnit, toUnit;

            switch (choice) {
                case 1:
                    result = UnitConverter.kmToMiles(value);
                    fromUnit = "km";
                    toUnit = "miles";
                    break;
                case 2:
                    result = UnitConverter.milesToKm(value);
                    fromUnit = "miles";
                    toUnit = "km";
                    break;
                case 3:
                    result = UnitConverter.kgToLbs(value);
                    fromUnit = "kg";
                    toUnit = "lbs";
                    break;
                case 4:
                    result = UnitConverter.lbsToKg(value);
                    fromUnit = "lbs";
                    toUnit = "kg";
                    break;
                default:
                    continue;
            }

            System.out.println(UnitConverter.formatResult(value) + " " + fromUnit +
                    " = " + UnitConverter.formatResult(result) + " " + toUnit);
        }

        input.close();
    }
}