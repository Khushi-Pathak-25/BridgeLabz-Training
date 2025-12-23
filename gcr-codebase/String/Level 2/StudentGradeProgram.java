import java.util.Scanner;

public class StudentGradeProgram {

    // 1.Generate random 2-digit PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        return scores;
    }

    // 2. Calculate total, average and percentage
    public static double[][] calculateResult(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // 3. Calculate grade based on percentage
    public static String[][] calculateGrade(double[][] result) {
        int students = result.length;
        String[][] grade = new String[students][1];

        for (int i = 0; i < students; i++) {
            double percent = result[i][2];

            if (percent >= 80)
                grade[i][0] = "A";
            else if (percent >= 70)
                grade[i][0] = "B";
            else if (percent >= 60)
                grade[i][0] = "C";
            else if (percent >= 50)
                grade[i][0] = "D";
            else if (percent >= 40)
                grade[i][0] = "E";
            else
                grade[i][0] = "R";
        }
        return grade;
    }

    // 4. Display scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] result, String[][] grade) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i][0]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResult(scores);
        String[][] grade = calculateGrade(result);

        displayScorecard(scores, result, grade);

        input.close();
    }
}
