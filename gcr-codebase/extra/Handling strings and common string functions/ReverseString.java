import java.util.Scanner;

public class ReverseString {

    //method to reverse a string
    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        String reversed = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            reversed = reversed + ch[i];
        }

        return reversed;
    }

    public static void main(String[] args) {
	    // create Scanner class object
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = obj.nextLine();

        String result = reverseString(input);

        System.out.println("Reversed string: " + result);
    }
}
