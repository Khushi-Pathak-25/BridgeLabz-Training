/*15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/

import java.util.Scanner;

public class LibraryReminderApp{

    public static void main (String []args){
	
	    Scanner input = new Scanner (System.in);
		
		int finePerDay = 5;
		int totalFine = 0;
		
		System.out.println("======================================");
        System.out.println("   Rohan's Library Reminder App      ");
        System.out.println("======================================");
	    
		// Repeat for 5 books using for-loop
	    for(int i =1 ; i<=5 ; i++ ){
		    System.out.println("\n-------------- BOOK " + i + " ---------------");
			
		    System.out.print("Enter return day (day number):");
			int returnDate = input.nextInt();
			System.out.print("Enter due day (day number):");
			int dueDate = input.nextInt();
			
			if(returnDate>dueDate){
			    int lateDays = returnDate - dueDate;
				int fine = lateDays*finePerDay;	
				totalFine += fine;

                System.out.println("Book returned late by " + lateDays + " days");
                System.out.println("Fine for this book: Rs. " + fine);				
			}
			else{
			    System.out.println("Book returned on time ");
                System.out.println("Fine for this book: Rs. 0");
            }
        }
	    System.out.println("\n======================================");
        System.out.println("Total Fine to be Paid: Rs. " + totalFine);
        System.out.println("======================================");
        System.out.println("Thank you! Please return books on time ");

        input.close();	
	
	}

}