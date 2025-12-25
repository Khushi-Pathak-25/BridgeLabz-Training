import java.util.Scanner;

public class PrimeNumberChecker {

    // method to check whether a number is prime
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } 
		else {
            System.out.println(number + " is Not a Prime Number.");
        }

        input.close();
    }
}
