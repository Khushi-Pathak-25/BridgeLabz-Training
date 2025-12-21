import java.util.Scanner;

public class SmallestLargest {

    // Create  method to find smallest and largest
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
	
        // Declare smallest and largest to number1
        int smallest = number1;
        int largest = number1;
    
	    // Check condition for smallest
        if (number2 < smallest) {
            smallest = number2;
		}	
        if (number3 < smallest) {
            smallest = number3;
		}	

        // Check condition for largest
        if (number2 > largest) {
            largest = number2;
		}	
        if (number3 > largest) {
            largest = number3;
		}	
    
	    // return value of smallest and largest
        return new int[] { smallest, largest };
    }


    public static void main(String[] args) {
	
        // Create Scanner class object
        Scanner input = new Scanner(System.in);
        
		// Take inputs from user 
        System.out.print("Enter first number : ");
        int number1 = input.nextInt();

        System.out.print("Enter second number : ");
        int number2 = input.nextInt();

        System.out.print("Enter third number : ");
        int number3 = input.nextInt();
        
		// Create array and calling method
        int[] result = findSmallestAndLargest(number1,number2,number3);
		
		// Display output
        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
		
		input.close();
    }
}
