import java.util.Scanner;

public class ChocolatesDistribution {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        
		// Chocolates each child will get and the remaining chocolates
        int getChocolates = number / divisor;
        int remainingChocolates = number % divisor;
        
		// return value of chocolates get and remaining chocolates
        return new int[]{getChocolates, remainingChocolates};
    }

    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);
        
		// Take number of chocolates 
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
		// Take number of children
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        
		// Calling method and store result in array 
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        
		// Display output
        System.out.println("Each child will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates = " + result[1]);
		
		input.close();
    }
}
