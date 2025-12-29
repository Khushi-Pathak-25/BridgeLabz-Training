/* 8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.*/

import java.util.Scanner;

public class ShopkeeperDiscountDashboard{
    
	public static final double DISCOUNT_10 = 0.1;
	public static final double DISCOUNT_20 = 0.2;
	public static final double DISCOUNT_30 = 0.3;
	public static final double GST_RATE = 0.05;

    public static void main(String[]args){
	
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of items");
		int numberOfItems = input.nextInt();
	
	    double baseAmount = 0.0;
		double discount = 0.0; 
		double gstAmount =0.0;
        	
        // Input item prices using for-loop
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter price of item " + i + ": ");
            baseAmount += input.nextDouble();
        }
		
		if(baseAmount > 10000){
		   
		   //calculation 
		   discount = DISCOUNT_30 * baseAmount;
		   gstAmount = baseAmount * GST_RATE;
		   
		   // output
		   System.out.println("\n---------Bill Details------------");
		   System.out.println("Base Amount of Items: "+baseAmount);
		   System.out.println("Discount on Items :"+ discount);
		   System.out.println("GST on Items: "+gstAmount);
		   System.out.println("Total Bill: "+(baseAmount-discount+gstAmount));
		   System.out.println("-----------------------------------");
		}
		else if(baseAmount > 5000 && baseAmount <= 10000){
		   
		   //calculation
		   discount = DISCOUNT_20 * baseAmount;
		   gstAmount = baseAmount * GST_RATE;
		   
		   //output
		   System.out.println("\n------------Bill Details----------------");
		   System.out.println("Base Amount of Items: "+baseAmount);
		   System.out.println("Discount on Items :"+ discount); 
		   System.out.println("GST on Items: "+gstAmount);
		   System.out.println("Total Bill: "+(baseAmount-discount+gstAmount));
		   System.out.println("-------------------------------------------");
		}
		else if(baseAmount > 2000 && baseAmount <= 5000){
			
		   // calculation	
		   discount = DISCOUNT_10 * baseAmount;
		   gstAmount = baseAmount * GST_RATE;
		   
		   // output
		   System.out.println("\n--------------Bill Details----------------");
		   System.out.println("Base Amount of Items: "+baseAmount);
		   System.out.println("Discount on Items :"+ discount);
		   System.out.println("GST on Items: "+gstAmount);
		   System.out.println("Total Bill: "+(baseAmount-discount+gstAmount));
		   System.out.println("---------------------------------------------");
		}
		else {
		   // calculation
		   gstAmount = baseAmount * GST_RATE;
		   
		   // output
		   System.out.println("\n-----------Bill Details------------");
		   System.out.println("Base Amount of Items: "+baseAmount);
		   System.out.println("Discount on Items :"+ discount);
           System.out.println("GST on Items: "+gstAmount);		   
		   System.out.println("Total Bill: "+(baseAmount-discount+gstAmount));
           System.out.println("--------------------------------------");		   
		}
        input.close();
    }
}