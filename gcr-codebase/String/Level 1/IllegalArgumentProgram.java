import java.util.Scanner;

public class IllegalArgumentProgram {

    // create method to generate exception(no handling)
    public static void generateException(String str) {
        // if start index > end index
		int startIndex = str.length() - 1; 
        int endIndex = 0;
        String sub = str.substring(startIndex,endIndex);
        System.out.println(sub);
    }

    // create method to handle IllegalArgumentException
    public static void handleException(String str) {
		int startIndex = str.length() - 1; 
        int endIndex = 0;
        try {
            String sub = str.substring(startIndex,endIndex);
            System.out.println(sub);
        } 
		catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
			System.out.println(e.getMessage());
		  // generic runtime exception
        } 
		catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
			System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
		
        handleException(str);       
        System.out.println("Program is running");

        input.close();
    }
}
