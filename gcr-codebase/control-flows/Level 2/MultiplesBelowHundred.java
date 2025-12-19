import java.util.Scanner;

public class MultiplesBelowHundred{

    public static void main(String[] args){

        // Creating Scanner class object
        Scanner input=new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        // Checking if number is positive and less than 100
        if (number<= 0 || number >=100){
            System.out.println("Please enter valid number ");
        } 
        else{
            System.out.println("Multiples of " + number + " below 100 are:");

            // Run for loop backward
            for (int i = 100; i >= 1; i--){

                // Check if i is a multiple of the number
                if (i % number == 0){
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
