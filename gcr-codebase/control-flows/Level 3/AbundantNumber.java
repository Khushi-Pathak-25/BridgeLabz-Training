import java.util.Scanner;

public class  AbundantNumber {
    public static void main(String args[]){
	
	    // Create Scanner class object
	    Scanner input = new Scanner(System.in);
		
		// Get input for the number
		System.out.print("\nEnter number : ");
		int number = input.nextInt();
		
		// Create variable sum and initialize to 0
		int sum = 0;
		
		//  for loop from i = 1 to i < number
		for(int i=1 ;i<number;i++){
		    if(number % i == 0){
			sum+=i;
			}
		}
		//  Check if sum is greater than number
		if(sum>number){
		    System.out.println("Abundant Number");
		}
		else{
		    System.out.println("Not an Abundant Number");  
		}
		
		input.close();		
	}
}