import java.util.Scanner;

public class FactorsOfNumber {

    // Create method to find factor of number
    public static int [] findFactors(int number){
	    int count = 0;
	    for(int i = 1; i<=number ;i++){
		    if(number % i ==0){
			count++; 
			}
		}
		int factors []=new int[count];
		int index =0;
		for(int i = 1; i<=number ; i++){
		    if(number % i == 0){
		    factors[index] = i;
			index++;
            }			
		}
		return factors;
	}  
    
	// Create method to find sum of factor
	public static int findSumOfFactors(int factors[]){
	    int sum =0 ;
		for(int i =0; i< factors.length; i++){
		    sum+=factors[i];
		}
		return sum;
	}
	
	// Create method to find product of factor
	public static long findProductOfFactors(int factors[]){
	    long product = 1;
		for(int i = 0; i< factors.length; i++){
		    product*=factors[i];
		}
		return product;
	}
	
	// Create method to find sum of squares of factor
	public static double findSumOfSquares(int factors[]){
	    double sum = 0.0;
	    for(int i = 0; i< factors.length; i++){
		    sum+= Math.pow(factors[i],2);
		}
		return sum;
	} 
	
	
    public static void main (String [] args){
	
	// Create Scanner class object
	Scanner input = new Scanner(System.in);
	
	// Take the input for a number
	System.out.print("Enter number : ");
	int number = input.nextInt();
	
	int factors [] =  findFactors(number);
	
	System.out.println("Factors of " + number + ":");
	    // Display factors
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
		
    System.out.println();
	
	int sum = findSumOfFactors(factors);
	
	long product = findProductOfFactors(factors);
	
	double sumOfSquares = findSumOfSquares(factors);
	
	// Display sum , product and sum of squares
	System.out.println("Sum of factors = " + sum);
    System.out.println("Product of factors = " + product);
    System.out.println("Sum of squares of factors = " + sumOfSquares);
	
	input.close();
	
	}    

}