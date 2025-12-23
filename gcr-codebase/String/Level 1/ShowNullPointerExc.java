import java.util.*;

public class ShowNullPointerExc {

    //Method to generate NullPointerException
    public static void generateException() {

        String text = null;

        // It will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {

        String text = null;   // initializing to null

        try {
			//it will give exception
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("There is a NullPointerException.");
			System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Calling method to generate exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        }
        catch (NullPointerException e) {
            System.out.println("Exception in generateException() method.");
        }

        // Call method to handle exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
