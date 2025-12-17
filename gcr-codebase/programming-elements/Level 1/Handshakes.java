import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Formula to calculate maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
