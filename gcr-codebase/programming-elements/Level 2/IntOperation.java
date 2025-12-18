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
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
  
     