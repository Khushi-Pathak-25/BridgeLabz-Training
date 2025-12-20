import java.util.Scanner;

public class BMIOfPerson{

    public static void main(String[] args) {
  
        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        // Taking inputs
        System.out.print("\nEnter height (in cm) : ");
        double heightCm = input.nextDouble(); 

        System.out.print("\nEnter weight (in kg) : ");      
        double weight = input.nextDouble();
      
        // Convert height from cm to meters
        double heightMeter = heightCm / 100;
    
        // Calculate BMI by using --> BMI = weight / (height * height)
            double bmi = weight / (heightMeter * heightMeter);

        // Print BMI value
        System.out.println("BMI = " + bmi);

        // Evaluating weight status
        if (bmi <= 18.4) {
            System.out.println("Weight Status : Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status : Normal weight");
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } 
        else {
            System.out.println("Weight Status: Obese");
        }
        
       input.close();
    }
}        
        
   