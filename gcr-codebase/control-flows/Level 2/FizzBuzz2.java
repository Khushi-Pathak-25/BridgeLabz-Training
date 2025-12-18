import java.util.Scanner;

class FizzBuzz2{

    public static void main(String[]args){
     
        //Create Scanner class object
        Scanner input = new Scanner(System.in);
        
        //Take integer input from user
	System.out.print("\nEnter number : ");
	int number = input.nextInt();

	//Check for positive number
	if (number < 0) {
	    System.out.println("number is not positive");
	}
 
        //number is positive
        else{
            //initializing the value of i
            int i= 1;

            //Taking while loop
            while(i <= number){

                // multiples of 3 print Fizz
                if(i % 3 == 0 && i % 15!=0){
                    System.out.println("Fizz");
                }

                //multiples of 5 print "Buzz"
                else if(i % 5 == 0 && i % 15!=0){
                    System.out.println("Buzz");
                }
            
                //multiples of both print "FizzBuzz"
                else if(i % 15 == 0){
                    System.out.println("FizzBuzz"); 
                } 
            
                else{
                    System.out.println(i);
                }

                //incrementing value of i by 1
                i++;
            }
        }

        input.close();
    }
}
