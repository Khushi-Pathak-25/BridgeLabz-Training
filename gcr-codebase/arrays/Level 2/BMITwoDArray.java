import java.util.Scanner;

public class BMITwoDArray{

    public static void main(String[] args) {
  
        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        // 1--Get value of number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2--Create arrays
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // 3--Take height and weight
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter height : (in cm): ");
            personData[i][0] = input.nextDouble()/100;

            System.out.print("Enter weight (in kg): ");
            personData[i][1] = input.nextDouble();
        }

        // 3--Calculate BMI and status of person
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // 4--Output 
        System.out.println("\nBMI Report");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " +  personData[i][0] + " m");
            System.out.println("Weight : " +  personData[i][1] + " kg");
            System.out.println("BMI    : " +  personData[i][2]);
            System.out.println("Status : " +  weightStatus[i]);
            System.out.println();
        }
        
        input.close();
    }
}
