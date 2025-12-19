import java.util.Scanner;

public class YoungestAndTallest{
    public static void main(String[] args){

        //Creating Scanner class object
        Scanner input = new Scanner(System.in);

        //Array to store friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        //Arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];

        //Taking Input
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of " + names[i]);
            
            System.out.print("Enter Age: ");
            age[i] = input.nextInt();
            
            System.out.print("Enter Height (in cm): ");
            height[i] = input.nextDouble();
        }
        
        //Assuming first friend is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        //Finding Youngest and Tallest
        for (int i = 1; i < 3; i++) {
            // Check youngest
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            // Check tallest
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        //Printing output
        System.out.println("Youngest Friend : " + names[youngestIndex] +" - " + " Age: " + age[youngestIndex]);
        System.out.println("Tallest Friend : " + names[tallestIndex] + " - " + " Height: " + height[tallestIndex] + " cm");

        input.close();
    }
}