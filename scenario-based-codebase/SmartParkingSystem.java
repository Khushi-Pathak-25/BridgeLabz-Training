//  Parking Lot Gate System 🚗

import java.util.Scanner;

public class SmartParkingSystem{

    public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int totalOccupancy = 5, occupancy = 0;
	    int value ;
		
	    while(occupancy < totalOccupancy ){
	
	    System.out.println("Enter 1 for Park Vehicle");
		System.out.println("Enter 2 for Exit Vehicle");
		System.out.println("Enter 3 for Show Occupancy");
		System.out.println("Enter 4 for Exit System");
		System.out.println("Enter your choice");
		value = input. nextInt();
		
		    switch (value){
		
		        case 1 :{
			        if(occupancy <= totalOccupancy){
				        occupancy++;	
					    System.out.println("Vehicle parked successfully");
						System.out.println("------------------------------------------");
						break;
				
				    }
				    else {
				        System.out.println("Parking is Full !  Can't park any vehicle.");
						System.out.println("-------------------------------------------------");
					    break;
				    }
			    }
			
			    case  2 : {
			        occupancy --;
				    System.out.println("Vehicle exit successfully");
					System.out.println("-------------------------------------------------");
				    break;
			    }
			
			    case 3 : {
				    System.out.println ("Occupied Parking :"+ occupancy);
					System.out.println("Available Parking: " + (totalOccupancy - occupancy));
					System.out.println("-------------------------------------------------");
				    break;	
			    }
			
			    case 4 : {
			        System.out.println("Thankyou Visit Again !...Exit System");
					System.out.println("-------------------------------------------------");
				    return ;
				
			    }
		    
			    default : {
			        System.out.println("Please Enter the valid option");	
					System.out.println("-------------------------------------------------");
		        }
		    }
		
		}
	    input.close();
	}

}