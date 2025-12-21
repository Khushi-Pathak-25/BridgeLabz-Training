import java.util.Scanner;

public class BMICalculator {

    // Create method to calculate BMI and store BMI in the 3rd column
    public static void calculateBMI(double[][] data) {

        for (int i=0; i< data.length; i++) {
		
            // weight in kg
            double weight = data[i][0];  
            // height in cm			
            double heightCm = data[i][1];     
			// convert height in meter
            double heightMeter = heightCm / 100;
            // calculate BMI
            double bmi = weight / (heightMeter * heightMeter);
			// store BMI
            data[i][2] = bmi;                 
        }
    }

    // Create method to determine BMI status
    public static String[]determineBMIStatus(double[][] data) {
	
        String[]statusOfPerson = new String[data.length];

        for (int i=0; i<data.length; i++) {
		
		    // Storing value in variable
            double bmi = data[i][2];

            if (bmi<=18.4) {
                statusOfPerson[i] = "Underweight";
            } 
			else if (bmi >= 18.5 &&  bmi <= 24.9) {
                statusOfPerson[i] = "Normal";
            } 
			else if (bmi >= 25.0 && bmi <= 39.9) {
                statusOfPerson[i] = "Overweight";
            } 
			else {
                statusOfPerson[i] = "Obese";
            }
        }
        return statusOfPerson;
    }

    public static void main(String[] args) {
        
		// Create Scanner class object 
        Scanner input = new Scanner(System.in);

        // number of persons = 10 and 3 columns --> weight,height,BMI
        double[][] personsData = new double[10][3];

        // Taking user input
        for (int i=0; i<personsData.length; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + " : ");
            personsData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + " : ");
            personsData[i][1] = input.nextDouble();
        }

        // Calculate BMI of person
        calculateBMI(personsData);

        // Get BMI Status of person
        String[] bmiStatus = determineBMIStatus(personsData);

        // Display results
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");
		
        // Taking loop for printing the output
        for (int i = 0; i < personsData.length; i++) {
            System.out.println(
                (i + 1)+" "+
                personsData[i][0]+" "+
                personsData[i][1]+" "+
                personsData[i][2]+" "+
                bmiStatus[i]
            );
        }

        input.close();
    }
}
