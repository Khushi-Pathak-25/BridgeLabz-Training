import java.util.Scanner;

public class ReverseNumberUsingArray{
    
    public static void main(String[] args){
        
        // Creating Scanner class object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Creating temp and count variables
        int temp = number;
        int count = 0;

        // Find count of digit
        while (temp > 0){
            count++;
            temp = temp / 10;
        }

        // Array to store digits
        int[] digit = new int[count];
       
        // Again initializing temp
        temp = number;

        // Store digits in reverse order 
        for (int i = 0; i < count; i++) {
            digit[i] = temp % 10;
            temp = temp / 10;
        }
   
        // Display reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digit[i]);
        }

        input.close();
    }
}
