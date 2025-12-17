import java.util.Scanner;
class DiscountOnStudentFee {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //Taking user input with the help of Scanner class object.
    System.out.println("Enter Student Fee");
    int fee=input.nextInt();
    System.out.println("Enter Discount Rate");
    int discountPercent=input.nextInt();
    
    //Calculate discount and final fee
    double discount= (fee * discountPercent) / 100;
    double finalFee = fee - discount;

    System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalFee);
    }
}