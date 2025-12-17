import java.util.Scanner;
class ConvertHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height in centimeters:");
        double heightInCm = input.nextDouble();

        // Convert cm to total inches
        double totalInches = heightInCm / 2.54;
        // Calculate feet and remaining inches
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightInCm + 
                           " while in feet is " + feet + " and inches is " + inches);
    }
}
