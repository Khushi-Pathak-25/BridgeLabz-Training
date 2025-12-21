import java.util.Scanner;

public class QuotientAndRemainder {

    // Create method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        // Calculate quotient and remainder
        int quotient = number/divisor;
        int remainder = number%divisor;
        
		// return value of quotient and remainder
        return new int[] {quotient,remainder};
    }

    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);
        
		// Take number from user
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
		// Take divisor from user
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();
        
		// Create result array and call the method 
        int[] result = findRemainderAndQuotient(number,divisor);
		
        // Display output 
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);
		
		input.close();
    }
}
