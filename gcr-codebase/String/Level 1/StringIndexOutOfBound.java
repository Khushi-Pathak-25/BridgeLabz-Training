import java.util.*;

public class StringIndexOutOfBound {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
	    // accessing length, (index starts from 0 to length-1)
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Accessing index outOfBound
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled.");
			System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

		//Create scanner class object
        Scanner input = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a string : ");
        String text = input.next();

        //Call method for generating exception
        System.out.println("Generating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException() method.");
        }

        //Call method to handle exception
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);

        input.close();
    }
}
