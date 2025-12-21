import java.util.Arrays;

public class RandomNumber{

    //Create method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
	
        // Create number array of size given by user
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random number 4 digit random numbers  between 1000 and 9999
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
		
        return numbers;
    }

    // Create method to find average, minimum and maximum of random numbers
    public static double[] findAverageMinMax(int[] numbers) {
        
		// Declare variables and assign values
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
		// for calculate sum , min and max 
        for (int i=0; i<numbers.length; i++) {
      
            sum+= numbers[i];
			
            // using Math class function
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        // calculate average of numbers
        double average = (double)sum/numbers.length;

        // index 0 for average, index 1 for min, index 2 for max
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        // Generate 5 four digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers : ");
		// Display numbers by toString method
        System.out.println(Arrays.toString(randomNumbers));

        // for average,min and max
        double[] output = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("\nAverage Value: " + output[0]);
        System.out.println("Minimum Value: " + output[1]);
        System.out.println("Maximum Value: " + output[2]);
    }
}
