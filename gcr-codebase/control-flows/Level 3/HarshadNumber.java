import java.util.Scanner;

public class HarshadNumber {
    public static void main(String args[]){
	
	    // Create Scanner class object
	    Scanner input = new Scanner(System.in);
		
		// Get input for the number
		System.out.print("\nEnter number : ");
		int number = input.nextInt();
		
		// Create variable sum and initialize to 0
		int sum = 0;
		
		int temp = number;
		
		// Loop to access each digit of number
		while(temp != 0){
		int remainder = temp % 10;
		sum+= remainder;
		temp/=10;
		}
		
		// Check if the number is divisible by the sum  
		if(number % sum ==0){
		    System.out.println("Harshad Number");
		}
		else{
		    System.out.println("Not a Harshad Number");
		}
		
		input.close();
	}
}