import java.util.Scanner;

public class StudentVoteChecker {

    // Create method to check whether a student can vote
    public boolean canStudentVote(int age) {

        // Validate negative age 
        if (age < 0) {
            return false;
        }

        // Check voting eligibility criteria 
        if (age >= 18) {
            return true;
        } 
		else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create array to store ages of 10 students
        int[] ages = new int[10];

        // Create object of StudentVoteChecker class
        StudentVoteChecker obj = new StudentVoteChecker();

        // Loop to take input and check voting eligibility criteria
        for (int i = 0; i < ages.length; i++) {
		
            // Take ages from user
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Create variable and call method via object 
            boolean canVote = obj.canStudentVote(ages[i]);

            // Display result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } 
			else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}
