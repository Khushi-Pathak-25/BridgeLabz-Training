import java.util.*;

public class Factor{

	public static void main (String args[]) {
	
		//Create Scanner class object.
		Scanner input = new Scanner(System.in);
		
		//Take input number from user.
		System.out.print("Enter number : ");
		int number = input.nextInt();

		//Find factors by iterating upto number
		int maxFactor = 10;
		int index = 0;
		int factors [] = new int [maxFactor];
		for (int i = 1; i <= number ; i++){
			
			//calculate factor.
			if(number % i == 0) {
				factors[index] = i;
				index++;
			}
			if(index == maxFactor) {
				maxFactor = 2*maxFactor;

				int[] temp = new int[maxFactor];
                
				//Syntax for copy an array
				//System.arraycopy(source, sourceStart, destination, destStart, length);

                		//Copy factors array into temp array
                		System.arraycopy(factors, 0, temp, 0, factors.length);

                		//Assign temp array to factors array
                		factors = temp;
			}
		}

		//print the factor array.
		System.out.print("Factors are : ");
		for(int i = 0; i < maxFactor; i++) {
			System.out.print(factors[i] + " ");
		}System.out.println();

		input.close();
	}
}