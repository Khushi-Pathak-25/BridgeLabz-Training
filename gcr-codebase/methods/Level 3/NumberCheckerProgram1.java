import java.util.Arrays;
import java.util.Scanner;
public class NumberCheckerProgram1{

    // Create method for count the digit in the number
    public static int countDigitsInNumber(int number) {
        int count = 0;
        int temp = number;
        
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    // Create method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
	
        int count = countDigitsInNumber(number);
		// Store digits of the number
        int[] digits = new int[count];

        int index = count - 1;
        int temp = number;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index--;
        }

        return digits;
    }

    // Create method to check duck number
    public static boolean isDuckNumber(int[] digits) {
        
		// Iterating for loop 
        for (int digit : digits) {
            if (digit!= 0) {
                return true;
            }
        }
        return false;
    }


    //Create method to check an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
		    // using Math class function
            sum+= Math.pow(digit, power);
        }
        return sum == number;
    }

    // Create method for the largest and second largest elements
    public static int[] findLargestAndSecondLargest(int[] digits) {
	
        int largestDigit = Integer.MIN_VALUE;
        int secondLargestDigit = Integer.MIN_VALUE;
		
        for (int digit : digits) {
            if (digit > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digit;
            } 
			else if (digit > secondLargestDigit && digit < largestDigit) {
                secondLargestDigit = digit;
            }
        }
		
        return new int[]{largestDigit,secondLargestDigit};
    }

    // Create method for the smallest and second smallest elements
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
	
        int smallestDigit = Integer.MAX_VALUE;
        int secondSmallestDigit = Integer.MAX_VALUE;
		
        for (int digit : digits) {
            if (digit < smallestDigit) {
                secondSmallestDigit = smallestDigit;
                smallestDigit = digit;
            } 
			else if (digit < secondSmallestDigit && digit > smallestDigit) {
                secondSmallestDigit = digit;
            }
        }
		
        return new int[]{smallestDigit, secondSmallestDigit};
    }

    public static void main(String[] args) {
	    // Create Scanner class object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt(); 

        int digitCount = countDigitsInNumber(number);
		// Printing digit count
        System.out.println("Count of digits in " + number + ": " + digitCount);

        int[] digits = storeDigits(number);
		// Printing digit array
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));

        boolean isDuck = isDuckNumber(digits);
		// Printing result of Duck Number
        System.out.println(number + " is a Duck Number: " + isDuck);

        boolean isArmstrong = isArmstrongNumber(number);
		// Printing result of Armstrong Number
        System.out.println(number + " is an Armstrong Number: " + isArmstrong);

        int[] largestNumbers = findLargestAndSecondLargest(digits);
		// Printing result of Largest and Second Largest
        System.out.println("Largest digit : " + largestNumbers[0]);
        System.out.println("Second largest digit : " + largestNumbers[1]);

        int[] smallestNumbers = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit : " + smallestNumbers[0]);
		// Printing result of smallest and second smallest
        System.out.println("Second smallest digit : " + smallestNumbers[1]);
		
        input.close();
    }
}