
import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int[] marks = new int[5];

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }

        // Calculate average
        int average = total / 5;

        // Grade assignment using switch
        char grade;
        switch (average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Output result
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}
