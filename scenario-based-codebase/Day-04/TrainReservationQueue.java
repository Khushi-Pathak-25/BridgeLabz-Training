/* 12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.Scanner;

public class TrainReservationQueue{

    public static void main(String [] args){
	
	    Scanner input = new Scanner (System.in);
		int choice;
		int totalSeats = 10;
		
		while (true) {
			
			System.out.println("\n================================");
		    System.out.println("Welcome to ticket booking system");
			System.out.println("================================");
		    System.out.println("Enter 1 for book seat");
			System.out.println("---------------------------------");
		    System.out.println("Enter 2 for check available seats");
			System.out.println("---------------------------------");
		    System.out.println("Enter 3 for Exit");
			System.out.println("---------------------------------");
		    System.out.println("Enter your choice");
		    choice = input.nextInt();
		   
		    switch(choice){
		   
		    case 1 :
			    if(totalSeats>0){
				   System.out.println("Now your seat Confirmed !!! \n");
				   totalSeats--;
				}
				else{
				    System.out.println("No seat available !!!");
					break; // break loop
				}
				break;
				
			case 2 :
                System.out.println("Total available seats are : "+totalSeats);
                break;

            case 3 :
                System.out.println("Thankyou for using ticket booking system \n");			
		        input.close();
                return;   //exits program 
				
			
            default :
                System.out.println("Invalid Input ! Please enter valid option \n");
                break;					      
		   
		    }
		   
		}
	}

}