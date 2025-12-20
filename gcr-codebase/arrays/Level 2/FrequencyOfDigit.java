import java.util.Scanner;

public class FrequencyOfDigit {

    public static void main(String[]args){

       // Create Scanner Class Object
       Scanner input = new Scanner(System.in);
       
       // Create variable number and take user input 
       System.out.print("\nEnter number : ");
       int number = input.nextInt();
       
       int count = 0,temp=number;
    
       // count of digits in the number
       while(temp != 0){
           count++;
           temp/=10;
       }
        
       // Create array for storing digits
       int digit[] = new int[count];
       for(int i = 0; i < count; i++){
           digit[i] = number % 10;
           number/=10;
       }

       // Count frequency of each digit
       int frequency[] = new int[10];
       for(int i=0; i<digit.length;i++){
          frequency[digit[i]]++;
       }
       
       // Disply frequency of each digit
       for(int i=0; i<frequency.length; i++){
           System.out.println(i+":"+frequency[i]);
       }
       
       input.close();
    }
}

