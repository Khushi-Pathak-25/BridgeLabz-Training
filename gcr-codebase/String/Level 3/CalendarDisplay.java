import java.util.Scanner;
public class CalendarDisplay {
	
    // create method to get the name of the month
    public static String getMonthName(int month) {
		// create string array months to store month names
        String[] months = {"January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
	// create method to get number of days in month
	public static int getNumberOfDays (int month, int year) {
	    // create integer array to store number of days in particular month
		int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (month == 2 && isLeapYear (year)){
		    // In leap year february has 
		    return 29;		
		}
		return daysInMonth[month-1];
	}
	// create method to get the first day of the month
	public static int getFirstDayOfMonth (int month,int year){
	    int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; 
        return d0;
	
	}
	// create method to print calender
	public static void printCalender(int month, int year){
	    String monthName = getMonthName(month);
		int numberOfDays = getNumberOfDays(month,year);
		int firstDay = getFirstDayOfMonth(month,year);
		
		System.out.println(monthName +" "+ year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		// for spaces
		for(int i=0; i<firstDay; i++){
		    System.out.print("    ");
		}
		for(int i=1; i<=numberOfDays;i++){
		    
			System.out.printf("%3d ", i);
			firstDay++;
			if(firstDay==7){
			    System.out.println();
				firstDay=0;
			}
		}
	}
	public static boolean isLeapYear(int year){
	    if((year % 400==0) || ((year %100!=0) && (year % 4)==0)){
		   return true;
		}
        return false;
	}
	public static void main(String args[]){
	    // Create Scanner class object
	    Scanner input = new Scanner(System.in);
		
        //Take inputs from user		
		System.out.print("\nEnter Month : ");
		int month = input.nextInt();
		
		System.out.print("\nEnter Year : ");
		int year = input.nextInt();
		
		printCalender(month,year);
		
		input.close();
	}
}	