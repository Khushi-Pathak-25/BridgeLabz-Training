import java.util.Scanner;

public class ArrayValues{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //array to store maximum 10 numbers
        double[] arr = new double[10];

        //variable to store sum
        double total = 0.0;

        //index for array
        int index = 0;

        //loop to take user input
        while (true) {

            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            // break if user enters 0 or negative number
            if (number <= 0) {
                break;
            }

            // break if array full
            if (index == 10) {
                break;
            }

            // store value in array
            arr[index] = number;
            index++;
        }

        //print numbers and calculate sum
        System.out.println("Entered numbers are: ");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total = total + arr[i];
        }

        //print total sum
        System.out.println("\nSum of all numbers = " + total);

        input.close();
    }
}
