public class CheckSpringSeason {

    // Create method to check spring season or not
    static boolean isSpring(int month, int day) {
	
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
		// Take command line arguments from user
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		
        // Display output
        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
		}				
        else {
            System.out.println("Not a Spring Season");
		}	
    }
}
