import java.util.Scanner;

class PersonCanVote{

    public static void main(String[]args){

        //Creating Scanner class object
	Scanner input = new Scanner(System.in);
        
        //Taking Person's age
        System.out.print("\nEnter Person's age : ");
        int age = input.nextInt();
  
        //Checking whether the person can vote or not
        if(age>=18){
            System.out.println("The person's age is "+ age +" and can vote.");
        }
        else{
            System.out.println("The person's age is "+ age +" and cannot vote.");
        }
   }
}   
         
    