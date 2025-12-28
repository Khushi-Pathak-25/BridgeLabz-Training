package com.constructors.levelone;

import java.util.Scanner;
public class Vehicle {

	// Instance Variables: ownerName, vehicleType.
	String ownerName;
	String vehicleType;
	
	// Class Variable: registrationFee
    static double registrationFee = 1000.0;
    
    // constructor
    Vehicle(String ownerName, String vehicleType){
    	this.ownerName= ownerName;
    	this.vehicleType= vehicleType;
    }
    
    //  instance method 
    public void displayVehicleDetails() {
    	System.out.println("Owner Name : "+ ownerName);
    	System.out.println("Vehicle Type : "+ vehicleType);
    	System.out.println("Registration Fee : "+registrationFee);
    	System.out.println("----------------------------------------------");
    }
    // class method updateRegistrationFee()
    public static void  updateRegistrationFee(double newRegistrationFee) {
    	registrationFee = newRegistrationFee;
    }
    
    // main method
    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
		
		// take inputs
		System.out.println("Enter Owner Name : ");
		String ownerName = input.nextLine();
		
		System.out.println("Enter Vehicle Type: ");
		String vehicleType = input.nextLine();
		
		Vehicle v1 = new Vehicle (ownerName, vehicleType);
		v1.displayVehicleDetails();
		
		Vehicle.updateRegistrationFee(2000.0);
		Vehicle v2 = new Vehicle (ownerName, vehicleType);
		v2.displayVehicleDetails();
		
		input.close();
    }
}
