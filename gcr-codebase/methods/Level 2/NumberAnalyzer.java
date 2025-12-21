import java.util.Scanner;

public class NumberAnalyzer {

    // Create method to check whether number is positive or negative
    public static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } 
		else {
            return false;
        }
    }

    // Create method to check whether number is even or odd
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
		else {
            return false;
        }
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2
    // Returns 0 if both are equal
    // Returns -1 if number1 < number2
    public static int compareTwoNumbers(int number1,int number2) {
        if (number1 > number2) {
            return 1;
        } 
		else if (number1 == number2) {
            return 0;
        } 
		else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Taking input
        for (int i = 0; i < numbers.length; i++) {
		    // Taking number from users
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even");
                }
				else {
                    System.out.println("Odd");
                }

            }
			else {
                System.out.println(numbers[i] + " is Negative.");
            }
        }

        // Comparing first and last element
        int output = compareTwoNumbers(numbers[0], numbers[numbers.length - 1]);

        if (output == 1){
            System.out.println("First number is greater than the last number.");
        } 
		else if (output == 0){
            System.out.println("First number is equal to the last number.");
        } 
		else {
            System.out.println("First number is less than the last number.");
        }

        input.close();
    }
}
