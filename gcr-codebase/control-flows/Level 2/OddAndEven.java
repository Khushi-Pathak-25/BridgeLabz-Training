import java.util.*;

class OddAndEven {

    public static void main(String[] args) {
    
        //Create Scanner class object
	Scanner input = new Scanner(System.in);

	//Take integer input from user
	System.out.print("\nEnter number : ");
	int number = input.nextInt();

	//Check for natural number
	if (number < 0) {
	    System.out.println("number is not natural number");
	} 
        else {
	    // Using for loop to iterate 1 to the number
	    for (int i = 1; i <= number; i++) {

	         //check for even value
		 if (i % 2 == 0) {
		     System.out.println(i + " is even number");
		 } 
                 else {
	 	     System.out.println(i + " is odd number");
		}
	    }
	}

        input.close();
    }
}     

