import java.util.Scanner;

class NaturalNumber{

    public static void main(String[]args){
 
        //Creating Scanner class object
	Scanner input = new Scanner(System.in);

        //Taking input for number
        System.out.print("\nEnter number : ");
        int number = input.nextInt();
        //Creating and initializing sum variable to 0;
        int sum = 0;

        //Checking for natural number
        if(number > 0){
            //sum of n natural numbers is n * (n+1) / 2 
            sum = number * (number+1) / 2;
            System.out.println("The sum of "+ number +" natural numbers is "+sum);
        }
        else{
            System.out.println("The number "+ number +" is not a natural number");
        }
    }
}    