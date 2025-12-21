import java.util.Scanner;

public class NumberCheckerProgram5 {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {

        int sum = 0;

        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfectNumber(int number) {
	
        if (number <= 0) {
            return false;
        }
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundantNumber(int number) {
	
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficientNumber(int number) {

        return sumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial
    public static int factorial(int digit) {
	
        int factorialOfNumber = 1;

        for (int i = 1; i <= digit; i++) {
            factorialOfNumber *= i;
        }
        return factorialOfNumber;
    }

    // Method to check Strong Number
    // Strong --> sum of factorial of digits equals the number
    public static boolean isStrongNumber(int number) {

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp = temp / 10;
        }

        return sum == number;
    }

    // Main method 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if (isPerfectNumber(number)){
            System.out.println("Perfect Number");
		}	
        else {
            System.out.println("Not a Perfect Number");
		}	

        if (isAbundantNumber(number)){
            System.out.println("Abundant Number");
		}	
        else{
            System.out.println("Not an Abundant Number");
        }
		
        if (isDeficientNumber(number)){
            System.out.println("Deficient Number");
		}
        else{
            System.out.println("Not a Deficient Number");
        }
		
        if (isStrongNumber(number)){
            System.out.println("Strong Number");
		}	
        else{
            System.out.println("Not a Strong Number");
        }
		
        input.close();
    }
}
