import java.util.Scanner;

public class MaximumOfThree {

    // emthod to take integer input
    public static int takeInput(Scanner input) {
        return input.nextInt();
    }

    // method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int maximum = a;

        if (b > maximum) {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }

        return maximum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
		// take user inputs 
        System.out.print("Enter first number: ");
        int num1 = takeInput(input);

        System.out.print("Enter second number: ");
        int num2 = takeInput(input);

        System.out.print("Enter third number: ");
        int num3 = takeInput(input);
        
		// method calling
        int maximum = findMaximum(num1, num2, num3);

        // display result
        System.out.println("Maximum of the three numbers is: " + maximum);

        input.close();
    }
}
