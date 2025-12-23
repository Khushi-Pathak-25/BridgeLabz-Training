import java.util.Random;
import java.util.Scanner;

public class ScoreCard{

    // Create method for generating random 2-digit scores for Physics, Chemistry, and Maths for each student
    public static int[][] generateRandomScores(int students) {
	
	    // Create Random object
        Random random = new Random();
		
        // Create 2D array for physics, chemistry, and maths scores
        int[][] score = new int[students][3];
		
        // Taking random score between 50 and 100
        for (int i = 0; i < students; i++) {
		    // Physics
            score[i][0] = 50 + random.nextInt(51); 
			// Chemistry
            score[i][1] = 50 + random.nextInt(51); 
			// Maths
            score[i][2] = 50 + random.nextInt(51); 
        }
        return score;
    }

    // Create method to calculate the total, average, and percentage
    public static double[][] calculateScores(int[][] score) {
	
        // Taking array for total, average, percentage
        double[][] result = new double[score.length][4]; 
		
        for (int i = 0; i < score.length; i++) {
		    // Calculating total,average and percentage   
            int total = score[i][0] + score[i][1] + score[i][2]; 
            double average = total / 3.0; 
            double percentage = (total / 3.0);            
            // Round off the values to 2 decimal places
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-10s | %8s | %10s | %8s | %10s | %10s | %11s%n",
            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s | %8d | %10d | %8d | %10.2f | %10.2f | %10.2f%%%n",
                "Student " + (i + 1),
                scores[i][0],
                scores[i][1],
                scores[i][2],
                results[i][0],
                results[i][1],
                results[i][2]);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[][] studentScores = generateRandomScores(numStudents);
        double[][] studentResults = calculateScores(studentScores);

        displayScorecard(studentScores, studentResults);
        input.close();
    }
}