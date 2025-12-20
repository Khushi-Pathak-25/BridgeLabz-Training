import java.util.Scanner;

public class BMIOneDArray{

    public static void main(String[] args) {
  
        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        // 1--Get value of number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPerson = input.nextInt();

        // 2--Create arrays
        double[] height = new double[numberOfPerson];
        double[] weight = new double[numberOfPerson];
        double[] bmiOfPerson = new double[numberOfPerson];
        String[] status = new String[numberOfPerson];

        // 3--Take height and weight
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter height : (in cm): ");
            height[i] = input.nextDouble()/100;

            System.out.print("Enter weight (in kg): ");
            weight[i] = input.nextDouble();
        }

        // 3--Calculate BMI and status of person
        for (int i = 0; i < numberOfPerson; i++) {
            bmiOfPerson[i] = weight[i] / (height[i] * height[i]);

            if (bmiOfPerson[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmiOfPerson[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmiOfPerson[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // 4--Output 
        System.out.println("\nBMI Report");
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + height[i] + " m");
            System.out.println("Weight : " + weight[i] + " kg");
            System.out.println("BMI    : " + bmiOfPerson[i]);
            System.out.println("Status : " + status[i]);
            System.out.println();
        }
        
        input.close();
    }
}
