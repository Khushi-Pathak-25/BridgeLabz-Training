import java.util.Scanner;

class IntOperation{

    public static void main(String[]args){

        //Declare variable a, b and c
        int a, b, c;

        Scanner input=new Scanner(System.in);

        //Take user input for a, b, and c.
        System.out.print("Enter value of a: ");
        a=input.nextInt();

        System.out.print("Enter value of b: ");
        b=input.nextInt();

        System.out.print("Enter value of c: ");
        c=input.nextInt();
        
        // Integer operations
        int result1 = a + b * c;  
        int result2 = a * b + c;  
        int result3 = c + a / b;  
        int result4 = a % b + c; 

        // Printing results
        System.out.println("The results of Int Operations are "+ result1 +","+ result2 +","+ result3 + " and "+ result4);
        input.close();
    }
}
  
     