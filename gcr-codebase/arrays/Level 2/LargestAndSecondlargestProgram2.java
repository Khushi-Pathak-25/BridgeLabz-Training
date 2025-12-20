import java.util.Scanner;

public class LargestAndSecondlargestProgram2 {

    public static void main(String[]args){

       // Create Scanner Class Object
       Scanner input = new Scanner(System.in);
       
       // Create variable number and take user input 
       System.out.print("\nEnter number : ");
       int number = input.nextInt();
        
       // Create variable maxDigit and initialize to 10
       int maxDigit = 10;
       
       // Create array of size maxDigit
       int digit[] = new int [maxDigit];
    
       // Create variable index and set value 0
       int index = 0;
       
       // Take while loop 
       while(number != 0){
       
           // Break if maxDigit limit reached
            if (index == maxDigit) {
          
                // increase maxDigit by 10
                maxDigit+=10;
                // Create temp array
                int temp [] = new int [maxDigit];
        
                // Copy old array into temp array
                for (int i = 0; i < digit.length; i++) {
                    temp[i] = digit[i];
                }

                // Assign temp array to digits
                digit = temp;         
             
            }
           
           // For last digit
            digit[index] = number % 10;

            // Remove last digit
            number = number / 10;

            // Increment index
            index++;         
       }
       
       // Create variable largest and second largest digit 
       int largestDigit = 0;
       int secondLargestDigit = 0;
       
       // Loop for largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digit[i] > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digit[i];
            } 
            else if (digit[i] > secondLargestDigit && digit[i] != largestDigit) {
                secondLargestDigit = digit[i];
            }
        }

        // Print largest and second largest digit
        System.out.println("Largest digit: " + largestDigit);
        System.out.println("Second largest digit: " + secondLargestDigit);

        input.close();
    }
} 