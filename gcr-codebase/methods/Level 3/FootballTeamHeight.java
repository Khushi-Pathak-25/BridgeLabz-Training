import java.util.Arrays;

public class FootballTeamHeight {

    // Create method to generate random heights (150 cm to 250 cm)
    public static int[] generateHeightsOfplayers() {
	
        // Create array height of size 11
        int[] heights = new int[11];
        
		// Taking random heights (150 cm to 250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i]=(int)(Math.random() * 101) + 150;
        }
		
        return heights;
    }

    // Create method to find sum of all heights
    public static int findSumOfHeight(int[] heights) {
        int sum = 0;
		
        for (int h:heights) {
            sum += h;
        }
		
		// return sum of heights
        return sum;
    }

    // Create method to find mean height
    public static double findMeanOfHeight(int[] heights) {

        int sum=findSumOfHeight(heights);
		
        return (double)sum/heights.length;
    }

    // Create method to find shortest height
    public static int findShortestHeight(int[] heights) {
	
        int min = heights[0];
		
        for (int h:heights) {
            if (h < min) {
                min = h;
            }
        }
        // shortest height
        return min;
    }

    // Method to find tallest height
    public static int findTallestHeight(int[] heights) {

        int max = heights[0];

        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        // tallest height
        return max;
    }

    public static void main(String[] args) {

        // Generate heights for 11 players
        int[] heights = generateHeightsOfplayers();

        System.out.println("Heights of Football Team Players (in cm ):");
		// Display heights
        System.out.println(Arrays.toString(heights));

        // Calculate values
        int sum = findSumOfHeight(heights);
        double mean = findMeanOfHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        // Display results
        System.out.println("Total Height : " + sum + " cm");
        System.out.println("Mean Height : " + mean + " cm");
        System.out.println("Shortest Player Height : " + shortest + " cm");
        System.out.println("Tallest Player Height : " + tallest + " cm");
    }
}
