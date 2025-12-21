import java.util.Scanner;

public class YoungestAndTallestFriend {

    // Create method to find the youngest friend
    public static int findYoungest(int[] age) {
	
	    // set index to 0 as youngest friend is on 0 index
        int youngestIndex = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Create method to find the tallest friend
    public static int findTallest(double[] height) {
	
	    // set index to 0 as tallest friend is on 0 index
        int tallestIndex = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);

        // Store names of friends in String array
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Create arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // Take user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            height[i] = input.nextDouble();
        }

        // Find youngest and tallest by mathods call 
        int youngestIndex = findYoungest(age);
        int tallestIndex = findTallest(height);

        // Display results
        System.out.println("\nYoungest Friend : " + names[youngestIndex]);
        System.out.println("Tallest Friend : " + names[tallestIndex]);

        input.close();
    }
}
