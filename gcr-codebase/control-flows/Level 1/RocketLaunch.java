import java.util.Scanner;

class RocketLaunch{

    public static void main(String[]args){
 
        //Creating Scanner class object
	Scanner input = new Scanner(System.in);

        //Taking input for counter
        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();

        //Checking the counter
        while(counter >= 1){
            System.out.println(counter);
            counter--;
        }
        
        System.out.println("rocket launch");
        input.close();
    }
}
     
            

