public class OTPGenerator{

    // Create method to generate a 6-digit random OTP
    public static int generateOTP() {
	
        // Generates number between 100000 and 999999 (6- digit number)
        int otp = (int)(Math.random()*900000)+100000;
        return otp;
    }

    // Create method to check OTPs are unique or not 
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
				    // duplicate found
                    return false; 
                }
            }
        }
		// all OTPs are unique
        return true;
    }

    // main method
    public static void main(String[] args) {
        
		// Create array of size 10 to store 10 random otps
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display all 10 otps
        System.out.println("OTPs are  :");
        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + " : " + otps[i]);
        }

        // Check uniqueness of all otps and print result
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nDuplicate OTP found.OTPs are not unique.");
        }
    }
}
