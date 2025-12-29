/* 9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts. */

import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String [] args){
	
	    Scanner input = new Scanner(System.in);
		
		// store names of students in array
		String names[]= {"Khushi","Aneek","Rashi","Shraddha","Disha","Bhoomika","Aarya",
		                "Yukta","Riya","Harshit"};
										
		
        int totalPresent = 0;
        int totalAbsent = 0;
        
		boolean attendance[]= new boolean [10];
		int i =0;
		
		for(String name : names){
		    System.out.printf("Is %s present? (yes/no): ", name);
		    String result = input.nextLine();
		    if (result.toLowerCase().contains("yes")){			
				attendance[i] = true; 
                totalPresent++; 				
		    }
			else{
			    attendance[i] = false;
			    totalAbsent++; 
			}	
			i++;			
		}
	    
		System.out.println("\n---------- Attendance Report ----------");

        // display result using printf
		
        for (i = 0; i < names.length; i++) {
            System.out.printf("Student: %-10s | Status: %s%n", names[i], attendance[i] ? "Present" : "Absent");
        }

        System.out.println("\n---------- Summary -----------");
        System.out.printf("Total Present: %d%n", totalPresent);
        System.out.printf("Total Absent : %d%n", totalAbsent);
		
		input.close();
    }
}