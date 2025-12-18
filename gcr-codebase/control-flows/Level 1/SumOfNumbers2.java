import java.util.Scanner;

class SumOfNumbers2{

    public static void main(String[]args){

        //Creating Scanner class object
	Scanner input = new Scanner(System.in);

        //Creating variable total of type double and initializing value
        double total = 0.0;
        
        //Taking double value from user
        System.out.print("\nEnter the input : ");
        double userValue = input.nextDouble();
        
        //Taking infinite while loop
        while(true){

            //Adding value to total
            total+= userValue;

            //Again taking the value from user till the user enters zero 
            System.out.print("\nEnter the input again : ");
            userValue=input.nextDouble();

            if(userValue<=0){
                break;
            }
        }
        //Printing sum of numbers
        System.out.println("sum of numbers : "+total);
        input.close();
    }
}   