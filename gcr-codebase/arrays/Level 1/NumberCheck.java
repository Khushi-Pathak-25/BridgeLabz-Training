import java.util.Scanner;

class NumberCheck {

    public static void main(String[]args){

        // Create Scanner class object
        Scanner input=new Scanner(System.in);
       
        // Creating an array for 5 numbers
        int numbers[]=new int[5];
        
        //Taking numbers from user
        for(int i=0;i<numbers.length;i++){
            System.out.print("\nEnter number : "+ (i+1) +" = ");
            numbers[i]=input.nextInt();
        }

        for(int i=0; i<numbers.length; i++){
            //Checking whether a number is positive, negative, or zero
            if(numbers[i]<0){
                System.out.println("negative");
            } 
            else if(numbers[i]==0){
                System.out.println("zero");
            }
            else{
	        //check for even value
		if (numbers[i] % 2 == 0) {
		     System.out.println(numbers[i] + " is even number");
		} 
                else {
	 	     System.out.println(numbers[i] + " is odd number");
		}
	    }
        }   
         
        // Compare the first and last element
        if(numbers[0]<numbers[numbers.length-1]){
            System.out.println("first element is less than last element");
        }
        else if(numbers[0]>numbers[numbers.length-1]){
            System.out.println("first element is greater than last element");
        }      
        else{
            System.out.println("first element and last element are equal");
        }

        input.close();
    }
}     
            

     
        