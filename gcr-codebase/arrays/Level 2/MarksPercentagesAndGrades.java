import java.util.Scanner;

public class MarksPercentagesAndGrades{

    public static void main(String[] args) {
  
        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        // Take input number of students
        System.out.print("/nEnter number of students : ");
        int number = input.nextInt();
    
        // Create arrays
        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];
        
        // Take marks input
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextInt();
            if (physics[i] < 0) {
                System.out.println("Marks cannot be negative.Re-enter!");
                i--;
                continue;
            }
            
            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Marks cannot be negative.Re-enter!");
                i--;
                continue;
            }
            
            System.out.print("Maths: ");
            maths[i] = input.nextInt();
            if (maths[i] < 0) {
                System.out.println("Marks cannot be negative. Re-enter!");
                i--;
                continue;
            }

            // Calculate percentage of students
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Assign grade accor. to percentage 

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } 
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } 
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } 
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            }
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } 
            else {
                grade[i] = 'R';
            }
            
            }

            // Display results of students
            System.out.println("\nStudent Result");
            for (int i = 0 ; i < number ; i++) {
                System.out.println("Student " + (i + 1));
                System.out.println("Physics: " + physics[i]);
                System.out.println("Chemistry: " + chemistry[i]);
                System.out.println("Maths: " + maths[i]);
                System.out.println("Percentage: " + percentage[i] + "%");
                System.out.println("Grade: " + grade[i]);
                System.out.println();
        }

        input.close();
    }
}









            