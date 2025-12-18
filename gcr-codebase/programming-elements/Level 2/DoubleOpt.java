import java.util.Scanner;

class DoubleOpt {

    public static void main(String[]args){

        //Declare variable a, b and c
        double a, b, c;

        Scanner input=new Scanner(System.in);

        //Take user input for a, b, and c.
        System.out.print("Enter value of a: ");
        a=input.nextDouble();

        System.out.print("Enter value of b: ");
        b=input.nextDouble();

        System.out.print("Enter value of c: ");
        c=input.nextDouble();
        
        // Double operations
        double result1 = a + b * c;  
        double result2 = a * b + c;  
        double result3 = c + a / b;  
        double result4 = a % b + c; 

        // Printing results
        System.out.println("The results of Int Operations are "+ result1 +","+ result2 +","+ result3 + " and "+ result4);

        input.close();
    }
}
  
     