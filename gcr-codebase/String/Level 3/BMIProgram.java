import java.util.Scanner;

public class BMIProgram {

    // b) Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeter = heightCm / 100;

            double bmi = weight / (heightMeter * heightMeter);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // d) Display in tabular format
    public static void displayResult(String[][] result) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" +
                               result[i][1] + "\t\t" +
                               result[i][2] + "\t" +
                               result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a) Take input for 10 persons
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // c) Call methods
        String[][] result = calculateBMI(data);

        // e) Display output
        displayResult(result);

        sc.close();
    }
}
