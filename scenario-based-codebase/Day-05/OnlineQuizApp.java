/*17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/

import java.util.Scanner;

public class OnlineQuizApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] questions = {
            "1. What is the size of char in Java?\nA. 2 bytes\nB. 4 bytes\nC. 8 bytes",
            "2. When was Java developed?\nA. 1990\nB. 1991\nC. 1992",
            "3. How many types of constructors are there in Java??\nA. four\nB. three\nC. two",
            "4. Which data type stores decimal values?\nA. int\nB. float\nC. char",
            "5. Java is a _____ language.\nA. Low-level\nB. Machine\nC. High-level"
        };

        char[] correctAnswers = {'A', 'B', 'A', 'B', 'C'};
        int score = 0;

        System.out.println("=================================");
        System.out.println("       ONLINE QUIZ STARTED       ");
        System.out.println("=================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            System.out.print("Enter your answer (A/B/C): ");
			// enter user answer
            char userAnswer = input.next().toUpperCase().charAt(0);

            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == correctAnswers[i]) {
                        System.out.println(" Correct Answer!");
                        score++;
                    } else {
                        System.out.println(" Wrong Answer!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! No marks awarded.");
            }

            System.out.println("-----------------------------------------");
        }

        System.out.println("QUIZ COMPLETED!");
        System.out.println("Your Final Score: " + score + "/5");

        input.close();
    }
}
