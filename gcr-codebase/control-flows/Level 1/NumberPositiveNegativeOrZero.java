import java.util.Scanner;

class NumberPositiveNegativeOrZero{

    public static void main(String[]args){
 
        //Creating Scanner class object
	Scanner input = new Scanner(System.in);

        //Taking input for number
        System.out.print("\nEnter number : ");
        int number = input.nextInt();
       
        //Checking whether a number is positive, negative, or zero
        if(number>0){
            System.out.println("positive");
        }
        else if(number<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
        input.close();
   }
}