import java.util.Scanner;

public class VotingEligibilityProgram {

    // method to generate ages of n students
    // ages are taken from user (2-digit ages allowed)
    public static int[] generateAges(int number, Scanner input) {

        int[] ages = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility
    // Returns 2D array [age , true/false]
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false";   // negative age cannot vote
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";    // can vote
            } 
            else {
                result[i][1] = "false";   // cannot vote
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("Age\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // fixed as per question
        int numberOfStudents = 10; 

        // Get ages of students
        int[] ages = generateAges(numberOfStudents, input);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayResult(result);

        input.close();
    }
}
