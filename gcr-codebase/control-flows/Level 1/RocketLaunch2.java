import java.util.Scanner;

class RocketLaunch2{

    public static void main(String[]args){
 
        //Creating Scanner class object
	Scanner input = new Scanner(System.in);

        //Taking input for counter
        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();

        //Checking the counter
        for(int i = counter; i>=1; i--){
            System.out.println(i);
        }
        
        System.out.println("rocket launch");
        input.close();
    }
}
     
