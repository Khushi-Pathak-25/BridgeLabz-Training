import java.util.Scanner;

public class NumberCheckerProgram2 {

    // Method to count digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number=number/10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count-1;

        while (number != 0) {
            digits[index] = number%10;
            number = number/10;
            index--;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit: digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
	
        int sum = sumOfDigits(digits);
        if (sum == 0) {
            return false;
        }
		
        return number%sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
	
	    //calculate frequency of digits 0-9
        int[] freq = new int[10];
        for (int i=0 ;i<digits.length;i++) {
            freq[digits[i]]++;
        }
        int[][]frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
		   // For storing digit 
           frequency[i][0] = i; 
		   // For Frequency
           frequency[i][1] = freq[i]; 
        }
        return frequency;
    }

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("\nNumber of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        if (isHarshadNumber(number, digits)) {
            System.out.println("Harshad number");
        } 
		else {
            System.out.println("Not a Harshad number");
        }

        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency :");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + " " + frequency[i][1]);
            }
        }

        input.close();
    }
}
