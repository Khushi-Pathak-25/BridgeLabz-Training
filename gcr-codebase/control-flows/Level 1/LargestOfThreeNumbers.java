import java.util.Scanner;

class LargestOfThreeNumbers{

    public static void main(String[]args){
 
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
          
          //Checking is the first number largest? 
          System.out.println("Is the first number the largest? "+((number1 > number2) && (number1  >  number3)));
          
          //Checking is the second number largest? 
          System.out.println("Is the second number the largest? "+((number2 > number1) && (number2  >  number3)));

          //Checking is the third number largest? 
          System.out.println("Is the third number the largest? "+((number3 > number1) && (number3  >  number2)));
   }
}