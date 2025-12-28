package com.constructors.levelone;

import java.util.Scanner;

public class HotelBooking {

	// attributes - guestName, roomType, and nights
	String guestName ;
	String roomType ;
	int nights ;
	
	// Default constructor
	HotelBooking(){
	    guestName = "XYZ";
	    roomType = "Standard";
	    nights = 1;
    }
	
	// Parameterized constructor
	HotelBooking (String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;		
	}
	
	// Copy constructor
	HotelBooking(HotelBooking other){
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	
	// Display method
	public void display() {
		System.out.println("Guest Name -"+guestName +", "+"Room Type -"+roomType+", "+"Nights -"+nights);
	}
	
	// main method
	public static void main(String args[]) {
		HotelBooking b1 = new HotelBooking() ;
		b1.display();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter guest name : ");
		String guestName = input.nextLine() ;
		System.out.println("Enter room type : ");
		String roomType = input.next();
		System.out.println ("Enter stay details : ");
		int nights = input.nextInt();
		
		HotelBooking b2 =new HotelBooking(guestName, roomType, nights );
		b2.display();
		
		HotelBooking b3= new HotelBooking(b2);
		b3.display();
		
	}
}