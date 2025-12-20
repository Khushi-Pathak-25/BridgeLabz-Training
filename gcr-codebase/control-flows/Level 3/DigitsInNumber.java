import java.util.Scanner;

public class DigitsInNumber{

    public static void main(String[]args){

       // Create Scanner Class Object
       Scanner input = new Scanner(System.in);
       
       // Create variable number and take user input 
       System.out.print("\nEnter number : ");
       int number = input.nextInt();
       
       // Create count variable and assign value 0
       int count = 0;
    
       // Count of digits in the number
       while(number != 0){
           count++;
           number/=10;
       }
       // Display count to show the number of digits
       System.out.println("Number of digits : "+count);
       
       input.close();
 
   }
}

