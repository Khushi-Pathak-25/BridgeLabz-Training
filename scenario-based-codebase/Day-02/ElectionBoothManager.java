import java.util.Scanner;

public class ElectionBoothManager {
    
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int vote1=0, vote2=0, vote3=0;

        while (true) {
            System.out.print("Enter age (Enter -1 to stop voting): ");
			
            int age = input.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Eligibility check
            if (age < 18) {
                System.out.println("Not eligible to vote.\n");
            } 
			else {
                System.out.println("Eligible to vote.");
                System.out.print("Enter your vote (1 / 2 / 3): ");
                int vote = input.nextInt();

                if (vote == 1) {
                    vote1++;
                }
				else if (vote == 2) {
                    vote2++;
                } 
				else if (vote == 3) {
                    vote3++;
                } 
				else {
                    System.out.println("Invalid vote!");
                }
                System.out.println();
            }
        }

        // Display final result
        System.out.println("----- Election Result -----");
        System.out.println("Candidate 1 Votes: " + vote1);
        System.out.println("Candidate 2 Votes: " + vote2);
        System.out.println("Candidate 3 Votes: " + vote3);

        input.close();
    }
}
