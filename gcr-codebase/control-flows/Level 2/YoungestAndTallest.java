import java.util.Scanner;

public class YoungestAndTallest{

    public static void main(String[] args){

        // Create Scanner object 
        Scanner input = new Scanner(System.in);

        // Taking age input
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Taking height input
        System.out.print("Enter Amar's height : ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar's height : ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony's height : ");
        int anthonyHeight = input.nextInt();

        // Finding the youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } 
        else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        }
        else {
            System.out.println("Youngest friend is Anthony");
        }

        // Finding the tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } 
        else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } 
        else {
            System.out.println("Tallest friend is Anthony");
        }

        input.close();
    }
}
