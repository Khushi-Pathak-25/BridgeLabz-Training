import java.util.Scanner;

class SmallestOfThreeNumbers {

	public static void main(String args[]) {

	      //Creating Scanner class object
	      Scanner input = new Scanner(System.in);

	      //Taking three numbers from user
	      System.out.print("\nEnter first number : ");
	      int number1 = input.nextInt();
	      System.out.print("\nEnter second number : ");
	      int number2 = input.nextInt();
	      System.out.print("\nEnter third number : ");
	      int number3 = input.nextInt();
              System.out.println();

	      //Checking condition is first number is smallest
	      System.out.println("Is the first number the smallest? " + ((number1 < number2) && (number1  <  number3)));
       }
}      