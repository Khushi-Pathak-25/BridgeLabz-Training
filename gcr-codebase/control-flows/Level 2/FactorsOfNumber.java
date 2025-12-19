import java.util.Scanner;

public class FactorsOfNumber{

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
        else {
            System.out.println("Factors of " + number + " are:");
         
            for (int i = 1; i < number; i++){

                // Check if number is divisible by i
                if (number % i == 0){
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
