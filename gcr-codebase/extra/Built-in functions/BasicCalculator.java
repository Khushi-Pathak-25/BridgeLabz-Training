import java.util.Scanner;

public class BasicCalculator {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose an operation: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 2:
                result = subtract(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 3:
                result = multiply(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 4:
                result = divide(num1, num2);
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
