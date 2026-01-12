/*4. CallCenter – Customer Queue Manager (Queue + HashMap)
Story: In a telecom call center, customers are queued based on the time of call. Priority
customers have a special queue. A HashMap keeps track of the number of times each user has
called this month.
Requirements:

● Use Queue for managing incoming calls.
● Use HashMap for customer data.
● Priority Queue for VIP customers.*/

package com.daytwo.callcenter;

import java.util.Scanner;

public class MainCallCenter {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
	    CallCenter callcenter = new CallCenter();
	    
	    // create customers
	    Customer c1 = new Customer ("Khushi", false);
	    Customer c2 = new Customer ("Shagun", true); // vip
	    Customer c3 = new Customer ("Pawan", false);
	    Customer c4 = new Customer ("Shagun", true); // vip call again
	    
	    // add calls
	    callcenter.addCall(c1);
	    callcenter.addCall(c2);
	    callcenter.addCall(c3);
	    callcenter.addCall(c4);
	    
	    System.out.println("===================== WELCOME TO CALLCENTER ======================");
	    // serve calls
	    System.out.println("The call center is serving call: "+callcenter.serveCall());
	    System.out.println("The call center is serving call: "+callcenter.serveCall());
	    System.out.println("The call center is serving call: "+callcenter.serveCall());
	    System.out.println("The call center is serving call: "+callcenter.serveCall());
	    
	    System.out.println("--------------------------------------------------------------------");
	    // get count
	    System.out.println("Khushi called: "+callcenter.getCallCount("Khushi"));
	    System.out.println("Shagun called: "+callcenter.getCallCount("Shagun"));
	    System.out.println("Pawan called: "+callcenter.getCallCount("Pawan"));
		
	}
}
