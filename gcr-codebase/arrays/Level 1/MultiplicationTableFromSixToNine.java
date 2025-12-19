import java.util.Scanner;

public class MultiplicationTableFromSixToNine{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Take number input from user
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		// Array to store the multiplication result
		int multiplicationResult[] = new int[10];
		
		//Check for 6 to 9
		if(number<6 || number>9){
			System.out.println("Enter a valid input");
		} else{
			for(int i=0; i<multiplicationResult.length; i++){
				multiplicationResult[i]=number * (i+1) ;
				System.out.println( number +"*"+ (i+1) +" = "+ multiplicationResult[i] );
			}
		}
		input.close();
	}
}