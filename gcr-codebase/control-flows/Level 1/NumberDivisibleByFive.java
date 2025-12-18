import java.util.Scanner;

class NumberDivisibleByFive {

    public static void main(String args[]) {
		//Creating Scanner Class object
		Scanner input = new Scanner(System.in);

		//Taking number from user
		System.out.print("\nEnter a number : ");
		int number = input.nextInt();

		//Checking whether a number is divisible by 5
		System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
    }
}