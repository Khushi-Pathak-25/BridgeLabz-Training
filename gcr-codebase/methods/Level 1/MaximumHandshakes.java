import java.util.Scanner;

public class MaximumHandshakes {

    // Create static method to calculate handshakes
    static int calculateMaximumHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
	
        // Create Scanner object
        Scanner input = new Scanner(System.in);
		
        // Take input number of students 
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calling method
        int maximumHandshakes = calculateMaximumHandshakes(numberOfStudents);
        
		// Display output
        System.out.println("number of possible handshakes= " + maximumHandshakes);
    }
}
