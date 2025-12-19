import java.util.Scanner;

public class FizzBuzzArray{

    public static void main(String[] args){

        //Creating Scanner input
        Scanner input = new Scanner(System.in);

        //Taking number from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        //Checking whether the entered number is positive
        if (number > 0){
            //Creating String array to store result
            String[] result = new String[number+1];

            //Looping from 0 to the given number
            for (int i=0; i <= number; i++){

                // Checking if number is multiple of both 3 and 5
                if (i % 3==0 && i % 5==0){
                    result[i] = "FizzBuzz";
                }
                // Checking if number is multiple of 3
                else if (i % 3==0){
                    result[i] = "Fizz";
                }
                // Checking if number is multiple of 5
                else if (i % 5==0){
                    result[i] = "Buzz";
                }
                // If number is not a multiple of 3 or 5
                else{
                    //Taking number as it is
                    result[i] = String.valueOf(i);
                }
            }
            
            // Printing the array values with position
            System.out.println("\nFizzBuzz Results:");
            for (int i=1; i <= number; i++){
                System.out.println("Position " + i + " = " + result[i]);
            }

        } 
        else{
            // If the user enters negative number
            System.out.println("Please enter a positive integer.");
        }
        input.close();
    }
}

