import java.util.Scanner;

public class NumberCheckerProgram4 {

    // Method to check Prime Number
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon Number
    // Neon number --> sum of digits of square equals the number
    public static boolean isNeonNumber(int number) {

        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square = square / 10;
        }
        return sum == number;
    }

    // Method to check Spy Number
    // Spy-->sum of digits equals product of digits
    public static boolean isSpyNumber(int number) {

        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp = temp / 10;
        }
        return sum == product;
    }

    // Method to check Automorphic Number
    // Automorphic --> square ends with the number
    public static boolean isAutomorphicNumber(int number) {

        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (temp%10 != square%10) {
                return false;
            }
            temp = temp/10;
            square = square/10;
        }
        return true;
    }

    // Method to check Buzz Number
    // Buzz-->divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int number) {

        return (number%7 == 0 || number % 10==7);
    }

    // Main method
    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if (isPrime(number)){
            System.out.println("Prime Number");
		}	
        else{
            System.out.println("Not a Prime Number");
		}	

        if (isNeonNumber(number)){
            System.out.println("Neon Number");
		}	
        else{
            System.out.println("Not a Neon Number");
		}	

        if (isSpyNumber(number)){
            System.out.println("Spy Number");
		}	
        else{
            System.out.println("Not a Spy Number");
		}	

        if (isAutomorphicNumber(number)){
            System.out.println("Automorphic Number");
		}	
        else{
            System.out.println("Not an Automorphic Number");
		}	

        if (isBuzzNumber(number)){
            System.out.println("Buzz Number");
		}	
        else{
            System.out.println("Not a Buzz Number");
		}	

        input.close();
    }
}
