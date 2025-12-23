import java.util.Scanner;

public class NumberFormatExceptionProgram {

    // Method to generate NumberFormatException (no handling)
    public static void generateException(String str) {
        // Trying to convert str into number
        // If str does not contain digits, exception occurs
		// Integer.parseInt is use to extract number from str (ex="123"-->123)
        int number = Integer.parseInt(str);
        System.out.println("Number is: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String str) {
        try {
            // Again trying to convert str into number
            int number = Integer.parseInt(str);
            System.out.println("Number is: " + number);
        } 
		// catch exception
        catch (NumberFormatException e) {
            // This block executes if str is not a valid number
            System.out.println("NumberFormatException caught");
        } 
        catch (RuntimeException e) {
            // Generic runtime exception handler
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Calling method to generate exception
        // generateException(text); 

        // Calling method to handle exception
        handleException(text);

        input.close();
    }
}
