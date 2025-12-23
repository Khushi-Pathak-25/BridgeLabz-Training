import java.util.*;

public class CompareCharArray {

    //Method without using toCharArray()
    public static char[] getCharsManually(String str) {

        char[] characters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        return characters;
    }

    //Method to compare two char arrays
    public static boolean compareCharArrays(char arr1[], char arr2[]) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i=0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

		//Create scanner class object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the string: ");
        String str = input.next();

        // User-defined method result
        char[] userArray = getCharsManually(str);

        // Built-in method result
        char[] builtInArray = str.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(userArray, builtInArray);

        // Display results
        System.out.print("Characters using user-defined method: ");
		for (int i = 0; i < userArray.length; i++) {
			System.out.print(userArray[i] + " ");
		}

        System.out.print("\nCharacters using toCharArray(): ");
        for (int i = 0; i < builtInArray.length; i++) {
			System.out.print(builtInArray[i] + " ");
		}

        if(result) {
            System.out.println("\nBoth character arrays are Same.");
        } 
		else {
            System.out.println("\nBoth character arrays are Different.");
        }

        input.close(); //closing scanner stream
    }
}
