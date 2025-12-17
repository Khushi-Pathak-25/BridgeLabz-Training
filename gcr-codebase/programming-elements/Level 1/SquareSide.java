import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking perimeter of the square
        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Perimeter of square = 4 × side
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}
