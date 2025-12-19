import java.util.Scanner;

public class MeanHeightOfplayers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

                // Create array height of 11 players
                 double heights[]=new double[11];

                // Declaring and initializing variable sum
                  double sum = 0.0;
                  
                 // Take height input from the user
                 System.out.println("Enter the heights of 11 football players:");
                 for (int i = 0; i < heights.length; i++) {
                     System.out.print("Height of player " + (i + 1) + ": ");
                     heights[i] = input.nextDouble();
                     sum = sum + heights[i];   
                 }
                  
                 // Calculate mean height
                 double mean = sum / 11;

                 // Print the mean height
                 System.out.println("Mean height of the football team is: " + mean);

                 input.close();
         }

   }

    
