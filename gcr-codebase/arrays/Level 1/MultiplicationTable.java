import java.util.Scanner;

class MultiplicationTable{

    public static void main(String[]args){
 
        //Creating Scanner class object
	Scanner input = new Scanner(System.in);

        //Taking input for number
        System.out.print("\nEnter number : ");
        int number = input.nextInt();
  
        //Creating array to store multiplication table
        int result[]=new int[10];

        for(int i=0;i<result.length;i++){
            result[i]=number * (i+1) ;
            System.out.println( number +"*"+ (i+1) +" = "+ result[i] );
        }

        input.close();
    }
}
   