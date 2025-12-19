import java.util.Scanner;

public class FactorsOfNumber2{

    public static void main(String[] args){

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a positive 
        if (number <= 0){
            System.out.println("Please enter a positive integer.");
        }
        else{

             // Initialize number 
             int i = 1;

             // Run while loop
             while (i < number){

                // Check if number is divisible by i
                if (number % i == 0){
                    System.out.println(i);
                }

                // Increment i
                i++;
            }
        }        

        input.close();
    }
}
