import java.util.Scanner;

public class EvenOddArray{
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Take number from user
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        //Check for Natural Number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            //exit the program
            return;  
        }

        // Creating arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Index variables for odd and even number
        int evenIndex = 0;
        int oddIndex = 0;
        // Store odd and even numbers
        for (int i = 1; i <= number; i++){
            if (i % 2 == 0){
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } 
            else{
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        
        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        input.close();
    }
}
