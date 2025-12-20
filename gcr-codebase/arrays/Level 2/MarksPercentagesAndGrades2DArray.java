import java.util.Scanner;

public class MarksPercentagesAndGrades2DArray {

    public static void main(String[] args) {
        
        //Create Scanner class object
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter number of students: ");
        int students = input.nextInt();
        
        // Create arrays 
        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0 ; i < students ; i++) {

            System.out.println("\nEnter marks for Student : " + (i + 1));
            
            for (int j = 0 ; j < 3 ; j++) {
                // using do-while loop
                do {
                    if (j == 0) System.out.print("Physics: ");
                    if (j == 1) System.out.print("Chemistry: ");
                    if (j == 2) System.out.print("Maths: ");
                    marks[i][j] = input.nextInt();
                }
                // checking for marks
                while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90){
                grade[i] = 'A';
            }
            else if (percentage[i] >= 75){
                grade[i] = 'B';
            }
            else if (percentage[i] >= 60){
                grade[i] = 'C';
            }
            else if (percentage[i] >= 40){
                grade[i] = 'D';
            }
            else{
                grade[i] = 'F';
            }
       
        }
        System.out.println();

        for(int i=0; i<students; i++){
        System.out.println("Percentage of student  "+ (i+1) +" : "+ percentage[i]);
        System.out.println("Grade of student  "+ (i+1) +" : "+ grade[i]+);
        }

        input.close();
    }
}
