import java.util.Scanner;

public class NumberCheckerProgram3 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Method to store digits of number in an array
    public static int[] storeDigits(int number) {
	
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index--;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {

        int[] reversed = new int[digits.length];
        int index = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[index] = digits[i];
            index++;
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }
        // Iterating loop to compare arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] !=array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check Palindrome Number using digits
    public static boolean isPalindrome(int[] digits) {

        int[] reversedArray = reverseDigits(digits);
        return compareArrays(digits, reversedArray);
    }

    // Method to check Duck Number
    // Duck number contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
	
        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Number of digits : " + countDigits(number));

        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        if (isPalindrome(digits)) {
            System.out.println("\nPalindrome number");
        } 
		else {
            System.out.println("\nNot a Palindrome number.");
        }

        if (isDuckNumber(digits)) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a Duck number");
        }

        input.close();
    }
}
