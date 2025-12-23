import java.util.Scanner;

public class ArrayIndexOutOfBoundsProgram {

    // method to generate exception (no handling)
    public static void generateException(String[] names) {
	    int invalidLength=names.length+1;
        // Accessing index greater than array length
        System.out.println(names[invalidLength]);
    }

    // method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
		    int invalidLength=names.length+1;
            // Again accessing invalid index
            System.out.println(names[invalidLength]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // This block handles array index error
            System.out.println("ArrayIndexOutOfBoundsException caught");
			System.out.println(e.getMessage());
        } 
        catch (RuntimeException e) {
            // Generic runtime exception handler
            System.out.println("RuntimeException caught");
			System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter number of names: ");
        int numberOfNames = input.nextInt();
		
         input.nextLine(); // fix : clear buffer

        // Declaring array of names
        String[] names = new String[numberOfNames];

        // Taking names as input
        for (int i = 0; i < numberOfNames; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine(); // will cause the first name to be empty
        }

        // Calling method to generate exception
        // generateException(names);  

        // Calling method to handle exception
        handleException(names);

        input.close();
    }
}
